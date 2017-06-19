package scenario;

public class Scenario implements ScenarioInterface{

	protected ScenarioState state;
	
	public Scenario() {
		state = new FirstScenario();
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
}
