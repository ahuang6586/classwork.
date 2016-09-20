/**
 * 
 */
package introUnit;

/**
 * @author Student 6
 *
 */
public class OOPExample {

	/**
	 * This class is designed to contrast with the 
	 * ProceduralExample. It embodies an Object-Oriented
	 * approach
	 */
	public static void main(String[] args) {
		//construct a student
		Student jillian = new Senior("Jillian","programmer");
		Student jordan = new Student("Jordan","engineer");
		Student jason = new Student("Jason","scientist");
		jillian.talk();
		
		
		
		jordan.talk();
		jason.talk();
		

	}

}
