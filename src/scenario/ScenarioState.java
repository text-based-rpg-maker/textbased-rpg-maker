package scenario;

public interface ScenarioState {
	void showDescription();
	void showItem();
	void showOptions();
	void behavior();
	void handleOption();
	boolean isLocked();
	ScenarioState getNextStep();
	Item unlockingItem();
	ScenarioState move(ScenarioState state);
	ScenarioState getItem();
}
