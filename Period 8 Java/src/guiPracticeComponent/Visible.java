package guiPracticeComponent;

import java.awt.image.BufferedImage;

public interface Visible {

	public BufferedImage getImage();
	public int getX();
	public int getY();
	public int getWidth();
	public int getheight();
	public boolean isAnimated();
	public void update();
}
