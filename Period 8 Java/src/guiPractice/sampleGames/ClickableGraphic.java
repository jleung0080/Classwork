package guiPractice.sampleGames;

import guiPractice.component.Clickable;
import guiPractice.component.Graphic;

public class ClickableGraphic extends Graphic implements Clickable {

	public ClickableGraphic(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public ClickableGraphic(int x, int y, int w, int h, String imageLocation, Action ) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean isHovered(int x, int y) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void act() {
		// TODO Auto-generated method stub
		
	}

}
