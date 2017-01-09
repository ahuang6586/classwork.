package simon;

import java.awt.Color;
import java.util.ArrayList;

import guis.components.ClickableScreen;
import guis.components.TextLabel;
import guis.components.Visible;
import whackAMole.MoleInterface;

public class SimonGameScreen extends ClickableScreen implements Runnable {
	private ArrayList<MoveInterface> moves;
	private TextLabel label;
	private ButtonInterfaceSimon[] buttons;
	private ProgressInterface progress;
	private int roundNumber;
	private	boolean acceptingInput;
	private int sequenceIndex;
	private	int lastSelectedButton;
	public SimonGameScreen(int width, int height) {
		super(width, height);
		Thread app = new Thread(this);
		app.start();
	}

	@Override
	public void initAllObjects(ArrayList<Visible> viewObjects) {
		// TODO Auto-generated method stub
		addButtons();
		progress = getProgress();
		label = new TextLabel(130,230,300,40,"Let's play Simon!");
		moves = new ArrayList<MoveInterface>();
		//add 2 moves to start
		lastSelectedButton = -1;
		moves.add((MoveInterface) randomMove());
		moves.add((MoveInterface) randomMove());
		roundNumber = 0;
		viewObjects.add(progress);
		viewObjects.add(label);

	}

	private Object randomMove() {
		int select = (int) (Math.random()*buttons.length);
		while(select == lastSelectedButton){
			select = (int) (Math.random()*buttons.length);
		}
		lastSelectedButton = select;
		return null;
	
		
		
		
	}
	private Object getMove(ButtonInterfaceSimon b) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	Placeholder until partner finishes implementation of ProgressInterface
	*/
	private ProgressInterface getProgress() {
		// TODO Auto-generated method stub
		return null;
	}

	private void addButtons() {
		// TODO Auto-generated method stub
		int numberOfButtons = 4;
		Color[] colors = {Color.blue,Color.green,Color.yellow,Color.red};
		String[] name = {"BLUE","GREEN","YELLOW","RED",};
		for(int i = 0; i < numberOfButtons; i++){
			buttons[i].setName(name[i]);
			buttons[i].setColor(colors[i]);
			buttons[i].setX(200+(i*20));
		    buttons[i].setY(180+(i*20));
		}
	}

	private ButtonInterfaceSimon getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
