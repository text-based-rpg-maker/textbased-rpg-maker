package com.textbasedrpgmaker.core.example;

import com.textbasedrpgmaker.core.item.Item;
import com.textbasedrpgmaker.core.item.ItemCollection;
import com.textbasedrpgmaker.core.scenario.Scenario;

public class MainClass {
	
	public static void main(String[] args) {
		Item item = new Item();
		item.setDescription("Uma chave velha e dourada.");
		item.setId(22);
		item.setName("Chave Dourada");
		
		ItemCollection.registerItem(item);
		
		Scenario scenario = new Scenario(null);
		
	}

}
