package scenario;

public class Scenario {

	protected ScenarioState state;
	
	public Scenario(ScenarioState state) {
		this.state = state;
		this.behavior();
	}
	public void changeState(){
		this.state = state.getNextStep();
		this.behavior();
	}
	
	public void behavior(){
		this.state.behavior();
		changeState();
	}
	
}
