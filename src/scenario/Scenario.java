package scenario;

public class Scenario{

	protected ScenarioState state;
	
	// Ações que o jogador pode executar em cada cenário
	public Scenario() {
		state = new DefaultScenario();
	}
	public void goNorth(){
		state = state.goNorth();
	};
	public void goSouth(){
		state = state.goSouth();
	};
	public void goWest(){
		state = state.goWest();
	};
	public void goEast(){
		state = state.goEast();
	};
	public void getItem(){
		state = state.getItem();
	}
	public void useItem(int x){
		state = state.useItem();
	}
}
