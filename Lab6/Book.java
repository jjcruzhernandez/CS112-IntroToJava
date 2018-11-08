/**
A program that contain a derived class Book.
	author @ Jennifer J. Cruz Hernandez 
**/
public class Book extends Publication {

	// data memebers
	protected boolean coverType;

	// constructor 
	public Book(int numOfPages, String title, boolean coverType) {
		super(numOfPages, title);
		this.coverType = coverType;
	}	

	// get methods
	public String getCoverType() {
		if (this.coverType == true) {
			return "hard";
		}
		else {
			return "soft";
		}
	}

	// toString method which returns the properties of a Book 
	public String toString() {
		return super.toString() + " Cover Type: " + this.getCoverType();
	}
}
