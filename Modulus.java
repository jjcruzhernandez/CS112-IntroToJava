/** A program that allows users to enter a number and returns a phrase depending wether or not the number 
	is divisible by 3,7, both or is out of range.
	@author Jennifer J.Cruz Hernandez
**/

import java.util.Scanner; 

public class AppleOrange {
	
	public static void main(String[] args) {

		// Prompt the user for a number between 1 and 100.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number 1-100:");
		int number = in.nextInt();

		// If number is divisible by 3 and 7 print appleorange.
		if (number%3 == 0 && number%7 == 0){
			System.out.println("appleorange");
		// If number is divisible by 3 print apple.
		} else if (number%3 == 0){
			System.out.println("apple");
		// If number is divisible by 7 print orange.
		} else if (number%7 == 0){
			System.out.println("orange");
		// If number is out or range print banana.
		} else if ( 1 > number || number > 100){
			System.out.println("banana");
		// In all other cases print the number.
		} else {
			System.out.println(number);
		}

	}

}
