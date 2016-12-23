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
	private long sleepTime;

	public WhackAMoleScreen(int width, int height) {
		super(width, height);
		timeLeft = 30.0;
		Thread play = new Thread(this);
		play.start();



		// TODO Auto-generated constructor stub
	}

	@Override
	public void initAllObjects(List<Visible> viewObjects) {
		// TODO Auto-generated method stub
		moles = new ArrayList<MoleInterface>();
		//		player = getAPlayer();
		label =  new TextLabel(getWidth()/2-60, getHeight()/2-10, 100, 40, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-40,20,100,40,"");
		viewObjects.add(label);
		viewObjects.add(timeLabel);
		//		viewObjects.add(player);
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

	private void changeText(String s){
		try{
			Thread.sleep(1000);
			label.setText(s);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		changeText("Set...");
		changeText("Go!");
		changeText("");
		timeLabel.setText(""+timeLeft);
		while(timeLeft>0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
		}
	}



}
