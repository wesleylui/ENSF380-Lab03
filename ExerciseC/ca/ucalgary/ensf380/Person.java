/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Person {
	// Member Variables
	protected String name;
	protected String phoneNumber;
	protected String emailAddress;
	protected Address address;
	private static int lastPersonalNumber = 0;

	// Constructor
	public Person(String name, String phoneNumber, String emailAddress, Address address) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailAddress = emailAddress;
		this.address = address;
		lastPersonalNumber++;
	}

	// Getters
	public String getName() {
		return this.name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public Address getAddress() {
		return this.address;
	}

	public int getLastPersonalNumber() {
		return this.lastPersonalNumber;
	}

	// Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// no setter for lastPersonalNumber because its a final variable.

	// More Methods
	protected String nextPersonalNumber(short type) {
		return String.format("PN%04d-%d", lastPersonalNumber, type);
	}

	public boolean hasValidAddress() {
		// basic check to see if address exists
		// calls validate function from address class
		return address != null && address.validate();
	}
}
