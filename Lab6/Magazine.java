/**
A program that implement a derived class Magazine.
	author @ Jennifer J. Cruz Hernandez 
**/
public class Magazine extends Publication {

	// data memebers
	protected int numSubscribers;

	// constructor 
	public Magazine(int numOfPages, String title, int numSubscribers) {
		super(numOfPages, title);
		this.numSubscribers = numSubscribers;
	}	

	// get method 
	public int getNumSubscribers() {
		return this.numSubscribers;
	}

	// toString method which returns the properties of a Magazine 
	public String toString() {
		return super.toString() + " Number of Subscribers: " + this.numSubscribers;
	}
}
