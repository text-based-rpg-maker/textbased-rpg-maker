package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.scenario.Location;

public class Swamp extends Location {

	public Swamp(Item item) {
		super(item);
	}
	
	public Swamp() {
		super();
	}
	
	public void showDescription() {
		System.out.println("Pântano da Perdição");
		System.out.println("O pântano diante de você se estende por infindaveis"
				+ "\nquilômetros para todos os lados."
				+ "\nÁrvores retorcidas, musgos e animais rastejantes dominam o ambiente.");
	}

	public Location northLocation() {
		return new Castle();
	}

	public Location southLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location eastLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Location westLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	public String optionNorth() {
		// TODO Auto-generated method stub
		return "Ir em direção ao castelo";
	}

	public String optionSouth() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionEast() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionWest() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionItem() {
		// TODO Auto-generated method stub
		return "Pegar chave do castelo";
	}

}
