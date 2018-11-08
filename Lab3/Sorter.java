/** 
A program that reads the contents of a text file, stores each word in an ArrayList, sorts the list, 
then prints the contents in order smallest to largest and largest to smallest. 
	@author Jennifer J.Cruz Hernandez
**/ 

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sorter {

	public static void main(String[] args) {

		// Opens the file words.txt.
		File inputFile = new File("words.txt");

		// Creates ArrayList of String to store the words in the file.
		ArrayList<String> words = new ArrayList<String>();

		// Adds words from words.text into ArrayList a line at a time.
		try (Scanner input = new Scanner(inputFile)) {

			while(input.hasNext()) {

				String word = input.nextLine();
				words.add(word);
			}
		} catch(FileNotFoundException fnf) {
			System.out.println("File not found.");
			System.out.println(fnf.getMessage());
			System.exit(1);
		}

		// Prints the contentents of the list, one word on each line, in order from smallest to largest.
		Collections.sort(words);
		System.out.println("Alphabetical A-Z:");
		for (String word:words) {
			System.out.println(word);
		}

		// Prints an empty line.
		System.out.print("\n");

		// Prints the contents of the list, one word on each line, in order from largest to smallest.
		Collections.sort(words, Collections.reverseOrder());
		System.out.println("Alphabetical Z-A:");
		for (String word:words) {
			System.out.println(word);

		}
	}

}
