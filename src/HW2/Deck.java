package HW2;

import java.util.ArrayList;

public class Deck {
	
	// Instance variables
	// Initialize in the constructor, not here
	private ArrayList<Card> theCards;

	// Default constructor - make a deck of 52 cards
	// This will be in order like you get with a brand new deck
	public Deck() {
		
		// Start with an empty deck of cards
		theCards = new ArrayList<Card>();
	
		// Fill it with 52 cards
		// Note these are in order like you would buy a deck from the store
		for (int currentRank=2; currentRank<=14; currentRank++) {
			theCards.add(new Card(currentRank, 's'));
			theCards.add(new Card(currentRank, 'c'));
			theCards.add(new Card(currentRank, 'd'));
			theCards.add(new Card(currentRank, 'h'));
		}
	}
	
	// toString - should display all the cards
	public String toString() {
		// Note we use ArrayList's toString to do most of the work
		return "Deck: " + theCards;
	}
	
	// This randomly shuffles the cards
	// Basically it picks two random indices and flips those cards
	//   over and over
	public void shuffle() {
		for (int i=0; i<100; i++) {
			int index1 = (int)(Math.random() * theCards.size());
			int index2 = (int)(Math.random() * theCards.size());
	
			// Switch the cards at index1 and index2
			Card temp = theCards.get(index1);
			theCards.set(index1, theCards.get(index2));
			theCards.set(index2, temp);
		}
	}

	// Removes the top card from the Deck and returns it
	public Card deal() {
		Card topCard = theCards.remove(0);
		return topCard;
	}
	
	// Put As at the top of the deck
	// This is great for a test of how the 1/11 soft/hard works
	// We don't know where the As are in the deck so remove them
	//   with the remove function and then add them to the front
	//   Note that this requires indexOf which requires Card to have
	//   a correct equals method using Object as the parameter
	public void stack() {
		
		// Note the use of a temp new Card to find the actual
		//   one in the Deck
		for(char suit : new char[] { 's', 'd', 'c', 'h'}) {
			// Find the index, remove it and add it to the front
			Card ace = new Card(14, suit);
			
			int index = theCards.indexOf(ace);
			Card c = theCards.remove(index);
			theCards.add(0, c);
		}
	}
}