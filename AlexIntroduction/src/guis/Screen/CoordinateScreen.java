package guis.Screen;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUI.Screen;
import guis.components.Action;
import guis.components.Button;
import guis.components.TextLabel;
import guis.components.Visibile;

public class CoordinateScreen extends Screen implements MouseMotionListener{
	private Button button;
	private TextLabel text;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void initObjects(ArrayList<Visibile> viewObjects) {
		button = new Button(20,100,80,40,"Button",new Color(100,100,250),new Action(){
			public void act(){
				
			}
		});
		TextLabel text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e.getY();//get Y coord
		text.setText("Mouse at: "+mx+ ","+my);
		
		
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

}
