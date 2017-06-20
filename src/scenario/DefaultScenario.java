package scenario;

public class DefaultScenario extends ScenarioState{

	
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
