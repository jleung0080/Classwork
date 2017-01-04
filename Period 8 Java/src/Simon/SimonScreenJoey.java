package Simon;

import java.util.ArrayList;
import java.util.List;

import guiPractice.component.Button;
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
	private Button red;


	public SimonScreenJoey(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> list) {
		// TODO Auto-generated method stub

	}


	private Button getAButton() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
