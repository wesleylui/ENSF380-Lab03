/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Person {
	// Member Variables
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected String address;

	private static int lastPersonalNumber;
	
	// Constructor
	
	// Getters
	public String getName() { return this.name; }
	// not sure about if Person has this, or if this is how you do it
	
	// More Methods
	protected static String nextPersonalNumber(short type) {
		// returns a String
	}
	
	public boolean hasValidAddress() {
		// returns a boolean
	}
}
