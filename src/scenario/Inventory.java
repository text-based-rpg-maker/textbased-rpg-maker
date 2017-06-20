package scenario;


import java.util.List;
import java.util.ArrayList;

public class Inventory {
	
	private List<Item> itens = new ArrayList<Item>();
	
	public void addItemToInventory(Item item){
		
		itens.add(item);
		System.out.println("Item adicionado com sucesso");
	}
	
	public void  showItemIventory(){
		
		for(Item item : itens){
			System.out.println(item.getName());
		}
	}
	

}
