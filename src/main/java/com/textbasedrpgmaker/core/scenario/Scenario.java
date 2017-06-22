package com.textbasedrpgmaker.core.scenario;

public class Scenario {

	protected ScenarioState state;
	
	public Scenario(ScenarioState state) {
		this.state = state;
	}
	
	public void changeState(){
		this.state = state.getNextStep();
	}
	
	public void behavior(){
		this.state.behavior();
	}
	
}
