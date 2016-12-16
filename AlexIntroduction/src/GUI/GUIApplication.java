package GUI;
import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{
	//FIELDS
	private Screen currentScreen;
	//demo purposes only
	
	public GUIApplication(int width,int height) {
		super();
		setBounds(20,20,width,height);
		//terminate program when window is closed
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initScreen();
		//setVisible(true);
	}
	public abstract void initScreen();
		

	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	public void setScreen(Screen s){
		if(currentScreen!=null){
			MouseListener ml =currentScreen.getMouseListener();
			if(ml != null)removeMouseListener(ml);
			MouseMotionListner mml = currentScreen.getMouseMotionListener();
			if(mml!=null)removeMouseMotionListener(mml);		
		}
		currentScreen = s;
		if(currentScreen !=null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseListener());
		}
	}
	public void run(){
	 while(true){
		 //redraws the display
		 currentScreen.update();
		 //update the window
		 repaint();
		 Thread.sleep(30);
	 }
	}
}
