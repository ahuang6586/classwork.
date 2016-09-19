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
		Student jordan = new Student("Jordan");
		Student jason = new Student("Jason");
		jillian.talk();
		
		
		
		jordan.talk();
		jason.talk();
		

	}

}
