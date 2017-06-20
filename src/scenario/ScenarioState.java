package scenario;

import java.util.Scanner;

public abstract class ScenarioState {

	public ScenarioState(){
		//Descrição do cenário
		System.out.println("Nome: Cenário Inicial");
		System.out.println("Descrição: Descrição qualquer!");
		System.out.println("Escolha alguma opção: ");
		System.out.println("a) Ir para o norte.");
		System.out.println("b) Ir para o sul.");
		System.out.println("c) Ir para o oeste.");
		System.out.println("d) Ir para o leste.");
		System.out.println("e) Pegar item.");
		
		String choice = null;
		
		while(choice != "f"){
			@SuppressWarnings("resource")
			Scanner keyboard = new Scanner(System.in); 
			choice = keyboard.nextLine();
		
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
					
			}
		}
	}
	
	
	ScenarioState goNorth(){
		return null;};
	ScenarioState goSouth(){
		return null;};
	ScenarioState goWest(){
		return null;};
	ScenarioState goEast(){
		return null;};
	ScenarioState getItem(){
		return null;};
	ScenarioState useItem(){
		return null;};
}
