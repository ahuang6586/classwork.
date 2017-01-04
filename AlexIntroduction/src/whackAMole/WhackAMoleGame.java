package whackAMole;

import GUI.GUIApplication;

public class WhackAMoleGame extends GUIApplication {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public WhackAMoleGame(int width, int height) {
		super(width, height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void initScreen() {
		// TODO Auto-generated method stub
		WhackAMoleScreen wams = new WhackAMoleScreen(getWidth(),getHeight());
		setScreen(wams);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WhackAMoleGame wamg = new WhackAMoleGame(800,500);
		Thread game = new Thread(wamg);
		game.start();
	}

}
