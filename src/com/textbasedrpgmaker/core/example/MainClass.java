package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.item.ItemCollection;
import com.textbasedrpgmaker.core.scenario.Scenario;

public class MainClass {
	
	public static void main(String[] args) {
		Item chave = new Item(1, "Chave do castelo", "Uma chave velha para o castelo.");
		ItemCollection.registerItem(chave);
		Scenario scenario = new Scenario(new Swamp());
		
	}

}
