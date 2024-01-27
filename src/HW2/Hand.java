package HW2;

import java.util.ArrayList;

public class Hand {
	
	// Instance variables
	// Initialize in the constructor, not here
	private ArrayList<Card> theCards;
	
	public Hand() {
		// Make an empty black jack hand
		this.theCards = new ArrayList<Card>();
	}
	
	// toString
	// Should display the cards along with the score
	//   and if it is currently soft/hard
	public String toString() {
		
		return "Hand: " + theCards;
	}
	
	// Adds the given card to the hand
	public void addCard(Card c) {
		theCards.add(c);
	}
	
	// Removes the given card to the hand
	// Note this needs equals to be working properly in Card
	public void removeCard(Card c) {
		theCards.remove(c);
	}
	
}