package datatypes6;

import java.util.Scanner;

public class StringPractice {

	static Scanner input;
	static String user;
	static int lineCount;
	public static void main(String[] args) {
		
		createAScanner();
		lineCount = 0;
		demonstrateStringMethods();
		promptName();
		talkForever();
		
	}
	

	private static void promptName() {
		print("Hello, human! I am a" + 
	" board covered with "+"semiconductors /n and" 
				+" other such electronic"
				+			" components."
				" /n  What is your name?");
		user = input.nextLine();
		print("Awesome! I will call you" +user+ "until you terminate me."); 
	}


	public static void promptInput() {
		print(user+"Try inputting a String!");
		String userInput = input.nextLine(); 
		print("You typed: " + userInput); //one input
		
		
	}
	public static void print(String s){
		lineCount++;
		System.out.println("Line #+lineCount+": "+s);
	}
	public static void talkForever(){
		while(true){
			promptInput();// forever input
		}
	}
	
	public static void print (String s){
		System.out.println(s);
	}

	public static void createAScanner() {
		input = new Scanner(System.in);
		
	}
	public static void demonstrateStringMethods(){
		// String text = new String("Hello World");
				String text1 = "Hello World";//same as above
				String text2 = "Hello ";//same as above
				String text3 = "World";
				
				
				if(text1.equals ( text2+text3)){
					System.out.println("These strings are equal.");//strings always put .equals
						

				}
				System.out.println(text1);
				System.out.println(text2+text3);
				
				String word1 = "Aardvark";
				String word2 = "Zyzzyva";
				if(word1.compareTo(word2) < 0){
			System.out.println("Word1 is before word2," + "lexicongraphically.");

	}
}
}
