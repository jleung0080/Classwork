package Simon;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import guiPractice.component.ClickableScreen;
import guiPractice.component.TextLabel;
import guiPractice.component.Visible;
import whackAMole.MoleInterface;

public class SimonScreenJoey extends ClickableScreen implements Runnable{
	private ArrayList<ButtonInterfaceJoey> buttons;
	private TextLabel progressBox;
	private int roundNumber;
	private int sequenceLength;
	private boolean playerTurn;
	private ProgressInterfaceJoey progressInterface;
	private int numberOfButtons;
	private ArrayList<Color> colors;

	public SimonScreenJoey(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> v) {
		// TODO Auto-generated method stub
		buttons = new ArrayList<ButtonInterfaceJoey>();
		colors.add(Color.BLUE);
		colors.add(Color.GREEN);
		colors.add(Color.RED);
		colors.add(Color.magenta);
	}

	private void addButtons(int x, int y){
		
	}

	private Button getAButton() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		roundNumber = 1;
		sequenceLength = 3;
		
	}

}
