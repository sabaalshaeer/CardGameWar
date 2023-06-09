package CardGameWar;

import java.util.*;
public class Player {
	/*
	 * i.	Fields
1.	hand (List of Card)
2.	score (set to 0 in the constructor)
3.	name

ii.	Methods
1.	describe (prints out information about the player and calls the describe method for each card in the Hand List)
2.	flip (removes and returns the top card of the Hand)
3.	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
4.	incrementScore (adds 1 to the Player’s score field)

	 */

	private List<Card> hand;
	private int score;
	private String name;
	
	//getter and setter
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//Constructor
	public Player(List<Card> hand, int score, String name) {
		this.hand = new ArrayList<>(); 
		this.score = 0;
		this.name = name;
	}
	
    // Method to describe the player and the cards in their hand
	public void describe() {
		 System.out.println("Player`s name: " + name);
	        System.out.println("Score: " + score);
	        System.out.println("Cards in " + name + "`s hand:");
	        for (Card card : hand) {
	            card.describe();
	        
	        }
	}
	
	// Method to flip and return the top card from the hand
	 public Card flip() {
	        if (!hand.isEmpty()) {
	            return hand.remove(0);
	        } else {
	            System.out.println("No cards in hand.");
	            return null;
	        }
	    }

	// Method to draw a card from the deck and add it to the hand
	    public void draw(Deck deck) {
	        Card drawnCard = deck.draw();
	        if (drawnCard != null) {
	            hand.add(drawnCard);
	        }
	    }

	    // Method to increment the player's score by 1
	    public void incrementScore() {
	        score++;
	    }
	
	
}
