/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Anthology {
	// class variable
	private Story[] stories;
	
	// getter
	public Story[] getStory() {
		return this.stories;
	}
	
	// setter
	public void setStory(Story[] stories) {
		this.stories = stories;
		return;
	}
	
	// extra method
	
	public String storyOrder() {
		return "Method storyOrder called from Anthology"; 
	}
}
