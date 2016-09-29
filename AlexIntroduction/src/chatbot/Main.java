package chatbot;

import java.util.Scanner;
public class Main {static Scanner input;
static String user;
static boolean inLoop;
static String response;
static int lineCount;
static Topic school;
static Topic like;
static Topic hello;
public static void main(String[] args) {
	
	createTopics();
	promptName();
	talkForever();
	

	
}


public static void promptName() {
	print("Hello, human! I am a board covered with "+"semiconductors and other such electronic components.What is your name?");
	user = input.nextLine();
	print("Awesome! I will call you "+user+" until you terminate me."); 
}


public static void promptInput() {
	print("Try inputting a String!");
	String userInput = input.nextLine(); 
	print("You typed: " + userInput); //one input
	
	
}
public static String getInput(){
	return input.nextLine();
	
}
public static void print(String s){
	//create a multi-line String
	String printString = "";
	int cutoff = 35;
	//check to see if there are words to add
	//(in other words, is the length of s >
	
	while(s.length()>0){
		String currentLine = "";
		String nextWord = "";
		//while the currentLine and nextWord are less
		//than the cutoff, AND there are still words to add
		//do the following loop
		while(currentLine.length() + nextWord.length() <= cutoff && s.length() > 0){
			// add the next word to the line
			currentLine += nextWord;
			// remove that word
			s = s.substring(nextWord.length());
			//get the following word
			int endOfWord = s.indexOf(" ");
			//check to see if this is the last word
			if(endOfWord == -1){
				endOfWord = s.length() -1;
			}
			nextWord = s.substring(0, endOfWord+1);
			
		}
		printString += currentLine + "\n";
	}
		System.out.println(printString);
}
public static void talkForever(){
	inLoop = true;
	while(inLoop){
		print("Greetings, "+user+" . How are you? ");
		response = getInput();
		if(findKeyWord(response, "good", 0)>=0){
				print("I'm so happy you're good.");
		}
		else if (findKeyWord(response, "school", 0) >= 0){
			inLoop = false;//exit this loop
			school.talk();
		}	
		else if (like.isTriggered(response)){
			inLoop = false;
			like.talk();
		}
		else if (hello.isTriggered(response)){
				inLoop = false;
				hello.talk();
		}
		else if (school.isTriggered(response)){
			inLoop = false;
			school.talk();
	}
		else
		print("I'm sorry, I don't understand you.");
		
	}
}

public static int findKeyWord(String searchString, String key, int startIndex) {
	//delete white space
	String phrase = searchString.trim();
	//set all letters to lowercase
	phrase = phrase.toLowerCase();
	key = key.toLowerCase();
	
//	System.out.println("the phrase is "+phrase);
//	System.out.println("the key is "+key);
	
	//find position
	int psn = phrase.indexOf(key);
	System.out.println("the position found is "+psn);
	//keep looking for the word until you find the right context
	while(psn >= 0){
		String before = " ";
		String after = " ";
		//if the phrase does not end with this word
		if(psn + key.length() < phrase.length()){
			after = phrase.substring(psn + key.length(), psn + key.length()+1).toLowerCase();
//		System.out.println("The character after " + key + " is "+after);
		}
		//if the phrase does not begin with this word
		// if good is the first there is no space so it wont work
		if(psn >0){
			before = phrase.substring(psn-1,psn).toLowerCase();
//			System.out.println("The character before " + key + " is "+before);
		}
		if(before.compareTo("a") < 0 &&
				after.compareTo("a") < 0){
			System.out.println(key+" was found at "+psn);
		if(noNegations(phrase, psn)){
			return psn;	
		}
			
		}
		//in case the keyword was not found yet,
		//check the rest of the string
		// substring gets part of string
		psn = phrase.indexOf(key,psn+1);
//		System.out.println(key+" was not found." + "Checking "+psn);
	}
	return -1;
}
private static boolean noNegations(String phrase, int index) {
	//check for word "NO" (3 characters)
	//check to see if there is space for the word
	//"NO" to be in front of the index
	if(index - 3 >=0 && phrase.substring(index-3,index).equals("no ")){
		return false;
	}
	// check for not
	if(index - 4 >=0 && phrase.substring(index-4,index).equals("not ")){
		return false;
	}
	//check for never
	if(index - 6 >=0 && phrase.substring(index-6,index).equals("never ")){
		return false;
		
	}
	if(index - 4 >=0 && phrase.substring(index-4,index).equals("n't ")){
		return false;
	}
	return true;
}


//helper method a method that contributes functionality 
//to another method
//They also help make methods more readable
//this method is private because it is only used by the method it
//is helping


public static void createTopics() {
	input = new Scanner(System.in);
	school = new School();
	like = new AlexLike();
	hello = new AlexHello();
}

}
