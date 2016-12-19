package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPracticeComponent.Action;
import guiPracticeComponent.Button;
import guiPracticeComponent.Graphic;
import guiPracticeComponent.TextLabel;
import guiPracticeComponent.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Visible picture;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40,45,760,40,"");
		button = new Button(40,200,80,40,"Button",new Color(100,100,250),new Action(){
			public void act(){

			}
		});
		paragraph = new TextArea(40,85,550,500,"This is a whole paragraph. Notice how "
				+ "as the paragraph gets to the edge of the page, a new line is created.");
		picture = new Graphic(50,50,.5,"resources/sampleImages/images.jpg");
		viewObjects.add(picture);
		viewObjects.add(button);
		viewObjects.add(label);
		viewObjects.add(paragraph);
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
