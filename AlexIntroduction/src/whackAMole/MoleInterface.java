package whackAMole;

import guis.components.Action;
import guis.components.Clickable;
/**
 * 
 * This is for my partner, the Enemy Designer to implement
 *
 */
public interface MoleInterface extends Clickable {

	int getAppearanceTime();

	void setAppearanceTime(int screenTime);

	void setAction(Action action);

	
	
}
