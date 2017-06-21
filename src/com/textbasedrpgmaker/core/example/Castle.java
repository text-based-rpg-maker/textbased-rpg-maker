package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.scenario.Location;
import com.textbasedrpgmaker.core.scenario.ScenarioState;

public class Castle extends Location {

	@Override
	public void showDescription() {
		System.out.println("O Palácio da Sina");
		System.out.println("Um luxuoso e gigantesco castelo se ergue"
				+ " no horizonte. Possui torres brancas, vitrais coloridos, portas duplas"
				+ "imensas e altas muralhas.");
	}
	@Override
	public ScenarioState northLocation() {
		// TODO Auto-generated method stub
		return null;
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
