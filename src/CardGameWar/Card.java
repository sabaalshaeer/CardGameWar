package CardGameWar;

public class Card {
/*
 * a.	Card
i.	Fields
1.	value (contains a value from 2-14 representing cards 2-Ace)
2.	name (e.g. Ace of Diamonds, or Two of Hearts)
ii.	Methods
1.	Getters and Setters
2.	describe (prints out information about a card)

 */
	private int value;
	private String name;
	
	//constructor
	public Card(int value, String name) {
		this.value = value;
		this.name = name;
	}
	
	//getter and setter
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//describe method
	 public void describe() {
	        System.out.println("Card: " + name + ", Value: " + value);
	    }
}
