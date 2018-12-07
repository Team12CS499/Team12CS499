//KYLE R NELSON
//UNIVERSITY OF KENTUCKY
//CS 499 Fall 2018

package hand_determination;

//This class will contain card data
//This will include the suit and value of the given card
//Each field is stored as a byte, with corresponding constants
public class Card 
{
	//Note: the constants are members of the Card class, and must be called as such
	
	//here we will declare the constants which correspond to the suits
	//note that each name is in the plural: think X of Hearts for example
	public static final byte HEARTS = 0;
	public static final byte DIAMONDS = 1;
	public static final byte CLUBS = 2;
	public static final byte SPADES = 3;

	//here we declare the constants for the special card values (Ace, Jack, King, Queen)
	//note that the numbered cards will simply go by their number
	//also note that aces are low by default. 
	//If you wish for aces to be flexibly high or low,
	//I would suggest adding 13 * ACE_HIGH whenever using ACE,
	//where ACE_HIGH is either 1 if it is high, or 0 if not
	//e.g. value = Card.ACE + (13 * ACE_HIGH)
	public static final byte ACE = 1;
	public static final byte JACK = 11;
	public static final byte QUEEN = 12;
	public static final byte KING = 13;
	public static final byte ACE_HIGH = 14;

	
	//now for the private members that identify a card
	public byte value;
	public byte suit;
	
	//This is the constructor, taking the value and suit of the card in order
	//No default constructor is provided because it be essentially useless:
	//we should never be constructing a card whose values are not known at the time 
	public Card(byte Value, byte Suit)
	{
		this.value = Value;
		this.suit = Suit;
	}
	
	//print a bare bones line describing the value and suit as raw numbers
	public void print()
	{
		System.out.println( "( " + this.value + " of " + this.suit + " )" );
	}
	
	//the getters and setters have been automatically generated
	//These may go unused depending on how we decide to handle changing card inputs
	public byte getValue() {
		return value;
	}

	public void setValue(byte value) {
		this.value = value;
	}

	public byte getSuit() {
		return suit;
	}

	public void setSuit(byte suit) {
		this.suit = suit;
	}

	//Added by Austin Williams for ease of displaying messages in the app. ***
	public String toString() {
		String result = "";
		if (value == ACE_HIGH || value == ACE) {
			result += "ACE";
		}
		else if (value == KING) {
			result += "KING";
		}
		else if (value == QUEEN) {
			result += "QUEEN";
		}
		else if (value == JACK) {
			result += "JACK";
		}
		else {
			result += value;
		}

		result += " OF ";

		if (suit == HEARTS) {
			result += "HEARTS";
		}
		else if (suit == DIAMONDS) {
			result += "DIAMONDS";
		}
		else if (suit == CLUBS) {
			result += "CLUBS";
		}
		else if (suit == SPADES){
			result += "SPADES";
		}
		return result;
	}
	
}
