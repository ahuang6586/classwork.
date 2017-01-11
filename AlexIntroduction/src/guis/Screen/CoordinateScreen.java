package guis.Screen;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import GUI.Screen;
import guis.SampleGames.MouseFollower;
import guis.components.Action;
import guis.components.Button;
import guis.components.Graphic;
import guis.components.MovingComponent;
import guis.components.TextArea;
import guis.components.TextLabel;
import guis.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{
	private Button button;
	private TextLabel text;
	private TextArea area;
	private Graphic face;
	public CoordinateScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		button = new Button(20,100,80,40,"Button",new Color(100,100,250),new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.MyScreen);
			}
		});
		
		viewObjects.add(button);
		text = new TextLabel(20, 200, 500, 40, "Some text");
		viewObjects.add(text);
		area = new TextArea (20,200,500,100, "This is really long text. It prints over multiple lines, as you can see. We worked on this in class.It is called TextArea.");
		viewObjects.add(area);
		
		face = new Graphic(30,30,100,100,"resources/sampleImages/face.jpg");
		viewObjects.add(face);
		
		MovingComponent c = new MovingComponent(20,20,100,100);
		viewObjects.add(c);
		c.setVy(2);
		c.setVx(1);
		c.play();
	}


	@Override
	public void mouseDragged(MouseEvent e) {
		e.getX();
		e.getY();
		
	}


	@Override
	public void mouseMoved(MouseEvent e) {
		int mx = e.getX();//get mouse X coordinate
		int my = e.getY();//get Y coord
		text.setText("Mouse at: "+mx+ ","+my);
		
		
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;//this screen is listening to the mouselocation
	}


	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
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
	public MouseListener getMouseListener(){
		return this;//this screen allows you to click stuff
	}
}
