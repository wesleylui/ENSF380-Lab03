/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Novel extends Fiction {
	// class variables
	private Author[] theAuthors;
	private Series mySeries;
	
	// getters
	
	public Author[] getTheAuthor() {
		return this.theAuthors;
	}
	
	public Series getMySeries() {
		return this.mySeries;
	}
	
	// setters
	
	public void setTheAuthor(Author[] authors) {
		this.theAuthors = authors;
		return;
	}
	
	public void setMySeries(Series series) {
		this.mySeries = series;
		return;
	}
	
	// extra methods
	
	public String theme() {
		return "Method theme called from Novel";
	}
}
