package introUnit;

public class Student {
	
	//field
	private String name;
	
	//constructor (no return type. It creates students)
	public Student(String name){
		//initialize fields
		this.name = name;
		
		
	}
	public void talk(){
		super.talk();//call the super method
		System.out.println("... my name is " + name);
	}
}
