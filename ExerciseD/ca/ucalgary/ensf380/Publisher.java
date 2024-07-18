/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Publisher {
	// class variables
	private String name;
	private String address;
	private Classic[] classicCatalog;
	
	// constructor
	public Publisher(String name, String address) {
		this.name = name;
		this.address = address;
	}
	
	// getters
	public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Classic[] getClassicCatalog() {
        return classicCatalog;
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
    
    public void setClassicsCatalog(Classic[] classics) {
    	this.classicCatalog = classics;
    	return;
    }
    
    // extra methods
    public String printLetterhead() {
    	return "Method printLetterhead called from Publisher";
    }
}
