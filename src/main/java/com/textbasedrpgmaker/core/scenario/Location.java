package com.textbasedrpgmaker.core.scenario;

import java.util.Scanner;

import com.textbasedrpgmaker.core.item.Inventory;
import com.textbasedrpgmaker.core.item.Item;

public abstract class Location {
	
	private Item item;
	private Location nextStep;

	public Location(){
	}
	
	public Location(Item item){
		this.item = item;
	}
	
	public abstract void showDescription();

	public abstract Location northLocation();

	public abstract Location southLocation();
	
	public abstract Location eastLocation();
	
	public abstract Location westLocation();
	

	public void behavior(){
		showDescription();
		showItem();
		showOptions();
	}
	
	public void move(Location state){
		if (state.isLocked() && !Inventory.getItens().contains(state.unlockingItem())){
			System.out.println("O caminho está bloqueado!");
			nextStep = this;
		} else {
			System.out.println("Indo para outro cenário!");
			nextStep = state;
		}
	}
	
	public Location getNextStep() {
		return nextStep;
	}
	
	private boolean hasItem() {
		if(Inventory.getItens().contains(this.item))
			return true;
		else
			return false;
	}

	public Location getItem() {
		if(!hasItem()){
			Inventory.addItemToInventory(this.item);
			System.out.println("O item " + this.item.getName() + " foi adicionado ao inventário");
		} else {
			this.item = null;
		}
		return this;
	}

	public void showItem() {
		if(item != null && !hasItem())
			System.out.println(item.getDescription());
	}
	
	private boolean canMove(Location scenario) {
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

	
	private void showMenu() {
		System.out.println("Escolha alguma opção: ");
		System.out.println("a) " + optionA());
		System.out.println("b) " + optionB());
		System.out.println("c) " + optionC());
		System.out.println("d) " + optionD());
		if(this.item != null && !hasItem())
			System.out.println("e) " + optionItem());
	}
	
	public void showOptions() {
		boolean exit;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String choice = "null";
		
		do {
			exit = true;
			showMenu();
//			System.out.println("a) Ir para o norte.");
//			System.out.println("b) Ir para o sul.");
//			System.out.println("c) Ir para o oeste.");
//			System.out.println("d) Ir para o leste.");
//			System.out.println("e) Pegar item.");
			
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
			
		} while(!exit);
		
	}

	public Item unlockingItem() {
		return null;
	}

	public boolean isLocked() {
		return false;
	}
}