package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPracticeComponent.Button;
import guiPracticeComponent.TextLabel;
import guiPracticeComponent.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"");
		button = new Button(40,85,300,500,Color.white,act());
		
		
		
//		paragraph = new TextArea(40,85,550,500,"This is a whole paragraph. Notice how "
//				+ "as the paragraph gets to the edge of the page, a new line is created.");
//		viewObjects.add(label);
//		viewObjects.add(paragraph);
	}

	@Override
	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	@Override
	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at "+m.getX()+", "+m.getY());
		update();
	}

}
