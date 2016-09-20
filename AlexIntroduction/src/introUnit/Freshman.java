package introUnit;

public class Freshman extends Student {

	private String job;
	
	public Freshman(String name, String job) {
		super(name);
		this.job = job; 
	}
	public void talk(){
		System.out.println("I am a Freshman!");
		System.out.println("I intern as a" +job);

}
	
}
