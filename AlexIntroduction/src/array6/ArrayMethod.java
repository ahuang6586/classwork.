package array6;

import java.lang.reflect.Array;

public class ArrayMethod {
	public static void main(String[] args){
		int[] arr = {2,3,4,6,9,11,12,15,3,4,6,7,};
		int[] subArr = getSubArray(arr,12,16);
		contains(arr, subArr);
		swap(arr, 0, arr.length-1);
		shuffle(arr);
		
		
		
// unsorted,issorted,reverseorder,cyclethrough,count dif		
//		checkHalfway(arr,12,0,arr.length-1);
//		if(checkHalfway(arr,12,0,arr.length-1)){
//			System.out.println("The number you are" +"searching for is"+
//		"less than the value in the"
//				+"middle of the array");
//		}
//			else{
//				System.out.println("The number you are searching for is greater than or equal to the value in the middle of the array");
//			}
	}

private static void shuffle(int[] arr) {
		for(int i = 0; i <  arr.length; i++){
			int random = (int)(Math.random()*arr.length);
			swap(arr,i,random);
			System.out.print(arr[i]+" ,");
		}
			System.out.println(arr[arr.length-1]);
		
	}

private static void swap(int[] arr, int i, int j) {
		int placeholder = arr[j];
		arr[j] = arr[i];
		arr[i] = placeholder;
		//set j as the number
		//make i and j the same
		// use place holder to make i
		
	}
public static int[] getSubArray(int[] arr, int startIndex, int endIndex){
	int[] subArray = new int[endIndex - startIndex + 1];
	for(int i = 0; i < subArray.length; i++){
		subArray[i] = arr[startIndex+ i];
	}
	return subArray;
}
/** 
 * returns true if arr contains subArray sequence
 * @param arr
 * @param subArray
 */
public static boolean contains(int[] arr, int[] subArray){
	for(int i = 0; i < arr.length; i++){
		
			//check the rest of the elements
			int j = 0;
			while(j < subArray.length){
				if(subArray[j] == arr[i + j] && j == subArray.length - 1){
					return true;
				}else if(subArray[j] != arr[i + j]){
					break;
				}
				j++;
		}
			
	}
	

	return false;
}
/**
 * return true if searchValue is less than element
 * halfway between beginning and end
 * @param arr the int[] to be searched
 * @param i
 * @param j
 * @param length
 */	

	/**
	 * returns number of elements in arr less than d
	 * @param arr
	 * @param d
	 * @return
	 */
	public static int countUnderBound(double[] arr, double d){
		int underCount = 0;
		for(double i:arr){
			if(i<d){
				underCount++;
			}
			
	}
		return underCount;
	}
	public static void pickRandom (int[] arr){
		
		int [] randArr = new int[arr.length-1];
		for(int i =0; i<randArr.length; i++){
		int toAdd = arr[(int)Math.random()*arr.length];
		while(indexOf(randArr,toAdd)> -1){
			
			toAdd= arr[(int)Math.random()*arr.length];
			
		
		
		
				}
			randArr[i]=toAdd;
			}
	}
	public static int indexOf(int[]arr, int ranNum){
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]==ranNum)
			
			    return i;
			
		}
		return -1;
    }
	private static void testPrimes(int numberToTest){
		int lastToCheck = (int)(Math.sqrt(numberToTest));
		boolean[] theNumbers = new boolean[numberToTest];
		for(int i=0; i < numberToTest; i++){
			theNumbers[i] = true;
		}
		theNumbers[0] = false;
		theNumbers[1] = false;
		for(int prime = 2; prime <= lastToCheck; prime++){
			
		if(theNumbers[prime]){//only check numbers that are prime
			//numbers that haven't been "crossed off"
			//won't check 4 and 6(crossed off by 2) 
		System.out.println("/n"+prime + " is prime." + "Crossing off:");
		int increment = prime;
		for(int test = prime + increment; test < numberToTest; test = test+prime){
			//when checking 50 numbers
			//test 2,3,4,5,6,7 as if prime
			
				System.out.print(test+", ");
				theNumbers[test] = false;
				
		
			
				}
			}
		}
	
			for(int i = 0; i < theNumbers.length; i++){
				if(theNumbers[i]){
					System.out.println(i+"is prime.");
			}
		}
	}
		
	
	
//	private void cycleOnce(int[] array){
//		
//	}
//	public static void cycleThrough(int [] array){
//		
//		for (int i = 0; i < array.length; i++){
//			cycleOnce();
//		}
//	}
//	private static boolean checkHalfway(int[] arr, int searchValue, int begin, int end) {
//		return searchValue < arr[(begin+end+1)/2];
//	}
//	
//}
//public static void selectionSort(int[] array){
//System.out.println("Selection sort with "+Arrays.toString(array));
//for (int i = 0; i < array.length - 1; i++){
//    int tempLowIndex = i;
//    for (int j = i + 1; j < array.length; j++){
//        if (array[j] < array[tempLowIndex]){
//            tempLowIndex = j;
//        }
//    }
//   if(tempLowIndex!=i){
//         swap(array, tempLowIndex, i);
//         System.out.println("becomes "+Arrays.toString(array));
//   } 
//   }//end for
//System.out.println("Ends as "+Arrays.toString(array));
}//end method

