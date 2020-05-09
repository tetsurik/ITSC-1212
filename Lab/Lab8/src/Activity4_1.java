
public class Activity4_1 {
	public final static String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King" };
	
			public final static String[] suits = { "Diamonds", "Clubs", "Hearts",
			"Spades" };
			
		public static void main(String[] args) {

			String deck[] = new String[52];

			for (int i = 0; i < 13; i++) {

				for (int j = 0; j < 4; j++) {
					deck[j * 13 + i] = ranks[i] + " of " + suits[j];
				}

			}
			displayDeck(deck);
			shuffleDeck(deck);
			System.out.println("\nAfter shuffle:\n");
			displayDeck(deck);

			}

		private static void shuffleDeck(String[] deck) {

			for (int i = 0; i < 100; i++) {
				
				int index1 = (int) (Math.random() * 52);
				int index2 = (int) (Math.random() * 52);		
				String temp = deck[index1];
				deck[index1] = deck[index2];
				deck[index2] = temp;

				}

			}

		private static void displayDeck(String[] deck) {

			for (int i = 0; i < deck.length; i++) {
			System.out.printf(deck[i]+"\n");

				if ((i + 1) == 0) {
					System.out.println();

			}

		}

	}

}


