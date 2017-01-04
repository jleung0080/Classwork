package guiPractice.component;

import java.awt.Graphics2D;

public class MovingComponent extends Component implements Runnable {

	private double vx;
	private double vy;
	private double posx;
	private double posy;
	private boolean running;
	private long moveTime;//time when the image last moved
	
	
	public MovingComponent(int x, int y, int w, int h) {
		super(x, y, w, h);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}
	

	public void setY(int y){
		super.setY(y);
	}

	public void setX(int x){
		super.setX(x);
	}

	@Override
	public void update(Graphics2D g) {
		// TODO Auto-generated method stub

	}

}
