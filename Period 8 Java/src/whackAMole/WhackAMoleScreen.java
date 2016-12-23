package whackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice.component.ClickableScreen;
import guiPractice.component.TextLabel;
import guiPractice.component.Visible;

public class WhackAMoleScreen extends ClickableScreen implements Runnable{
	private String text;
	private ArrayList<MoleInterface> moles;
	private PlayerInterface player;
	private TextLabel label;
	private TextLabel timeLabel;
	private double timeLeft;
	private int sleepTime;
	private int number;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 60.0;
		Thread screen = new Thread((Runnable) this);
		Thread run = new Thread(counter(2));
		Thread go = new Thread(counter(3));
		run.start();
		go.start();
		screen.start();



		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		//		player = getAPlayer();
		label =  new TextLabel(265, 200, 100, 40, "Ready...");
		timeLabel = new TextLabel(280,10,100,40,timeLeft+"");
		viewObjects.add(label);
		viewObjects.add(timeLabel);
	}

	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return null;
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return null;
	}


	public Runnable counter(int x){
		sleepTime = x;
		return null;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(sleepTime);
			if(sleepTime == 2){
				label =  new TextLabel(265, 200, 100, 40, "Set...");
			}
			if(sleepTime == 3){
				label =  new TextLabel(265, 200, 100, 40, "Go!!!");
			}
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



}
