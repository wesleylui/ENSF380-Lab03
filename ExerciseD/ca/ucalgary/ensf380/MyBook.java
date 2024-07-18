/*
 * @author Aiden Lambert, Wesley Lui 
 */
package ca.ucalgary.ensf380;

public class MyBook {
	public static void main(String[] args) {
		
		// creating Author Aiden Lambert and Wesley Lui
		Author Aiden = new Author("Aiden Lambert", "1111 S Figueroa St, Los Angeles, CA 90015, United States", 19);
		Author Wesley = new Author("Wesley Lui", "12255 Sky Lane, Los Angeles, California, United States", 19);
		
		// defining a list of authors 
		Author[] authors = {Aiden, Wesley};
		
		// creating a series
		Series GoatDebate = new Series();
		
		// naming the series
		GoatDebate.setSeriesName("Greatest of All Time Debate");
		
		// creating 2 novels
		Novel LeBron = new Novel();
		Novel Jordan = new Novel();
		
		
		// setting the titles, publication years, and page numbers for each novel
		LeBron.setIsbn("The Legend of LeBron James");
		LeBron.setPublicationYear(2024);
		LeBron.setPages(324);
		
		Jordan.setIsbn("The Legend of Michael Jordan");
		Jordan.setPublicationYear(2022);
		Jordan.setPages(298);
	
		// setting the authors for each novel
		LeBron.setTheAuthor(authors);
		Jordan.setTheAuthor(authors);
		
		// setting the series for each novel
		LeBron.setMySeries(GoatDebate);
		Jordan.setMySeries(GoatDebate);
		
		// testing various extra methods implemented
		System.out.println(Aiden.write());
		System.out.println(LeBron.theme());
		System.out.println(GoatDebate.theme() + "\n");
		
		// printing variables belonging to the novels
		System.out.println(LeBron.getIsbn() + " has " + LeBron.getPages() + " pages!");
		System.out.println(Jordan.getIsbn() + " was published in " + Jordan.getPublicationYear());
		System.out.println(Jordan.getIsbn() + " was written by " + Jordan.getTheAuthor()[0].getName() + " and " + Jordan.getTheAuthor()[1].getName() + "\n");
		
		// printing variables belonging to the authors
		System.out.println("Author " +  Aiden.getName() + " lives at " + Aiden.getAddress());
		System.out.println("Author " +  Wesley.getName() + " is " + Wesley.getAge() + " years old" + "\n");
		
		// printing variables belonging to the series
		System.out.println(LeBron.getIsbn() + " is a part of the series " + LeBron.getMySeries().getSeriesName());
	
	}
}



