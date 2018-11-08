/**
A program that will create a PlayingCard with the following properties: value, suit, and color. Also,implement the Comparable interface.
	author @ Jennifer J. Cruz Hernandez 
**/
import java.util.ArrayList;
import java.util.Collections;
public class PlayingCard implements Comparable<PlayingCard> {

	//data members 
	private int value;
	private String suit;		
	private String color;

	//constructor 
	public PlayingCard(int value, String suit, String color) {
		this.value = value;
		this.suit = suit;
		this.color = color;
	}

	// get methods
	public int getValue() { 
		return this.value;
	}

	public String getSuit() {
		return this.suit;
	}

	public String getColor() {
		return this.color;
	}

	// toString method which returns the properties of a PlayingCard
	public String toString() {
		return "Value: " + this.value + " Suit: " + this.suit + " Color:" + this.color;
	}

	// boolean equals method that checks if PlayingCards have the same value, suit and color 
	public boolean equals(PlayingCard other) {
		if(this.value == other.getValue() && this.suit.equals(other.getSuit()) && this.color.equals(other.getColor())) {
			return true;
		}
		return false;
	}

	// compareTo method which compares PlayingCards first based on there value and if value is the same then by suit. 
	// Where the order for suits is spades, heards, diamonds, clubs.
	public int compareTo(PlayingCard other) {
		if(this.value == other.getValue()) { 
			return other.getSuit().compareTo(this.suit);
		}	
		return Integer.compare(this.value, other.getValue());
	}
}
