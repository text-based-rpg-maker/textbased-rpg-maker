package com.textbasedrpgmaker.core.scenario;

import java.util.Scanner;

import com.textbasedrpgmaker.core.item.Inventory;
import com.textbasedrpgmaker.core.item.Item;

public abstract class Location implements ScenarioState {
	
	private Item item;
	private ScenarioState nextStep;

	public Location(){
	}
	
	public Location(Item item){
		this.item = item;
	}
	
	@Override
	public abstract void showDescription();

	@Override
	public abstract ScenarioState northLocation();
	
	@Override
	public abstract ScenarioState southLocation();
	
	@Override
	public abstract ScenarioState eastLocation();
	
	@Override
	public abstract ScenarioState westLocation();
	
	@Override
	public void behavior(){
		showDescription();
		showItem();
		showOptions();
	}
	
	@Override
	public void move(ScenarioState state){
		if (state.isLocked() && !Inventory.getItens().contains(state.unlockingItem())){
			System.out.println("O caminho está bloqueado!");
			nextStep = this;
		} else {
			System.out.println("Indo para outro cenário!");
			nextStep = state;
		}
	}
	
	@Override
	public ScenarioState getNextStep() {
		return nextStep;
	}

	@Override
	public ScenarioState getItem() {
		if(!Inventory.getItens().contains(this.item)){
			Inventory.addItemToInventory(this.item);
			System.out.println("O item " + this.item.getName() + " foi adicionado ao inventário");
		} else {
			this.item = null;
		}
		return this;
	}

	@Override
	public void showItem() {
		if(item != null)
			System.out.println(item.getDescription());
	}
	
	private boolean canMove(ScenarioState scenario) {
		if(scenario == null) {
			System.out.println("Não posso mover daqui");
			return false;
		} else {
			move(scenario);
			return true;
		}
	}
	@Override
	public void showOptions() {
		boolean exit;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String choice = "null";
		
		do {
			exit = true;
			System.out.println("Escolha alguma opção: ");
			System.out.println("a) Ir para o norte.");
			System.out.println("b) Ir para o sul.");
			System.out.println("c) Ir para o oeste.");
			System.out.println("d) Ir para o leste.");
			System.out.println("e) Pegar item.");
			
			choice = keyboard.nextLine();
			
			switch(choice) {
			case "a":
				exit = canMove(northLocation());
				break;
			case "b":
				exit = canMove(southLocation());
				break;
			case "c":
				exit = canMove(westLocation());
				break;
			case "d":
				exit = canMove(eastLocation());
				break;
			case "e":
				exit = false;
				if (this.item != null)
					this.getItem();
				else
					System.out.println("Não há nada para pegar");
				break;
			default:
				System.out.println("Escolha uma opção válida");
				exit = false;
				break;
		}
			
		} while(!exit);
		
	}

	@Override
	public Item unlockingItem() {
		return null;
	}

	@Override
	public boolean isLocked() {
		return false;
	}
}