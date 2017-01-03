package guis.components;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import GUI.Screen;
import guis.components.Action;
import guis.components.ClickableGraphic;
import guis.components.Visible;

public class ClickGraphicsGame extends Screen implements MouseMotionListener,MouseListener{
	
	private ClickableGraphic pic;
	public ClickGraphicsGame(int width,int height) {
		super(500,500);
	}

	
	@Override
	public void mouseClicked(MouseEvent e) {
		if(pic.isHovered(e.getX(), e.getY())){
			pic.act();
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

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		pic = new ClickableGraphic(500,30,200,200,"resources/sampleImages/face.jpg");
		pic.setAction(new Action(){
			public void act(){
				pic.setX(pic.getX()+10);
			}
		});
		viewObjects.add(pic);

	}
	public MouseListener getMouseListener(){
		return this;
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}

	
	


}
