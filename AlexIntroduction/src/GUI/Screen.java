package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import guis.components.Visible;
import java.awt.event.MouseListener;//
import java.awt.event.MouseMotionListener;//
public abstract class Screen {
	
	private BufferedImage image;
	private ArrayList<Visible> viewObjects;
	public Screen(int width, int height) {
		viewObjects = new ArrayList<Visible>();
		initObjects(viewObjects);
		initImage(width,height);
	
	}
	public abstract void 
	initObjects(ArrayList<Visible> viewObjects);
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
	public void update() {
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
		for(int i = 0; i < viewObjects.size(); i++){
			Visible v = viewObjects.get(i);
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
	public void addObject(Visible v){
		viewObjects.add(v);
	}
	public void remove(Visible V){
		/**
		 * Note:: in this implementation, we have
		 * a very simple command: remove(v)
		 * however, remove is sorta a big deal on the AP exam.
		 * Here's why:
		 * 
		 * When an object is removed from a List, every other
		 * object AFTER  that object is moved up in order
		 * Therefore,all of their respective indices change. You MUST MUST MUST be aware of this
		 * 
		 * Here is a CLAAAAASSSIC example:
		 * 
		 * The following is WRONG
		 * Suppose you have a List<Integer> with
		 * {4,8,7,1}
		 * and you want to remove all integers greater than 5
		 * You do this
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 * 	if(list.get(i) > 5) list.remove(i)
		 * }
		 * You FAILLLLLLLLLLLL!!!!!!!!!
		 * 
		 * Why do you fail?
		 * i=0, nothing changes
		 * i=1, the '8' is removed
		 * now we have:
		 * {4,7,1}
		 * i=2
		 * nothing changes
		 * i=3 exit the for loop. We have
		 * {4,7,1}
		 * 
		 * THESE TWO WAYS ARE CORRECT:
		 * for(int i = 0; i < list.size(); i++){
		 * 	while(list.get(i) > 5) list.remove(i);
		 * }
		 * 
		 * for(int i = 0; i < list.size(); i++){
		 * 	if(list.get(i) > 5) {
		 * 	list.remove(i);
		 * 	i--;//compensate for i++
		 * }
		 * 
		 * 
		 * 
		 * 
		 * for the same reason, this doesn't even work
		 * because the size can be changed
		 * for(Integer i: list){
		 * if( i > 5) list.remove(i);
		 * }
		 * 
		 * ONE MORE NOTE:
		 * If you call list.remove(int)
		 * it will return the object being removed at that index
		 * So you could do something like this
		 * System.out.println(list.remove(0).toString() + "was removed.");
		 */
		viewObjects.remove(V);
	}
	public void moveToBack(Visible v){
		if(viewObjects.contains(v)){
			
			viewObjects.remove(v);
			//the "back" is index 0
			viewObjects.add(0,v);
			//This moves everything else forward in the list
		}
	}
	public void moveToFront(Visible v){
		if(viewObjects.contains(v)){
			viewObjects.remove(v);
			viewObjects.add(v);
		}
	}
					//	Arrays												ArrayList
	//declaration	int[]numb<--primitive type								ArrayList<Integer>nums<--wrapper class make primitive type Capital and spelled out
	//instatiation	nums = new int[5];										numbs = new ArrayList<Integer>() <-- don't need to say how long it is  
	//adding items	nums[i] = 4;<-overrides element int i					nums.add(new Integer(5)) needs to create instance of a class <- appends to LIst increases size
	//length/size	nums.length												numbs.size()
	
	
	
	//Abstract classes cannot be instatiated
	//Don't want to instantiate yet
	//ArrayList is a type of List same thing 
}
