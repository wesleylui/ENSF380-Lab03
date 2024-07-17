/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Author {
	// class variables
	private String name = "Unknown";
	private String address;
	private int age;
	
	// constructors
	public Author() {
		this.address = "";
		this.age = 0;
	}
	
	public Author(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	// getters
	
	public String getName() {
		return this.name;
	}
	
	public String getAddress() {
		return this.address;
	}
	
	public int getAge() {
		return this.age;
	}
	
	// setters
	
	public void setName(String name) {
		this.name = name;
		return;
	}	
	public void setAddress(String address) {
		this.address = address;
		return;
	}	

	
	public void setAge(int age) {
		this.age = age;
		return;
	}	

	// extra methods
	
	public String write() {
		return "Method write called from Author";
	}
}
