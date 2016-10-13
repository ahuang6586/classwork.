
package array6;

public class ArraysMain {
	public static void main(String[] args){
		// This is how you time how quickly a computer processes
		long startTime = System.currentTimeMillis();arrayIntroMethod();
		String[] someStrings = new String[100];
		populateArray(someStrings);
		
		
		changeString(someStrings[99]);
		
		printArray(someStrings);
		long endTime = System.currentTimeMillis();
		System.out.println("Completed method in " + (endTime-startTime)+ "milliseconds");
		
	}
	private static void changeString(String s){
		s = "This string has been changed";
	}
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
}
