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

	public String optionA() {
		// TODO Auto-generated method stub
		return "Ir em direção ao castelo";
	}

	public String optionB() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionC() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionD() {
		// TODO Auto-generated method stub
		return "Vagar no pântano para sempre";
	}

	public String optionItem() {
		// TODO Auto-generated method stub
		return "Pegar chave do castelo";
	}

}
