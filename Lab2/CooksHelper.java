/** A program that allows the user to enter a number of tablespoons they would like to convert to cups and then gives its conversion.
	@author Jennifer J.Cruz Hernandez
**/

import java.util.Scanner; 

public class CooksHelper{
	
	public static void main(String[] args) {

		// Prompt the user for the number of tablespoons.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number of Tablespoons:");
		int tablespoons = in.nextInt();

		// Convert tablespoons entered into cups.
		double cups = ((double)tablespoons)/16;
		System.out.printf( tablespoons + " tablespoons is equal to " + cups + " cups. \n");

	}

}
