package CardGameWar;

public class App {
/*
 * 
2.	Create a class called App with a main method.
a)	Instantiate a Deck and two Players, call the shuffle method on the deck.
b)	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
c)	Using a traditional for loop, iterate 26 times and call the flip method for each player.
d)	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
e)	After the loop, compare the final score from each player. 
f)	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

 */
	public static void main(String[] args) {
		// Instantiate a Deck and two Players
		Deck deck = new Deck();
		Player p1 = new Player(null, 0, "Hasan");
		Player p2 = new Player(null, 0, "Jude");
		
		deck.shuffle();// Shuffle the deck
 
		// Draw cards for each player 52 times
        for (int i = 0; i < 52; i++) {
            p1.draw(deck);
            p2.draw(deck);
        }
        
     // Flip cards for each player 26 times
        for (int i = 0; i < 26; i++) {
            Card p1card = p1.flip();
            Card p2card = p2.flip();
	
         // Print the flip cards
            System.out.println("Player 1 flips: ");
            p1card.describe();
            System.out.println("Player 2 flips: ");
            p2card.describe();
        

        // Compare the values of the flipped cards and increment the score of the player with the higher value
        if (p1card != null && p2card != null) {
            int value1 = p1card.getValue();
            int value2 = p2card.getValue();

            if (value1 > value2) {
                p1.incrementScore();
                System.out.println("Player 1 wins this turn!");

            } else if (value1 < value2) {
                p2.incrementScore();
                System.out.println("Player 2 wins this turn!");
            }else {
                    System.out.println("continue");
            }
        }
        
        // Print the updated scores after each turn
        System.out.println("Player 1 score: " + p1.getScore());
        System.out.println("Player 2 score: " + p2.getScore());
    
    }

    // Compare the final scores of each player
    int score1 = p1.getScore();
    int score2 = p2.getScore();
    

    // Determine the winner or if it's a draw
    if (score1 > score2) {
        System.out.println("Player 1 wins!");
    } else if (score1 < score2) {
        System.out.println("Player 2 wins!");
    } else {
        System.out.println("It's a draw!");
    }
	
	}

}
