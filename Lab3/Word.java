/** 
A program that returns the number of times a certain character appears in the data memeber theWord. 
As well as, takes input String and returns the number of charcaters that appear in the same location in the input String and theWord.
	@author Jennifer J.Cruz Hernandez
**/

public class Word {
	// Data members
	private String theWord;

	// Constructor
	public Word(String theWord) {
		this.theWord = theWord;
		// Convert theWord into all lowercase.
		this.theWord = this.theWord.toLowerCase();
	}

	// Methods

	//A method that returns the number of times a certain character appears in the data memeber theWord.
	public int countChars(char character) {
		int a = 0; 	
		for(int i = 0; i < theWord.length(); i++) {
			if (theWord.charAt(i) == character) {
				a++; 
			}
		}
		return a;
	}

	// A method that takes input String and returns the number of charcaters that appear in the same location in the input String and theWord.
	public int matchingChars(String toMatch) {
		int b = 0;
		int i = 0;

		// Compare the strings theWord to toMatch to each other using the length of the longest string.
		while (i < Math.min(theWord.length(), toMatch.length())) {
			if (theWord.charAt(i) == toMatch.charAt(i)) {
				b++;
			}
			i++;
		}
		return b;
	 }
}
