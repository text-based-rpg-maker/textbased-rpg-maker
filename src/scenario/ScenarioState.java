package scenario;

public interface ScenarioState {
	public ScenarioState goNorth();
	public ScenarioState goSouth();
	public ScenarioState goWest();
	public ScenarioState goEast();
}
