
public class Activity4 {
	public static void main(String[] args) {

	// Create an array to represent all 52 cards	
	int[] deck = new int[52];
	
	// Create an array for suits
	String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
	
	// Create an array for ranks
	String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
			"10", "Jack", "Queen", "King"};

	// Initialize the cards
	for (int i = 0; i < deck.length; i++) {
		deck[i] = i;
	}
	System.out.println("The cards before being shuffled are: \n");
	
	for (int i = 0; i < deck.length; i++) {
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		System.out.println("Card number " + deck[i] + ": "
				+ rank + " of " + suit);
	}
	// Shuffle the cards
	
	for (int i = 0; i < deck.length; i++) {
		
		// Generate an index randomly
		int index = (int)(Math.random() * deck.length);
		int temp = deck[i];
		deck[i] = deck[index];
		deck[index] = temp;
	}

	System.out.println("\n\nThe cards after being shuffled are: ");
	
	for (int i = 0; i < deck.length; i++) {
		String suit = suits[deck[i] / 13];
		String rank = ranks[deck[i] % 13];
		int shuNum = deck[i];
		System.out.println("Card number " + shuNum + ": "
				+ rank + " of " + suit);
	}

	}

		
}