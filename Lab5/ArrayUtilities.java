/**
	A class with utility methods for manipulating one and two dimensional
	arrays of characters.
	author @ Jennifer J. Cruz Hernandez
**/
import java.util.ArrayList;
public class ArrayUtilities {

	/**
		Reverses the characters in the array original in place.
		No new arrays may be created.
		Returns the reference to the array original with
		characters reversed.
		Example input: ['a', 'b', 'c', 'd']
		Example output: ['d', 'c', 'b', 'a']
	**/
	public static char[] reverse(char[] original) {
		char character = 'a';
		int index = original.length-1;
		for(int i = 0; i < (original.length)/2; i++) {
			character = original[i];
			original[i] = original[index];
			original[index] = character;
			index --;
		}
		return original;
	}

	/**
		Converts a two dimensional array of char to a one 
		dimensional array of char. This method may assume
		that all subarrays of the original are of the same
		length.
		Returns the one dimensional array.
		Example input: 
		[['a', 'b', 'c']
		 ['e', 'd', 'f']
		 ['i', 'h', 'g']]
		 Example output:
		 ['a', 'b', 'c', 'e', 'd', 'f', 'i', 'h', 'g']
	 **/
	public static char[] to1D(char[][] original) {
		char[] list = new char[original.length * original.length];
		int i = 0;
		for (int row = 0; row < original.length; row++) {
			for(int col = 0; col < original[row].length; col++) {
				list[i] = original[row][col];
				i++;
			}
		}
		return list;
	}

	/**
		Finds the char with the smallest value in each row
		of the original and returns an array containing the 
		values found. The result at position [0] will be the
		smallest valued char in row 0 of original.
		This method does NOT assume that all subarrays of the
		original are of the same length.
		Example input:
		[['e', 'c', 'f', 'g', 'c', 'e']
		 ['b', 'b', 'b', 'b']
		 ['a', 'd']
		 ['d', 'c', 'b']]
		Example output:
		['c', 'b', 'a', 'b']
	**/
	public static char[] smallestPerRow(char[][] original) {
		char[] list = new char[original.length];
		int numChar2 = 0;
		int numCharRow = 0;
		list[0] = original[0][0];
		for (int row = 0; row < original.length; row++) {
			for(int col = 0; col < original[row].length; col++) {
				numChar2 = Character.getNumericValue(original[row][col]);
				numCharRow = Character.getNumericValue(list[0]);
				if ( numCharRow > numChar2) {
					list[row] = original[row][col];
				}
			}
		}
		return list;

 	}

 }
