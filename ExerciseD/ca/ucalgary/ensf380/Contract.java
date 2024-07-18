/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Contract {
	// class variables
	private String date;
	private Publisher publisherInfo;
	private Author[] authorInfo;
	
	// getters
	public String getDate() {
		return this.date;
	}
	
	public Publisher getPublisherInfo() {
		return this.publisherInfo;
	}
	
	public Author[] getAuthorInfo() {
		return this.authorInfo;
	}
	
	// setters
	public void setDate(String date) {
		this.date = date;
		return;
	}
	
	public void setPublisherInfo(Publisher pub) {
		this.publisherInfo = pub;
		return;
	}
	
	public void setAuthorInfo(Author[] info) {
		this.authorInfo = info;
		return;
	}
	
	// extra methods
	
	public String printContract() {
		return "Method printContract called from Contract";
	}
}
