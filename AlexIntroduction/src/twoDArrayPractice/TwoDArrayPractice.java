/**
 * 
 */
/**
 * @author Student 6
 *
 */
package twoDArrayPractice;

import java.util.Scanner;

public class TwoDArrayPractice {
	private static Scanner in;
	public static void main(String[] args){
		int coordX = 5;
		int coordY = 5;	
		
		int x = 0; 
		int y = 0;
		
		 while (true) {
	            System.out.println("You are in room " + x + " " + y + ". What do u want to do? Enter:");
	            System.out.println("w, a, s, d");
	            print(coordY, coordX, y, x);
	            String input = in.nextLine();
	 
	            if (input.equals("w") && y + 1 < coordY) {
	                y++;
	            } 
	            else if (input.equals("a") && x > 0) {
	                x--;
	            } 
	            else if (input.equals("s") && y > 0) {
	                y--;
	            } 
	            else if (input.equals("d") && x + 1 < coordX) {
	                x++;
	            }
		 }
	}
	 public static void print(int coordX, int coordY, int x, int y) {
	        for (int j = 0; j != coordX; j++) {
	            System.out.print("____");
	        }
	        System.out.println();
	        
	        for (int i = 0; i != coordY; i++) {
	            for (int j = 3; j > 0; j--) {
	                for (int k = 0; k != coordX; k++) {
	                    if (j == 1) {
	                        System.out.print("|___");
	                    } else {
	                        if (j == 2 && i == coordX && k == coordY) {
	                            System.out.print("| X ");
	                        } else {
	                            System.out.print("|   ");
	                        }
	                    }
	                }
	                System.out.println("|");
	            }
	        }
	    }
	 }