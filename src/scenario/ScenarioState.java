package scenario;

public interface ScenarioState {
	void showDescription();
	void showItem();
	void showOptions();
	void handleOption();
	boolean isLocked();
	int unlockingItem();
	ScenarioState goNorth();
	ScenarioState goSouth();
	ScenarioState goWest();
	ScenarioState goEast();
	ScenarioState getItem();
	ScenarioState useItem();
}
