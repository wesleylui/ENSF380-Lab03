/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Nonfiction extends Paperback {
	// class variable
	private Category deweyClassification;
	
	// methods
	public String topic() {
		return "Method topic called from Nonfiction";
	}
	
	// getter
	public Category getDeweyClassification() {
		return this.deweyClassification;
	}
	
	// setter
	public void setDeweyClassification(Category cat) {
		this.deweyClassification = cat;
		return;
	}
}
