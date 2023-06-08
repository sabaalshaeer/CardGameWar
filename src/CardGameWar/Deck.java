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

	private List<Card> cardList;// List of Card objects representing the deck

	//  // Constructor to populate the deck with cards
	public Deck() {
		cardList = new ArrayList<>();// Initialize the list of cards

		String[] suits = { "Diamonds", "Hearts", "Clubs", "Spades" };// Array of suit names
		String[] names = { "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen",
				"King", "Ace" };// Array of suit names

		
        // Populate the deck with 52 cards, one for each combination of suit and name
		//1st: iterates over the values from 2 to 14. These values represent the card values from 2 to Ace (Ace is assigned the value 14).
        for (int value = 2; value <= 14; value++) {
        	//2nd : iterates over each suit in the suits array (which contains the strings "Diamonds", "Hearts", "Clubs", "Spades").
            for (String suit : suits) {
            	//System.out.println("suit: " +suit);
            	//3rd: concatenating the card value from the names array (names[value - 2] while array starts at index 0 , and card values start from 2) 
            	//with the current suit 
                String cardName = names[value - 2] + " of " + suit;// Create the card name
                //System.out.println("cardname: " +cardName);
                //4th: create a new Card object using the current value and card name, and add it to the cards list.
                Card card = new Card(value, cardName);// Create a new Card object
                cardList.add(card);// Add the card to the deck
            }
        }
		
        
	}

	public void shuffle() {
		Collections.shuffle(cardList);// Randomize the order of the cards in the deck
		
//		 Random random = new Random();
//		    for (int i = cards.size() - 1; i > 0; i--) {
//		        int j = random.nextInt(i + 1);
//		        Card temp = cards.get(i);
//		        cards.set(i, cards.get(j));
//		        cards.set(j, temp);
//		    }
	}

	public Card draw() {
		if (cardList.isEmpty()) {
			return null;// Return null if the deck is empty
		}
		return cardList.remove(0);// Remove and return the top card from the deck
	}
	
	

}
