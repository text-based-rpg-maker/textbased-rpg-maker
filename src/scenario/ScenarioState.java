package scenario;

public interface ScenarioState {
	ScenarioState goNorth();
	ScenarioState goSouth();
	ScenarioState goWest();
	ScenarioState goEast();
	ScenarioState getItem();
	ScenarioState useItem();
}
