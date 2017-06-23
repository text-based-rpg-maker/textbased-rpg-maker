package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.item.ItemCollection;
import com.textbasedrpgmaker.core.scenario.Location;
import com.textbasedrpgmaker.core.scenario.ScenarioState;

public class Castle extends Location {

	@Override
	public void showDescription() {
		System.out.println("O Palácio da Sina");
		System.out.println("Um luxuoso e gigantesco castelo se ergue"
				+ "\nno horizonte. Possui torres brancas, vitrais coloridos, portas duplas"
				+ "\nimensas e altas muralhas.");
	}
	@Override
	public ScenarioState northLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScenarioState southLocation() {
		// TODO Auto-generated method stub
		return new Swamp(ItemCollection.getItemById(1));
	}

	@Override
	public ScenarioState eastLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ScenarioState westLocation() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Item unlockingItem() {
		return ItemCollection.getItemById(1);
	}
	
	@Override
	public boolean isLocked() {
		return true;
	}
	@Override
	public String optionA() {
		// TODO Auto-generated method stub
		return "Explorar ala norte";
	}
	@Override
	public String optionB() {
		// TODO Auto-generated method stub
		return "Retornar ao pântano";
	}
	@Override
	public String optionC() {
		// TODO Auto-generated method stub
		return "Explorar cozinha";
	}
	@Override
	public String optionD() {
		// TODO Auto-generated method stub
		return "Explorar catacumbas";
	}
	@Override
	public String optionItem() {
		// TODO Auto-generated method stub
		return "Tentar pegar armadura";
	}
	@Override
	public ScenarioState getItem() {
		// TODO Auto-generated method stub
		return null;
	}

}
