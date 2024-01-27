package HW2;

public class Card {

	// Instance variables
	// Initialize in the constructor, not here
	private char suit;
	private int rank;
	
	// A default constructor doesn't make sense for Card
	//   so do not include one
	
	// Regular constructor
	public Card(int theRank, char theSuit) {
		rank = theRank;
		suit = theSuit;
	}
	
	// Copy constructor
	public Card(Card aCard) {
		this.rank = aCard.rank;
		this.suit = aCard.suit;
	}
	
	// equals
	public boolean equals(Object o) {
		Card c = (Card)o;
		return ((this.rank == c.rank) &&
				(this.suit == c.suit));
	}
	
	// toString - should display like 2s or Qh, etc.
	public String toString() {
		// Display with 11-14 being J,Q,K,A
		String displayRank = "";
		if (this.rank <= 10) {
			displayRank = this.rank + "";
		} else if (this.rank == 11) {
			displayRank = "J";
		} else if (this.rank == 12) {
			displayRank = "Q";
		} else if (this.rank == 13) {
			displayRank = "K";
		} else if (this.rank == 14) {
			displayRank = "A";
		}
		
		return new String("Card: " + displayRank + suit);
	}
}