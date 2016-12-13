package guiPracticeComponent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {
	
	private String text;
	private String font;
	private int size;
	
	
	
	public TextLabel(int x, int y, int w, int h, String text) {
		super(x, y, w, h);
		this.text = text;
		font = "Helvetica";
		size = 20;
		update();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public void setText(String s){
		this.text = s;
		update();
	}
	
	public void setFont(String font){
		this.font = font;
		update();
	}
	
	public void setSize(int size){
		this.size = size;
		update();
	}
	
	
	@Override
	public void update(Graphics2D g) {
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			g.setFont(new Font(font,Font.PLAIN,size));			
			g.drawString(text, 4, getHeight()-5);
		}
	}

	public int getSize(){
		return size;
	}
	public String getFont(){
		return font;
	}
	public String getText(){
		return text;
	}


}
