package guiPracticeComponent;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import javax.swing.ImageIcon;

public class Graphic implements Visible {

	private int x;
	private int y;
	private BufferedImage image;
	private boolean loadedImages;

	public Graphic(int x, int y, String imageLocation){
		this.x = x;
		this.y = y;
		loadedImages = false;
		loadImages(imageLocation, 0,0);
	}




	private void loadImages(String imageLocation, int w, int h) {
		try{
			//get the image from file(full size)
			ImageIcon icon = new ImageIcon(imageLocation);

			if (w == 0 && h == 0){
				//use original size
				image = new BufferedImage(icon.getIconWidth(),icon.getIconHeight(),BufferedImage.TYPE_INT_ARGB);
				//draw icon onto image
				Graphics2D g = image.createGraphics();
				g.drawImage(icon.getImage(), 0, 0, null);
			}
			else{
				//use specified size(complete on monday)
			}
		}catch(Exception e){
			e.printStackTrace();
		}

	}




	private void loadImages(String imageLocation, double scale) {
		// TODO Auto-generated method stub

	}




	public Graphic() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public BufferedImage getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return x;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return y;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return image.getWidth();
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return image.getHeight();
	}

	@Override
	public boolean isAnimated() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

}
