package guis.SampleGames;

import GUI.GUIApplication;
import GUI.Screen;
import guis.Screen.CoordinateScreen;
import guis.components.MyScreen;

public class MouseFollower extends GUIApplication {
	public static MouseFollower game;//only one exist
	public static CoordinateScreen cs;
	public static MyScreen MyScreen;
	
	public MouseFollower(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		MyScreen = new MyScreen(getWidth(),getHeight());
		cs = new CoordinateScreen(getWidth(),getHeight());
		setScreen(cs);
	}
	public static void main(String[] args){
		game = new MouseFollower(800,600);
		Thread app = new Thread (game);
		app.start();
	}

}
