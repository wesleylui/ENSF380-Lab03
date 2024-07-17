/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Story {
	// class variable
	private Author[] theAuthors;
	
	// getter
	public Author[] getTheAuthor() {
		return this.theAuthors;
	}
	
	// setter 
	public void setTheAuthor(Author[] authors) {
		this.theAuthors = authors;
		return;
	}
	
	// extra methods 
	public String plot() {
		return "Method plot called from Story"; 
	}
}
