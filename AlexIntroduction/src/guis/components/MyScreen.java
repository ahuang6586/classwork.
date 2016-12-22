package guis.components;

import java.awt.Color;
import java.util.ArrayList;

import GUI.Screen;

public class MyScreen extends Screen{

	
	private Visible face;
	public MyScreen(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}
	public void initObjects(ArrayList<Visible> viewObjects) {
		
		face = new Graphic(30,40,100,100,"resources/sampleImages/face.jpg");
		viewObjects.add(face);
	}
	
	
}
