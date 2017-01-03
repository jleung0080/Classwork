package whackAMole;

import guiPractice.component.Action;
import guiPractice.component.Clickable;

public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int i);

	void setAction(Action action);

}