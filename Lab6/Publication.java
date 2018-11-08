/** 
A program that implements an abstract base class Publication with the following properties: title and numOfPages. 
Also, contains a Comparable interface. 
	author @ Jennifer J. Cruz Hernandez 
**/
public abstract class Publication implements Comparable<Publication> {

	// data memebers
	protected int numOfPages;
	protected String title;

	// constructor
	public Publication(int numOfPages, String title) {
		this.numOfPages = numOfPages;
		this.title = title;
	}

	// get methods
	public int getNumOfPages() { 
		return this.numOfPages;
	}

	public String getTitle() {
		return this.title;
	}

	// toString method which returns the properties of a Publication 
	public String toString() {
		return "Title: " + this.title + " Number Of Pages: " + this.numOfPages;
	}

	// boolean equals method that checks if Publications have the same number of pages as well as title 
	public boolean equals(Publication other) {
		if(this.numOfPages == other.getNumOfPages() && this.title.equals(other.getTitle())) {
			return true;
		}
		return false;
	}

	// compareTo method which compares Publications based on the number of pages 
	public int compareTo(Publication other) {	
		return Integer.compare(this.numOfPages, other.getNumOfPages());
	}
}
