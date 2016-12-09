package guiPractice.sampleGames;

import guiPractice.GUIApplication;
import guiPractice.Screen;

public class TheBlankScreenGame extends GUIApplication {

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		Screen s = new BlankScreen(getWidth(),getHeight());
		setScreen(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TheBlankScreenGame();
	}

}
