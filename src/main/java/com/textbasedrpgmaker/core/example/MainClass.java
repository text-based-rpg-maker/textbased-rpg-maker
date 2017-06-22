package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.item.ItemCollection;
import com.textbasedrpgmaker.core.scenario.Scenario;
import com.textbasedrpgmaker.core.startgame.GamePlay;

public class MainClass {

	public static void main(String[] args) {
		Item chave = new Item(1, "Chave do castelo", "Uma chave velha para o castelo.");
		ItemCollection.registerItem(chave);
		Scenario scenario = new Scenario(new Swamp(chave));
		GamePlay gamePlay = new GamePlay();
		gamePlay.setScenario(scenario);
		gamePlay.startGame();
	}

}
