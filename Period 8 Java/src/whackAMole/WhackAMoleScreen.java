package whackAMole;

import java.util.ArrayList;
import java.util.List;

import guiPractice.component.Action;
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
		player = getAPlayer();
		label =  new TextLabel(getWidth()/2-60, getHeight()/2-10, 100, 40, "Ready...");
		timeLabel = new TextLabel(getWidth()/2-40,20,100,40,"");
		viewObjects.add(label);
		viewObjects.add(timeLabel);
		viewObjects.add(player);
	}

	/**
	 *to implement later, after Character Team implements PlayerInterface
	 */
	private PlayerInterface getAPlayer() {
		return new Player(20,20);
	}

	/**
	 *to implement later, after EnemyTeam implements MoleInterface
	 */
	private MoleInterface getAMole() {
		return new Mole((int)(getWidth()*Math.random())-100,(int)(getHeight()*Math.random()));
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
		disappearMoles();
		addNewMoles();
	}

	private void addNewMoles() {
		// probability of mole appearing depends on time left
		double probability = .2+.1*(30.0-timeLeft)/30;
		if(Math.random() < probability){
			final MoleInterface mole = getAMole();
			mole.setAppearanceTime((int)(500+Math.random()*2000));
			mole.setAction(new Action(){
				public void act(){
					player.increaseScore(1);
					//remove Mole from viewObjects
					remove(mole);
					//remove mole from database
					moles.remove(mole);
				}
			});
			//add mole to visible
			addObject(mole);
			//add mole to mole list
			moles.add(mole);
		}
	}

	private void disappearMoles() {
		// TODO Auto-generated method stub
		while(timeLeft>0){
			//frame updates every 100ms
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
			timeLeft -= .1;
			timeLabel.setText(""+(int)(timeLeft*10)/10.0);
			//each mole has a "clock"
			//when the mole clock counts down to zero it disappears
			for(int i = 0; i<moles.size();i++){
				MoleInterface m = moles.get(i);
				m.setAppearanceTime(m.getAppearanceTime()-100);
				if(m.getAppearanceTime()<=0){
					//remove from viewObjects
					remove(m);
					//remove it from our mole database
					moles.remove(i);
					i--;//compensate for i++
				}
			}
		}
	}



}
