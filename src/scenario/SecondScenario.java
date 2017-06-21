package scenario;

import java.util.Scanner;

public class SecondScenario implements ScenarioState{
	
	private Item item;

	private final int UNLOCK_ITEM_ID = 22;
	private ScenarioState nextStep;
	
	public SecondScenario(){
		
	}
	
	public SecondScenario(Item item){
		
		this.item = item;
		
	}
	
	public void behavior(){
		showDescription();
		showItem();
		showOptions();
	}
	
	@Override
	public ScenarioState move(ScenarioState state){
		if (state.isLocked() && !Inventory.getItens().contains(state.unlockingItem())){
			System.out.println("O caminho está bloqueado!");
			nextStep = this;
		} else {
			System.out.println("Indo para outro cenário!");
			nextStep = state;
		}
		return null;
	}

	@Override
	public ScenarioState getItem() {
		if(!Inventory.getItens().contains(this.item)){
			Inventory.addItemToInventory(this.item);
			System.out.println("O item " + this.item.getName() + " foi adicionado ao inventário");
		}else{
			this.item = null;
		}
		return this;
	}

	@Override
	public void showDescription() {
		System.out.println("Nome: Cenário Segundo");
		System.out.println("Você entra pela porta de madeira da velha pousada, há muito abandonada.");
		System.out.println("No interior, há um velho e empoeirado relógio de parede.");
		System.out.println("Não há som algum. Um forte cheiro de madeira velha permeia o ambiente.");
		System.out.println("Há um corredor ao norte.");
		
	}

	@Override
	public void showItem() {
		
		if(item != null){
			System.out.println(item.getDescription());

		}		
	}
	
	@Override
	public Item unlockingItem(){
		return ItemCollection.getItemById(UNLOCK_ITEM_ID);
	}

	@Override
	public void showOptions() {
		boolean exit;
		Scanner keyboard = new Scanner(System.in);
		String choice = "null";
		do {
			exit = true;
			System.out.println("Escolha alguma opção: ");
			System.out.println("a) Ir para o norte.");
			System.out.println("b) Ir para o sul.");
			System.out.println("c) Ir para o oeste.");
			System.out.println("d) Ir para o leste.");
			System.out.println("e) Pegar item.");
			
			choice = keyboard.nextLine();
			
			switch(choice) {
			case "a":
				this.move(this);
				break;
			case "b":
				this.move(new DefaultScenario());
				break;
			case "c":
				this.move(this);
				break;
			case "d":
				this.move(this);
				break;
			case "e":
				exit = false;
				this.getItem();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				exit= false;
				break;
		}
			
		
		} while(!exit);
		
	}

	@Override
	public void handleOption() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ScenarioState getNextStep() {
		return nextStep;
	}

	@Override
	public boolean isLocked() {
		// TODO Auto-generated method stub
		return true;
	}
}