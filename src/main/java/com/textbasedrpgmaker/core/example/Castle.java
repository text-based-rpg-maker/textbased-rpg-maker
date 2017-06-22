package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.item.ItemCollection;
import com.textbasedrpgmaker.core.scenario.Location;

public class Castle extends Location {

	public void showDescription() {
		System.out.println("O Palácio da Sina");
		System.out.println("Um luxuoso e gigantesco castelo se ergue"
				+ "\nno horizonte. Possui torres brancas, vitrais coloridos, portas duplas"
				+ "\nimensas e altas muralhas.");
	}
	
	public Location northLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location southLocation() {
		// TODO Auto-generated method stub
		return new Swamp(ItemCollection.getItemById(1));
	}

	public Location eastLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location westLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Item unlockingItem() {
		return ItemCollection.getItemById(1);
	}
	
	@Override
	public String optionNorth() {
		// TODO Auto-generated method stub
		return "Explorar ala norte";
	}
	@Override
	public String optionSouth() {
		// TODO Auto-generated method stub
		return "Retornar ao pântano";
	}
	@Override
	public String optionEast() {
		// TODO Auto-generated method stub
		return "Explorar cozinha";
	}
	@Override
	public String optionWest() {
		// TODO Auto-generated method stub
		return "Explorar catacumbas";
	}
	@Override
	public String optionItem() {
		// TODO Auto-generated method stub
		return "Tentar pegar armadura";
	}

}
