/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Classic extends Hardcover {
	// class variables
	private int origPubYear = 1860;
	private Author theAuthor;
	private Publisher[] bookPublisher;
	
	// getters
	public int getOrigPubYear() {
		return this.origPubYear;
	}
	
	public Author getTheAuthor() {
		return this.theAuthor;
	}
	
	public Publisher[] getBookPublisher() {
		return this.bookPublisher;
	}

	// setters
	
	public void setOrigPubYear(int year) {
		this.origPubYear = year;
		return;
	}
	
	public void setTheAuthor(Author author) {
		this.theAuthor = author;
		return;
	}
	
	public void setBookPublisher(Publisher[] pub) {
		this.bookPublisher = pub;
		return;
	}
	
	// extra methods
	
	public String createNotes() {
		return "Method createNotes called from Classic";
	}
}
