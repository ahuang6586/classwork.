package guis.components;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guis.Screen;
import guis.components.Action;
import guiPractice.components.Button;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

import GUI.Screen;

public class MyScreen extends Screen implements MouseMotionListener, MouseListener{

	
	private Visible face;
	private Graphic picture;
	private guis.components.ClickableGraphic back;
	
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		face = new Graphic(30,40,100,100,"resources/sampleImages/face.jpg");
		viewObjects.add(face);
		picture=new ClickableGraphic(0,0,0.2,"resourses/sampleImages/face.png");
		viewObjects.add(picture);
		
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		if(back.isHovered(e.getX(), e.getY())){
			back.act();
			}
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	public MouseListener getMouseListener(){
		return this;
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

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
}
	

