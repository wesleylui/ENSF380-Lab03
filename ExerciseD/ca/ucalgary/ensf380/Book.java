/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public abstract class Book {
	// class variables
	private String isbn;
	private int publicationYear;
	private int pages;
	
	// default constructor when no arguments are passed
	public Book(){
		this.isbn = "";
		this.publicationYear = 0;
		this.pages = 0;
	}
	
	// constructor when passed isbn and pages
	public Book(String isbn, int pages){
		this.isbn = isbn;
		this.pages = pages;
		this.publicationYear = 0;
	}
	
	// getters
	public String getIsbn(){
		return this.isbn;
	}
	
	public int getPublicationYear() {
		return this.publicationYear;
	}
	
	public int getPages() {
		return this.pages;
	}
	
	// setters
	public void setIsbn(String isbn) {
		this.isbn = isbn;
		return;
	}
	
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
		return;
	}
	
	public void setPages(int pages) {
		this.pages = pages;
		return;
	}
}

