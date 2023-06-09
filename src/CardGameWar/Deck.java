package CardGameWar;

import java.util.*;

public class Deck {
	/*
	 * b.	Deck
i.	Fields
1.	cards (List of Card)
ii.	Methods
1.	shuffle (randomizes the order of the cards)
2.	draw (removes and returns the top card of the Cards field)
3.	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.

	 */

	private List<Card> cardList;

	//  // Constructor to populate the deck with cards
	public Deck() {
		cardList = new ArrayList<>();

		String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades" };// Array of suit names
		String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };// Array of card names
		
        // Populate the deck with 52 cards, one for each combination of suit and name
        for (int value = 2; value <= 14; value++) {
            for (String suit : suits) {
                String cardName = names[value - 2] + " of " + suit;
                Card card = new Card(value, cardName);
                cardList.add(card);
            }
        }
		
        
	}

	public void shuffle() {
		Collections.shuffle(cardList);
		
	}

	public Card draw() {
		if (cardList.isEmpty()) {
			return null;
		}
		return cardList.remove(0);
	}
	
	

}
