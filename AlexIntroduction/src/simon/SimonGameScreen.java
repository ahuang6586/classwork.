package simon;

import java.awt.Color;
import java.util.ArrayList;

import guis.components.Action;
import guis.components.ClickableScreen;
import guis.components.TextLabel;
import guis.components.Visible;


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

	private ButtonInterfaceSimon randomMove() {
		int select = (int) (Math.random()*buttons.length);
		while(select == lastSelectedButton){
			select = (int) (Math.random()*buttons.length);
		}
		lastSelectedButton = select;
	//	return new Move(buttons[select]);
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
		for(int i = 0; i < numberOfButtons; i++){
			ButtonInterfaceSimon b = getAButton();
			b.setColor(colors[i]);
			b.setX(getWidth()/2+100*(int)Math.cos(Math.PI/3*(i)));
			b.setY(getHeight()/2+100*(int)Math.sin(Math.PI/3*(i)));
			b.setAction(new Action(){
				public void act(){
					Thread blink = new Thread(new Runnable(){

						public void run(){
							b.highlight();
							
							try {
								Thread.sleep(800);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							b.dim();
						
						}
						
						});
					blink.start();
					
					if(acceptingInput){
						//if the user's button matches sequence
						if(b==moves.get(sequenceIndex).getButton())
							sequenceIndex++;
						else{
							progress.gameOver();
							return;
						}	
					}
					if(moves.size()==sequenceIndex){
						Thread nextRound = new Thread(SimonGameScreen.this);
						nextRound.start();
						
					}
				}

				
			});
			viewObjects.add(b);
		}
	}
	private ButtonInterfaceSimon getAButton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void run() {
		 label.setText("");
		    nextRound();
		
	}

	private void nextRound() {
		acceptingInput=false;
		roundNumber++;
		moves.add((MoveInterface) randomMove());
		progress.setRound(roundNumber);
		progress.setSequenceSize(moves.size());
		changeText("Simon's turn!");
		label.setText("");
		playSequence();
		acceptingInput=true;
		sequenceIndex=0;
		
	}

	private void playSequence() {
		ButtonInterfaceSimon b=null;
		for(int i=0; i<moves.size();i++){
			if(b!=null)
				b.dim();
			
			b=moves.get(sequenceIndex).getButton();
			b.highlight();
			int sleepTime=1000*(int)Math.exp(roundNumber);
			try {
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		b.dim();
		
	}

	private void changeText(String string) {
		// TODO Auto-generated method stub
		
	}

}
