/**
 * @author Josiah Laivins (You can remove the name)
 * @version
 *
 * Description:
 *
 *
 * Pseudocode for:
 *
 * shuffleDeck Method
 * declareWinner Method
 * makeDeck method
 *
 */
// Import Java tools
import java.util.*;
public class CardGame {
	
    public static void main(String[] args) {
    	
    	// Create new Scanner
    	Scanner input = new Scanner(System.in);
    	
    	// Print Assignment ID
        System.out.println("ID001");
        
       // String[] deck=makeDeck();
        
      //  String [] sDeck=shuffleDeck(deck);

        int choice = 0;
        
        while (choice != -1) {
        	
        	System.out.println("1. Player v. Computer\n 2. Computer vs. Computer \nWhat part do you want to do?(Enter -1 to exit)");
        	
        	choice = input.nextInt();
            
        	if (choice == 1) {
            	int humanCardValue = -1;
            		while (humanCardValue == -1) {
            			System.out.println("Enter a card location from 0 to 51: ");
            			humanCardValue = input.nextInt();
            			
            			if (humanCardValue <= 51 && humanCardValue >= 0) {
            				break;
            			} else {
            				System.out.println("Please enter a valid card location: ");
            			}
            			
            		}
            	String[] deck = new String[52];
            	
            	makeDeck(deck);
            	
            	shuffleDeck(deck);
            	
            	System.out.println(deck[humanCardValue]);
            	
                // get the user choice and the computer's choice
                // Make sure the choices are valid. The user should not
                // be able to enter card 150000.

                // Get the value of the card from each choice. Note
                // that the deck should be SHUFFLED. So if the human chooses card
                // card 34, and the computer chooses card 2, the computer
                // still might have a higher value card

                // Your goal is to have the value of the card the human chose
                // and have a value of the card the computer chose.
                // You should be able to pass in the deck array display
                // the card suits and ranks
                //declareWinner(humanCardValue, computerCardValue, deck);
            } else if (choice == 2){
                // since the user chose part 2
                // loop a hundred times {
                    // get the winner for both computers for each round
                    // NOTE: HOW DOES THE PROGRAM KNOW WHO WON?
                    // do you need to change the declareWinner method?
                    // Will it need to return anything? And how?

                    // Collect the number of wins for each

                // }
                // Display the number of wins for each and who won.


             } else {
            	 System.out.println("Please enter a valid input. \n");
             }
            
         }
    }

    public static String[] makeDeck(String[] deck){
    	
    	String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7",
			"8", "9", "10", "Jack", "Queen", "King" };

		String[] suits = { "Diamonds", "Clubs", "Hearts",
		"Spades" };
		
		deck = new String[52];{

			for (int i = 0; i < 13; i++) {

				for (int j = 0; j < 4; j++) {
				deck[j * 13 + i] = ranks[i] + " of " + suits[j];
				}

			}

		}
		return deck;
    }
    
    public static void shuffleDeck(String [] deck){
      
			for (int i = 0; i < 100; i++) {
				
				int index1 = (int) (Math.random() * 52);
				int index2 = (int) (Math.random() * 52);		
				String temp = deck[index1];
				deck[index1] = deck[index2];
				deck[index2] = temp;

				}
       
    }
    
    public static String declareWinner(int n1, int n2) {
    // Some kind of declareWinner method {
        // Question you should ask:
    	String result = "result";
        if (n1 > n2) {
        	
        }
    
    	return result;
    }
}
