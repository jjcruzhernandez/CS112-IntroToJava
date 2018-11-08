/**
A program that contains the main method for Publicaton. And sorts 5 Publication objects.
	author @ Jennifer J. Cruz Hernandez 
**/
import java.util.ArrayList;
import java.util.Collections;

public class LibraryDriver {

	public static void main(String[] args) {

		//creating ArrayList of Publications
		ArrayList<Publication> library = new ArrayList<Publication>();

		// adding 5 publications to the ArrayList
		library.add(new Book(100, "Book1", true));
		library.add(new Book(200, "Book2", false));
		library.add(new Book(100, "Book3", true));
		library.add(new Magazine(15, "Mag1", 1000));
		library.add(new Magazine(10, "Mag2", 2500));

		// sorting the ArrayList of Publications
		Collections.sort(library); 

		// printing out each publication in the order it was sorted. Least to Greatest. 
		for (Publication publication : library) {
			System.out.println(publication);
		}
	}
}
