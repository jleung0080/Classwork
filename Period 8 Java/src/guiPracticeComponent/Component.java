package guiPracticeComponent;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

public abstract class Component implements Visible{

	private int x;
	private int y;
	private int w;
	private int h;
	private BufferedImage image;
	// TODO Auto-generated constructor stub

	public Component(int x,int y,int w,int h){
		this.x = x;
		this.y=y;
		this.w=w;
		this.h=h;
		
		image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		update(image.createGraphics());
	}
	
	public Graphics2D clear(){
		//resets the picture
		image = new BufferedImage(w,h,BufferedImage.TYPE_INT_ARGB);
		return image.createGraphics();
	}
	

	public abstract void update(Graphics2D g);
	
	public void update() {
		// TODO Auto-generated method stub
		update(image.createGraphics());
	}

	public BufferedImage getImage(){
		return image;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getWidth(){
		return w;
	}
	public int getHeight(){
		return h;
	}
	public boolean isAnimated(){
		return false;
	}
}

