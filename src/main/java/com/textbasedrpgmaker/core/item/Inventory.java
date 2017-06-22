package com.textbasedrpgmaker.core.item;


import java.util.List;
import java.util.ArrayList;

public class Inventory {
	
	private static List<Item> itens = new ArrayList<Item>();
	
	public static void addItemToInventory(Item item){
		
		itens.add(item);
	}
	
	public static void showItemIventory(){
		
		for(Item item : itens){
			System.out.println(item.getName());
		}
	}

	public static List<Item> getItens() {
		return itens;
	}

	public static void setItens(List<Item> itens) {
		Inventory.itens = itens;
	}
	
}
