package scenario;

public class MainClass {
	
	public static void main(String[] args) {
		Item item = new Item();
		item.setDescription("dasdsa");
		item.setId(22);
		item.setName("sads");
		
		ItemCollection.registerItem(item);
		
		Scenario scenario = new Scenario(null);
		
	}

}
