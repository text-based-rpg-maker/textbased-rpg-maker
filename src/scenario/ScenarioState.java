package scenario;

public interface ScenarioState {
	
	void showDescription();
	void showItem();
	void showOptions();
	void behavior();
	boolean isLocked();
	ScenarioState getNextStep();
	ScenarioState northLocation();
	ScenarioState southLocation();
	ScenarioState eastLocation();
	ScenarioState westLocation();
	Item unlockingItem();
	void move(ScenarioState state);
	ScenarioState getItem();
}
