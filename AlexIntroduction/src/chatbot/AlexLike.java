package chatbot;

public class AlexLike implements Topic{
	private boolean inLikeLoop;
	private String likeResponse;
	public void talk(){
		Main.print("What are some things you like?");
		inLikeLoop = true;
		while(inLikeLoop){
			likeResponse = Main.getInput();
			int likePsn = Main.findKeyWord(likeResponse,"like",0);
			if( likePsn >= 0){
				String thingsLiked = likeResponse.substring(likePsn+5);
				Main.print("You are such an interesting" + "person, because you like "+thingsLiked);
				if(Main.findKeyWord(thingsLiked,"school", 0) >= 0){
					inLikeLoop = false;
					Main.school.talk();
				}
				inLikeLoop = false;
				Main.talkForever();
			}else{
				Main.print("I don't understand you.");
				
			}
		}
	}
	public boolean isTriggered(String userInput) {
		String[] triggers = {"school","class","teacher"};
		//you could use a for loop
		//to iterate through an array
		if(Main.findKeyWord(userInput, "like", 0) >=0 ){
			return true;
		}
		if(Main.findKeyWord(userInput, "class", 0) >=0 ){
			return true;
		}
		return false;
	}
}
