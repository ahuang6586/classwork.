package sort;

public class Differentsorts {

	public Differentsorts() {
	
	  
	}
	public static void main(String [] args){
		

	}
	  
	public double getAverage(double[] values){
	     double sum=0.0;
	     for(int i = 0; i<values.length; i++){
	        sum+=values[i];
	     }
    return sum/values.length;
}
	public boolean isPrime1(int n){
		long start = System.currentTimeMillis();   
		boolean prime = true;
		    for(int i = 2; i<n; i++){
		        if(n%i==0) prime = false;   
		     }
		    
		    	return prime;
		    
		   
	}
	
	
	 public boolean isPrime2(int n){
			      boolean prime = true;
			     for(int i = 2; i<Math.sqrt(n); i++){
			          if(n%i==0) prime = false;   
			    }
			     return prime;
			 }
	 public boolean isPrime(int n){
		     boolean prime = true;
		    double sqrt = Math.sqrt(n);
		     for(int i = 2; i<sqrt; i++){
	        if(n%i==0) prime = false;   
	     }
		    return prime;
		}
}
