package com.textbasedrpgmaker.core.startgame;

import com.textbasedrpgmaker.core.scenario.Scenario;

public class GamePlay {
	
	private Scenario scenario;
	private static boolean endGame;
	public GamePlay(){
		endGame = false;
	}
	public static boolean isEndGame() {
		return endGame;
	}
	public static void setEndGame(boolean endGame) {
		GamePlay.endGame = endGame;
	}
	public Scenario getScenario() {
		return scenario;
	}
	public void setScenario(Scenario scenario) {
		this.scenario = scenario;
	}
	public void startGame(){
		while(!endGame){
			scenario.behaviour();
			scenario.changeState();
		}
	}
	
}
