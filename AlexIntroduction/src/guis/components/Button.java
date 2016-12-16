package guis.components;

import java.awt.Color;
import java.awt.Font;
import  java.awt.Graphics2D;
import java.awt.RenderingHints;

	

public class Button extends TextLabel {
	private Color color;
	private Action action;

	public Button(int x, int y, int w, int h, String string, Color color, Action action) {
		super(x, y, w, h, string);
		this.action = action;
		this.color = color;
		update();
		// TODO Auto-generated constructor stub
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
		update();
	}
	public Action getAction() {
		return action;
	}
	public void setAction(Action action) {
		this.action = action;
	}
	
	
	
	public void update(Graphics2D g){
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,RenderingHints.VALUE_TEXT_ANTIALIAS_ON);//not pixel rendering hint
		g.setColor(color);
		g.fillRoundRect(0, 0, getWidth(), getHeight(), 35, 25);
		g.setColor(Color.black);
		g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 35, 25);
		g.setFont(new Font(getFont(),Font.PLAIN,getSize()));//font is private
		if(getText()!=null){
			g.setColor(Color.white);
			String t = getText();
			int cutoff = t.length();
			while(cutoff > 0 && fm.stringWidth(t) > getWidth()){
				cutoff--;
				t=t.substring(0, cutoff);
				}
			g.drawString(t, (getWidth()-fm.stringWidth(t))/2,(getHeight()+fm.getHeight()-fm.getDescent())/2);
			}
			
	
		
	}
	public void act(){
		action.act();
	}

}

