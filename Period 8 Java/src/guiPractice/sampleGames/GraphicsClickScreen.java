package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import guiPractice.component.Action;
import guiPractice.component.ClickableGraphic;
import guiPractice.component.Visible;

public class GraphicsClickScreen extends ClickableGraphic implements MouseListener{
	
	private ClickableGraphic bboy;
	private Action action;

	public GraphicsClickScreen(int x, int y, String imageLocation) {
		super(x, y, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public GraphicsClickScreen(int x, int y, double scale, String imageLocation) {
		super(x, y, scale, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public GraphicsClickScreen(int x, int y, int w, int h, String imageLocation) {
		super(x, y, w, h, imageLocation);
		// TODO Auto-generated constructor stub
	}

	public void initObjects(List<Visible> viewObjects){
		bboy = new ClickableGraphic(300,300,.1,"resources/sampleImages/bboy.jpg");
		bboy.setAction(new Action(){
			public void act(){
				bboy.setX(bboy.getX()+10);
			}
		}
				);
	}
	
	public void setAction(Action a){
		this.action = a;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}
	
	public void mouseClicked(MouseEvent m) {
		// TODO Auto-generated method stub
		if(bboy.isHovered(m.getX(), m.getY())){
			action.act();
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	
}
