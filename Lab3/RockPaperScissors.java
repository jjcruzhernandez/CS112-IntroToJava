/**  
A program that allows users to play the game rock-paper-scissors againt the computer.
	@author Jennifer J.Cruz Hernandez
**/ 

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		// Prompt the user for a number between 0-3.
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:");
		int n1 = in.nextInt();

		// If number entered is 0 then print "Game Over" and end the game.
		if (n1 == 0) {
			System.out.println("Game Over.");

		// If number entered is NOT 0 then continue game.
		}else {
			// While number is NOT 0 then continue game.
			while (n1 != 0) {

				// If number is not between 0-3 then print "Invalid input".
				if (n1 > 3 || n1 < 0) {
					System.out.println("Invalid input.");

				// If number is between 1-3 then continue game.
				}else {
					
					String playerReturnValue = " Player chooses ";

					// If number entered entered is 1, then "Player chooses Rock".
					if (n1 == 1) {
						playerReturnValue += "Rock.";
					// If number entered entered is 2, then "Player chooses Paper".
					}else if (n1 == 2) {
						playerReturnValue += "Paper.";
					// If number entered entered is 3, then "Player chooses Scissors".
					}else if (n1 == 3) {
						playerReturnValue += "Scissors.";
					}
			
					// Generates a random number between 1-3 for the computer.
					Random r = new Random();
					int n2 = r.nextInt(3) + 1;
					
					String computerReturnValue = "Computer chooses ";

					// If number entered entered is 1, then "Computer chooses Rock".
					if (n2 == 1) {
						computerReturnValue += "Rock.";
					// If number entered entered is 2, then "Computer chooses Paper".
					}else if (n2 == 2) {
						computerReturnValue += "Paper.";
					// If number entered entered is 3, then "Computer chooses Scissors".
					}else if (n2 == 3) {
						computerReturnValue += "Scissors.";
					}

					// Print what the computer and player chose.
					System.out.println(computerReturnValue + playerReturnValue);

					// Print it's a tie if computer and player chose the same number.
					if ((n1 == 1 && n2 == 1) || (n1 == 2 && n2 == 2) || (n1 == 3 && n2 == 3)) {
						System.out.println("It's a tie!");
					// Print "Player wins!" if player chose Rock and computer chose Scissor, if player chose Paper and computer chose Rock, if player chose Scissors and computer chose Paper.
					} else if ((n1 == 1 && n2 == 3 ) || (n1 == 2 && n2 == 1) || (n1 == 3 && n2 == 2)) {
						System.out.println("Player wins!");
					// Print "Computer wins!" if computer chose Rock and player chose Scissor, if computer chose Paper and player chose Rock, if computer chose Scissors and player chose Paper.
					} else if ((n2 == 1 && n2 == 3 ) || (n2 == 2 && n1 == 1) || (n2 == 3 && n1 == 2)) {
						System.out.println("Computer wins!");
					}
				}
			// Re-prompt the user for a number between 0-3.
			System.out.println("Enter 1 (Rock), 2 (Paper), or 3 (Scissors) - Enter 0 to exit:");
			n1 = in.nextInt();
			}
			// If player chose 0 then print "Game Over" and end the game.
			if (n1 == 0) {
				System.out.println("Game Over.");
			}
		}
	}
}
