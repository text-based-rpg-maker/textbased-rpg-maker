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
	
	public void behaviour(){
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
	
	public boolean hasItem() {
		if(Inventory.getItens().contains(this.item))
			return true;
		else
			return false;
	}

	@Override
	public ScenarioState getItem() {
		if(!hasItem()){
			Inventory.addItemToInventory(this.item);
			System.out.println("O item " + this.item.getName() + " foi adicionado ao inventário");
		} else {
			this.item = null;
		}
		return this;
	}

	@Override
	public void showItem() {
		if(item != null && !hasItem())
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
	
	public abstract String optionA();
	public abstract String optionB();
	public abstract String optionC();
	public abstract String optionD();
	public abstract String optionItem();

	
	public void showMenu() {
		System.out.println("Escolha alguma opção: ");
		System.out.println("a) " + optionA());
		System.out.println("b) " + optionB());
		System.out.println("c) " + optionC());
		System.out.println("d) " + optionD());
		if(this.item != null && !hasItem())
			System.out.println("e) " + optionItem());
	}
	
	public boolean chooseOption(boolean exit){
		 		
		String choice = "null";
		
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
	
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
				if (this.item != null && !hasItem())
					this.getItem();
				else
					System.out.println("Não há nada para pegar");
				break;
		default:
				System.out.println("Escolha uma opção válida");
				exit = false;
				break;
		}
		return exit;
			
		} 
	@Override
	 	public void showOptions() {
	 		boolean exit;
	 		
	 		do {
	 			exit = true;
				showMenu();
	 			exit = chooseOption(exit);
	 		}while(!exit);
		
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