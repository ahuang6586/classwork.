package guis.components;


import java.awt.image.BufferedImage;
public interface Visibile {
	public BufferedImage getImage();
	public int getX();
	public int getY();
	public int getWidth();
	public int getHeight();
	public boolean isAnimated();
	public void update();
}
