package guiPractice.component;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import guiPractice.Screen;

public abstract class ClickableScreen extends Screen implements MouseListener{

	private ArrayList<Clickable> clickables;


	public ClickableScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		initAllObjects(viewObjects);
		for(Visible obj:viewObjects){
			if(obj instanceof Clickable){
				clickables.add((Clickable) obj);
			}
		}
	}

	public MouseListener getMouseListener(){
		return this;
	}



	abstract void initAllObjects(List<Visible> list);



	public void addObject(Visible v){
		super.addObject(v);
		if(v instanceof Clickable){
			clickables.add((Clickable) v);
		}
	}



	public void remove(Visible v){
		super.remove(v);
		clickables.remove(v);
	} 



	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		for(Clickable select:clickables){
			if(select.isHovered(e.getX(), e.getY())){
				select.act();
				break;
			}
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
