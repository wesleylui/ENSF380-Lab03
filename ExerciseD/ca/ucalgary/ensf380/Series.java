/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class Series {
	// class variables
	private String seriesName;
	
	// getter
	public String getSeriesName() {
		return this.seriesName;
	}
	
	// setter
	public void setSeriesName(String name) {
		this.seriesName = name;
		return;
	}
	
	// extra methods
	
		public String theme() {
			return "Method theme called from Series";
		}
}
