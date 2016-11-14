package caveExplorer;

public class PracticeClass {
	
	public static void main(String[] args){
		String[][] arr2D = new String[10][12];
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length;col++){
				arr2D[row][col] =" ";
			}
			
		}
		arr2D[1][2]= "O";
		arr2D[1][2]="|";
		
		
		for(int col = 0; col < arr2D[0].length; col++){
			arr2D[0][col]="_";
			arr2D[arr2D.length -1][col]="_";
		}
		for(int row = 1; row < arr2D.length; row++){
			arr2D[row][0] ="|";
			arr2D[row][arr2D[0].length-1] ="|";
			
		}	
		for(int row = 1; row < arr2D.length; row++){
			arr2D[row][2] ="|";
			arr2D[row][arr2D[2].length-1] ="|";
			
		}		
		for(int col = 0; col < arr2D[0].length; col++){
			arr2D[2][col]="_";
			arr2D[arr2D.length -1][col]="_";
		}
		
		
//		for(int row = 4; row <arr2D.length-3; row++ ){
//			for(int col = 0; col < arr2D[row].length;col++){
//				arr2D[row][col] =" O ";
//				
//			}
//		}
//		for(int row = 5; row <arr2D.length-4; row++ ){
//			for(int col = 0; col < arr2D[row].length;col++){
//				arr2D[row][col] ="-|-";
//				
//			}
//		}
//		for(int row = 6; row <arr2D.length-5; row++ ){
//			for(int col = 0; col < arr2D[row].length;col++){
//				arr2D[row][col] =" ^ ";
//				
//			}
//		}
//		for(int row = 7; row < arr2D.length; row++){
//			for(int col = 0; col < arr2D[row].length;col++){
//				arr2D[row][col] ="M";
//			}
//			
//		}
		printPic(arr2D);
	}
	
	public static void printPic(String[][] arr2D){
		
		for(int row = 0; row < arr2D.length; row++){
			for(int col = 0; col < arr2D[row].length;col++){
				System.out.print(arr2D[row][col]);
			}
			System.out.println();
		}
	}
			
		
	
}
	
	


