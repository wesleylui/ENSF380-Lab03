/*
 * @author Aiden Lambert, Wesley Lui 
 */
public class Address {
	// Member Variables
	private String street;
	private String city;
	private String state;
	private String postalCode;
	private String country;

	// Constructor
	public Address() {

	}

	// Getters
	public String getStreet() {
		return this.street;
	}

	public String getCity() {
		return this.city;
	}

	public String getState() {
		return this.state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	// Setters
	public void setStreet(String street) {
		this.street = street;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// More Methods
	public boolean validate() {
		// Check if the address exists or not
	}

	public String outputAsLabel() {
		// Method to output address as a label
		// Ex:
	}
}
