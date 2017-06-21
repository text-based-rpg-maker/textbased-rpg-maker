package scenario;

import java.util.Scanner;

public class DefaultScenario implements ScenarioState{
	
	private Item item;

	public DefaultScenario(){
		
		behavior();
	}
	
	public DefaultScenario(Item item){
		
		this.item = item;
		
		behavior();
	}
	
	public void behavior(){
		showDescription();
		showItem();
		showOptions();
	}
	
	@Override
	public ScenarioState goNorth(){
		System.out.println("Não há caminho para o norte");
		return this;
	}
	
	@Override
	public ScenarioState goSouth(){
		System.out.println("Se movendo para o sul!");
		return this;
	}
	
	@Override
	public ScenarioState goWest(){
		System.out.println("Não há caminho para o oeste");
		return this;
	}
	
	@Override
	public ScenarioState goEast(){
		System.out.println("Não há caminho para o leste");
		return this;
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
	public ScenarioState useItem() {
		System.out.println("Não houve nenhum efeito");
		return this;
	}

	@Override
	public void showDescription() {
		System.out.println("Nome: Cenário Inicial");
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
			System.out.println("f) Usar item.");
			
			choice = keyboard.nextLine();
			
			switch(choice) {
			case "a":
				this.goNorth();
				break;
			case "b":
				this.goSouth();
				break;
			case "c":
				this.goWest();
				break;
			case "d":
				this.goEast();
				break;
			case "e":
				exit = false;
				this.getItem();
				break;
			case "f":
				exit = false;
				this.useItem();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				exit= false;
				break;
		}
			
		
		} while(!exit);
		
		keyboard.close();
	}

	@Override
	public void handleOption() {
		// TODO Auto-generated method stub
		
	}
}