package com.textbasedrpgmaker.core.scenario;

import java.util.Scanner;

import com.textbasedrpgmaker.core.item.Inventory;
import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.startgame.GamePlay;

public abstract class Location {

	private Item item;
	private Location nextStep;

	public Location() {
	}

	public Location(Item item) {
		this.item = item;
	}

	public abstract void showDescription();

	public abstract Location northLocation();

	public abstract Location southLocation();

	public abstract Location eastLocation();

	public abstract Location westLocation();

	public void behaviour() {
		showDescription();
		if (GamePlay.isEndGame()) {
			System.out.println("Fim");
		} else {
			showItem();
			showOptions();
		}
	}

	public void move(Location state) {
		if ((state.unlockingItem() != null)
				&& !Inventory.getItens().contains(state.unlockingItem())) {
			System.out.println("O caminho está bloqueado!");
			nextStep = this;
		} else {
			System.out.println(this.movingScenario());
			nextStep = state;
		}
	}

	public Location getNextStep() {
		return nextStep;
	}

	private boolean hasItem() {
		if (Inventory.getItens().contains(this.item))
			return true;
		else
			return false;
	}

	public Location putInInventory() {
		if (!hasItem()) {
			Inventory.addItemToInventory(this.item);
			System.out.println("O item " + this.item.getName()
					+ " foi adicionado ao inventário");
		} else {
			this.item = null;
		}
		return this;
	}

	public void showItem() {
		if (item != null && !hasItem())
			System.out.println(item.getDescription());
	}

	private boolean canMove(Location scenario) {
		if (scenario == null) {
			System.out.println(this.cannotMove());
			return false;
		} else {
			move(scenario);
			return true;
		}
	}

	public abstract String optionNorth();

	public abstract String optionSouth();

	public abstract String optionEast();

	public abstract String optionWest();

	public abstract String optionItem();

	public abstract String noItemMessage();

	public abstract String cannotMove();

	public abstract String movingScenario();
	
	public abstract String endingMessage();

	private void showMenu() {
		System.out.println("Escolha alguma opção: ");
		System.out.println("a) " + optionNorth());
		System.out.println("b) " + optionSouth());
		System.out.println("c) " + optionEast());
		System.out.println("d) " + optionWest());
		if (this.item != null && !hasItem())
			System.out.println("e) " + optionItem());
	}

	private boolean invalidOption(boolean exit) {
		System.out.println("Escolha uma opção válida");
		exit = false;
		return exit;
	}

	private boolean getItem(boolean exit) {
		exit = false;
		if (this.item != null && !hasItem())
			this.putInInventory();
		else
			System.out.println("Não há nada para pegar");
		return exit;
	}

	private boolean chooseOption(boolean exit) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		String choice = "null";
		choice = keyboard.nextLine();
		// showMenu();

		switch (choice) {
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
				this.getItem(exit);
			else
				System.out.println(this.noItemMessage());
			break;
		default:
			exit = invalidOption(exit);
			break;
		}
		return exit;
	}

	public void showOptions() {
		boolean exit;

		do {
			exit = true;
			showMenu();
			exit = chooseOption(exit);

		} while (!exit);

	}

	public Item unlockingItem() {
		return null;
	}

}