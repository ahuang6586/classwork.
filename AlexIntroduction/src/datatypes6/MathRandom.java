package datatypes6;
import java.util.Random;

public class MathRandom {

	public MathRandom() {
		
	}

	public static void main(String[] args) {
		int[] results = new int[6];
		//same as 
		// int[] results = {0,0,0,0,0,0};
		int totalRolls = 10000;
		for(int index = 0; index < totalRolls; index++){
			int roll = rollUnfairDie();
			System.out.println("Roll #"+(index+1)+ " Die is"+rollUnfairDie());
			results[roll-1]++;
		}
		for(int i = 0; i < 6; i++){
			int percentage = (int) (100*((double)results[i]/totalRolls));
			System.out.println((i+1)+" was rolled "+ percentage+"%.");
		}
		
	}
	
	//public static int rollFairDie(){
	//	Random gen = new Random();
	//	return gen.nextInt(6)+1;
		//double rand = Math.random();//creates random double (0,1) rand can only numbers between 0 and 1
	//	int roll = (int) (6 * rand);//[0,5] 
		//return roll + 1; // 0 becomes 1, 5 becomes 6
	//}
	public static int rollUnfairDie(){
		double rand = Math.random();
		int roll = (int) (6 * rand);
		if (roll == 6)
		return roll - 1;
		
		
		return roll;
		
		
		
	}
}
