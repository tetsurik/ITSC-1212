/*
 * @author Tetsu Ri
 * @version 06/16/2019
 * 
 * Description: 
 * 		This program will pick 4 random cards out of a standard deck of 52 cards
 * 
 * 	
 * Pseudocode:
 * 		Start
 * 		Print Assignment ID
 		Create an array to represent all 52 cards	
 		Create an array for suits
 		Create an array for ranks
 		Initialize the cards
 		Shuffle the cards
 		Generate an index randomly
 		Display the first four cards
 * 		End
 * 
 */
public class DeckOfCards {
	public static void main(String[] args) {
		
		// Print Assignment ID
		System.out.println(" ID002 ");
		
		// Create an array to represent all 52 cards	
		int[] deck = new int[52];
		// Create an array for suits
		String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
		// Create an array for ranks
		String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
				"10", "Jack", "Queen", "King"};

		// Initialize the cards
		for (int i = 0; i < deck.length; i++)
			deck[i] = i;

		// Shuffle the cards
		for (int i = 0; i < deck.length; i++) {
			
			// Generate an index randomly
			int index = (int)(Math.random() * deck.length);
			int temp = deck[i];
			deck[i] = deck[index];
			deck[index] = temp;
		}

		// Display the first four cards
		for (int i = 0; i < 4; i++) {
			String suit = suits[deck[i] / 13];
			String rank = ranks[deck[i] % 13];
			System.out.println("Card number " + deck[i] + ": "
					+ rank + " of " + suit);
		}
	}
 }