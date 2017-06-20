package scenario;

import java.util.Scanner;

public class DefaultScenario implements ScenarioState{

	public DefaultScenario(){
		
		//Descrição do cenário
		System.out.println("Nome: Cenário Inicial");
		System.out.println("Descrição: Descrição qualquer!");
		System.out.println("Escolha alguma opção: ");
		System.out.println("a) Ir para o norte.");
		System.out.println("b) Ir para o sul.");
		System.out.println("c) Ir para o oeste.");
		System.out.println("d) Ir para o leste.");
		System.out.println("e) Pegar item.");
		System.out.println("f) Usar item.");
		
		while(true){
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in); 
			String choice = keyboard.nextLine();
			
			//Seletor da ação
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
					this.getItem();
					break;
				case "f":
					this.useItem();
					break;
				default:
					System.out.println("Escolha uma opção válida");
					break;
			}
		}
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
		System.out.println("Não há itens para pegar!");
		return this;
	}
	@Override
	public ScenarioState useItem() {
		System.out.println("Não houve nenhum efeito");
		return this;
	}
}
