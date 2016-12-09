package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {
	
	public static void main(String[] args){
		new MouseFollower();
	}
	private CoordinateScreen coordScreen;
	
	 
	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(),getHeight());
		setScreen(coordScreen);
	}

}
