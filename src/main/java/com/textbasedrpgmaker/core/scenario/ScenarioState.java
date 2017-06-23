package com.textbasedrpgmaker.core.scenario;

import com.textbasedrpgmaker.core.item.Item;

public interface ScenarioState {
	
	void showDescription();
	void showItem();
	void showOptions();
	void behaviour();
	boolean isLocked();
	ScenarioState getNextStep();
	ScenarioState northLocation();
	ScenarioState southLocation();
	ScenarioState eastLocation();
	ScenarioState westLocation();
	Item unlockingItem();
	void move(ScenarioState state);
	ScenarioState getItem();
	boolean chooseOption(boolean exit);
	ScenarioState putItemInInventory();
}
