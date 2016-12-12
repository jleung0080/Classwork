package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;



import guiPracticeComponent.TextLabel;

public class TextArea extends TextLabel {

	public TextArea(int x, int y, int w, int h, String text) {
		super(x, y, w, h, text);
	}
	
	
	
	
	
	public void update(Graphics2D g) {
		FontMetrics fm = g.getFontMetrics();
		
		String text = getText();
		String font = getFont();
		int size = getSize();
		String[] words = text.split(" ");
		int[] lengths = new int[words.length];
		int spaceLength = fm.stringWidth(" ");
		for(int i = 0; i < words.length; i++){
			lengths[i] = fm.stringWidth(words[i]);
		}
		for(int word = 0; word< words.length; word++){
			
		}
		
		
		
		
		
	}
}
