package com.textbasedrpgmaker.core.scenario;

public class Scenario {

	protected Location state;
	
	public Scenario(Location state) {
		this.state = state;
	}
	
	public void changeState(){
		this.state = state.getNextStep();
	}
	
	public void behaviour(){
		this.state.behaviour();
	}
	
}
