package whackAMole;

import guiPractice.component.ClickableGraphic;

public class Mole extends ClickableGraphic implements MoleInterface{
	private int appearanceTime;
	
	public Mole(int x, int y){
		super(x,y,.50,"resources/sampleImages/mole.png");
	}

	@Override
	public int getAppearanceTime() {
		// TODO Auto-generated method stub
		return appearanceTime;
	}

	@Override
	public void setAppearanceTime(int d) {
		// TODO Auto-generated method stub
		this.appearanceTime = d;

	}

}
