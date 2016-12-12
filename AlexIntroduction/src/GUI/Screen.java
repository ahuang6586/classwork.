package GUI;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

public abstract class Screen {
	
	private BufferedImage image;
	public Screen(int width, int height) {
		initImage(width,height);
	}
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
		//g.drawString("Hello World", 40, 100);
		//g.drawOval(20, 60, 100, 50);
	}
	//interface description of methods implement as many interfaces as you want
	//abstract class description of methods and methods only extends one class
	//methods only useful to subclasses that inherit this class
	//instantiation = initialized 
	//can't initialize a abstract class you can write subclasses
	//int[] num
	//num = new int[5];

}
