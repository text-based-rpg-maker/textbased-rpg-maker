package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.scenario.Location;
import com.textbasedrpgmaker.core.scenario.ScenarioState;

public class Swamp extends Location {

	public Swamp(Item item) {
		super(item);
	}
	
	public Swamp() {
		super();
	}
	
	@Override
	public void showDescription() {
		System.out.println("Pântano da Perdição");
		System.out.println("O pântano diante de você se estende por infindaveis"
				+ "\nquilômetros para todos os lados."
				+ "\nÁrvores retorcidas, musgos e animais rastejantes dominam o ambiente.");
	}

	@Override
	public ScenarioState northLocation() {
		return new Castle();
	}

	@Override
	public ScenarioState southLocation() {
		// TODO Auto-generated method stub
		return null;
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

}
