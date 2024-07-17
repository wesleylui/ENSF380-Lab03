/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Category {
	// class variables
	private Category subCategory;
	private Category superCategory;
	private String category;
	
	// getters
	public Category getSubCategory() {
		return this.subCategory;
	}
	
	public Category getSuperCategory() {
		return this.superCategory;
	}
	
	public String getCategory() {
		return this.category;
	}
	
	// setters 
	public void setSubCategory(Category sub) {
		this.subCategory = sub;
		return;
	}
	
	// needed to use capital S because 'super' is a keyword
	public void setSuperCategory(Category Super) {
		this.superCategory = Super;
		return;
	}
	
	public void setCategory(String cat) {
		this.category = cat;
	}
	
}
