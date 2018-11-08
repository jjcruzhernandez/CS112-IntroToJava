/**
A program that contains the main method for PlayingCard which will sort 5 PlayingCards. 
	author @ Jennifer J.Cruz Hernandez 
**/
import java.util.ArrayList;
import java.util.Collections;

public class PlayingCardDriver {

	public static void main(String[] args) {

		// creating an ArrayList of PlayingCards
		ArrayList<PlayingCard> cards = new ArrayList<PlayingCard>();

		// adding PlayingCards to ArrayList
		cards.add(new PlayingCard(3, "clubs", "red"));
		cards.add(new PlayingCard(3, "diamonds", "black"));
		cards.add(new PlayingCard(3, "hearts", "red"));
		cards.add(new PlayingCard(3, "spades", "red"));
		cards.add(new PlayingCard(7, "clubs", "black"));

		// sorting ArrayList of PlayingCards
		Collections.sort(cards);

		// printing out ArralyList of PlayingCards in order it was sorted. Least to Greatest. 
		for (PlayingCard card : cards) {
			System.out.println(card);
		}
	}
}
