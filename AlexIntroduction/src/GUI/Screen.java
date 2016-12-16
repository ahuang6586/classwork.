package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guis.components.Visibile;
import java.awt.event.MouseListener;//
import java.awt.event.MouseMotionListener;//
public abstract class Screen {
	
	private BufferedImage image;
	private ArrayList<Visibile> viewObjects;
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visibile>();
		initObjects(viewObjects);
		initImage(width,height);
	
	}
	public abstract void 
	initObjects(ArrayList<Visibile> viewObjects);
	private void initImage(int width, int height) {
		image = new BufferedImage(width,height, BufferedImage.TYPE_INT_ARGB);
		update();
	}
	public BufferedImage getImage(){
		return image;
	}
	public int getWidth(){
		return image.getWidth();
	}
	public int getHeight(){
		return image.getHeight();
	}
	private void update() {
		// TODO Auto-generated method stub
		Graphics2D g = image.createGraphics();
		//smooth the graphics
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
		//rendering makes lines smoother less pixelated
		g.setColor(Color.pink);
		g.fillRect(0, 0, image.getWidth(), image.getHeight());
		g.setColor(Color.black);	
//		for (int i=0; i < viewObjects.size();i++){
//			
//		}
		for(Visibile v: viewObjects){
			g.drawImage(v.getImage(), v.getX(), v.getY(), null);
		}
		//g.drawString("Hello World", 40, 100);
		//g.drawOval(20, 60, 100, 50);
	}
	//interface description of methods implement as many interfaces as you want
	//abstract class description of methods and methods only extends one class
	//so that the children can act independently 
	//methods only useful to subclasses that inherit this class
	//instantiation = initialized 
	//can't initialize a abstract class you can write subclasses
	//int[] num
	//num = new int[5];
	public MouseListener getMouseListener() {
		// TODO Auto-generated method stub
		return null;
	}
	public MouseMotionListener getMouseMotionListener(){//
		return null;//
	}//
	public MouseListener getMouseListener1(){//
		return null;//
	}//
	
					//	Arrays												ArrayList
	//declaration	int[]numb<--primitive type								ArrayList<Integer>nums<--wrapper class make primitive type Capital and spelled out
	//instatiation	nums = new int[5];										numbs = new ArrayList<Integer>() <-- don't need to say how long it is  
	//adding items	nums[i] = 4;<-overrides element int i					nums.add(new Integer(5)) needs to create instance of a class <- appends to LIst increases size
	//length/size	nums.length												numbs.size()
	
	
	
	//Abstract classes cannot be instatiated
	//Don't want to instantiate yet
	//ArrayList is a type of List same thing 
}
