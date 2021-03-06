package guis.components;

public class Class {
	public static boolean [][] grid;
	public static void main(String[] args) {
		grid = new boolean[5][5];
		printBoard(grid);
		buttonClick(3,3);
		printBoard(grid);
		buttonClick(3,3);
		printBoard(grid);
	}
	public static void switchRow(boolean[] row, int x){
//		for(int i = -1; i<2; i++){
//			if(x + i >= 0 && x + i < row.length){
//				row[x+i] = !row[x+i];
//			}
//		}
		if (x >=0 && x < row.length){
			for(int i = -1; i <2; i++){
				if(x + i >= 0 && x + i < row.length){
					row[x+i] = !row[x+i];
				}
			}
		}
	}
	public static void switchColumn(boolean[][] grid, int r, int c){
		switchIfValid(grid,r-1,c);
		switchIfValid(grid,r+1,c);
	}
	public static void switchIfValid(boolean[][] grid, int r, int c){
		if ( r>=0 && r <grid.length && c>=0 && c < grid[r].length){
			grid[r][c] = !grid[r][c];
		}
	}
	public static void buttonClick(int r, int c) {
		if(r >= 0 && r <grid.length){//not on rubric
			switchRow(grid[r],c);
		}
	
		switchColumn(grid,r,c);//we already know grid is a 2d one point
		//check if any lights are on
		boolean win = true;
		for(int i = 0; i < grid.length; i++){
			for(int j=0; j < grid[i].length; j++){
				if(grid[i][j]){
					win=false;
					break;
				
				}
			}
		}
		
			
			
		
		if(win)System.out.println("You have solved the puzzle");
	}
	
	private static void printBoard(boolean[][] grid){
		for(boolean[] row: grid){
			for(boolean b:row){
				if(b)System.out.print("O");
				else System.out.print("X");
			}
			System.out.print("\n");
		}
		System.out.println("--------------");
		
		
	}

}
