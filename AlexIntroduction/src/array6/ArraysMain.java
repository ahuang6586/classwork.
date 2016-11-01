
package array6;

public class ArraysMain {
	public static void main(String[] args){
		// This is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();arrayIntroMethod();

		SampleElement sample = new SampleElement(10);
		sample.increase();
		System.out.println("The sample element has" +"a number equal to"+sample.getNumber());
		
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime-startTime)+ "milliseconds");
		
		int[] fifty = new int [50];
		populateDieArray(dieArray);
		
		static int[] dieArray = new int[10000];
		static int[] results = new int[11];
	}
	private static void passByValueDemonstration(){
		String[] someStrings = new String[100];
		populateArray(someStrings);
		printArray(someStrings);
		int ten = 10;
		increase(ten);
		System.out.println("ten, increased is "+ten);
		
		//in this method,we pass the element
		//(a variable) not the array,so
		//no change will be made
		// change local not value you pass by
		// equal changes what its pointing to
		
		System.out.println("Before "+someStrings[99]);
		changeString(someStrings[99]);
		System.out.println("After \" changeString\" method"+someStrings[99]);
		changeArray(someStrings);

		System.out.println("After \" changeArray\" method"+someStrings[99]);
		changeArrayElement(someStrings,99);
		System.out.println("After \" changeArrayElement\" method"+someStrings[99]);
	}
	private static void changeArrayElement(String[] someStrings, int i) {
		someStrings[i] = "new item "+(i+1);
		
	}
	private static void changeArray(String[] someStrings) {
		someStrings = new String[100];
		for(int i = 0; i < someStrings.length; i++){
			someStrings[i] = "new item "+(i+1);
		}
		
	}
	private static void increase(int x){
		x = x +1;
		//variables do no change
		//arrays do
	}
	private static void changeString(String s){
		s = "This string has been changed";
	}
	//this method does nothing, since local variables
	//are destroyed after the method is complete
	private static void populateArray(String[] a) {
		for(String s: a){
			System.out.println(s);
		}
		
	}
	private static void printArray(String[] a) {
		for(int index=0; index < a.length; index ++){
			a[index] = "value "+(index+1);
		}
		
	}
	public static void arrayIntroMethod(){
		int[] zeros1 = {0,0,0};
		int[] zeros2 = new int[3];
		
		boolean[] booleans = new boolean[3];
		//iterate (2 ways)
		//WHEN TO USE THIS LOOP
		//FIRST METHOD: "fOR lOOP"
		//same type of object array
		// - the index of the data is important to reference
		// - you need to customize how you iterate
		// (increase by 2, backwards, etc)
		
		
		//SECOND METHOD: "FOR-EACH"
		// always goes in order, does not keep track of index
		//easier to type
		for(int index = 0; index< booleans.length; index ++ ){
			System.out.println(index+") "+booleans[index]);
		}
		
		//these two constructors are different
		
		
	//a
	for(boolean b: booleans){
		System.out.println(""+b);
	}
	String[] strings1 = {"","",""};
	String[] strings2= new String [100];
	
	//this loop instatiating the strings
	for(int index=0; index < strings2.length; index ++){
		strings2[index] = "value "+(index+1);
	}
	// this loop prints the strings
	for(String s: strings2){
		System.out.println(s);
	}
	}
	public static void arrayFifty(int[]fifty){
	
		for(int index = 0; index < fifty.length; index++ ){
			fifty[index] =  index+1;
	
	}
//		
//	}
//	public static void randomArray(){
//		String[] firstStrings = new String[10];
//		for(int index = 0; index < firstStrings.length; index ++ ){
//			firstStrings[index] =  (int)(Math.random() * 100);
//			
//		}
//	}
		
	private static void populateDieArray(int[] array){
		for(int i = 0; i < array.length;i++){
			int firstRoll = randInt(1,6);
			int secondRoll = randInt(1,6);
			array[i] = firstRoll + secondRoll;
			System.out.println(array);
		}
	}
	private static void populateResultsArray(int[] ){
		for(int d = 0; d<numsRolled.length;d++){
			results[numsRolled[d]-2]++;
		}
	
	}
	private static void printResults(int[] arr){
		for(int i = 0; i<arr.length;i++){
			System.out.println((i+2)+"is rolled "+
		((double)arr[i]/dieArray.length*100));
		}
	}
		public static void deckOfCards(){
		int deck[] = new int [52];
		String[] suits = {"Clubs","Hearts","Spades", "Diamonds"};
		
		String[] ranks = {"Ace","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Jack","Queen","King"};	
				for (int i = 0; i < 52; i++){

		            String suit = suits[deck[i] / 13];

		            String rank = ranks[deck[i] % 13];

		            System.out.println ("");

		        }
		}
	}
	

