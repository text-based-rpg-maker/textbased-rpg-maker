package scenario;

import java.util.ArrayList;
import java.util.List;

public class ItemCollection {

	private static List<Item> itemCollection = new ArrayList<Item>();
	
	public static void registerItem(Item item) {
		itemCollection.add(item);
	}

	public static List<Item> getItemCollection() {
		return itemCollection;
	}

	public static void setItemCollection(List<Item> itemCollection) {
		ItemCollection.itemCollection = itemCollection;
	}
	
	public static Item getItemById(int id){
		for(Item item : itemCollection){
			if(item.getId() == id){
				return item;
			}
		}
		return null;
	}
	
	
}
