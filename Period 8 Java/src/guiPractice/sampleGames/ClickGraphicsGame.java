package guiPractice.sampleGames;

import guiPractice.GUIApplication;
import guiPractice.component.ClickableScreen;

public class ClickGraphicsGame extends GUIApplication {

	public ClickGraphicsGame() {
		super();
	}

	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		ClickableScreen gcs = new ClickableScreen(getWidth(),getHeight());
		setScreen(gcs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClickGraphicsGame cgg = new ClickGraphicsGame();
		Thread app = new Thread(cgg);
		app.start();
	}

}
