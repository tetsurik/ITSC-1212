/*
 * @author Tetsu Ri
 * @version 05/30/2019
 * 
 * Description:
 * 			This program will simulate picking a card from a deck of 52 cards.
 * Pseudocode:
 * 			Initialize variables for program
 * 			Prompt user to pick a card
 * 			Assign input to choice
 * 			If "Y" continue. If not, end
 * 			Generate random int for faceValue
 * 			Use faceValue int to assign face of card
 * 			Generate random int for suitNum
 * 			Use suitNum int to assign suit of card
 * 			Display results
 * 
 */
import java.util.Scanner; // Import Scanner


public class Program1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new Scanner
		Scanner input = new Scanner(System.in);
		
		//Assignment ID
		System.out.println("ID001");
		
		// Initialize variables
		int faceValue;
		int suitNum;
		String suit = "cards.";
		String card = "no ";
		String Yes = "Y";
		String yes = "y";
	    String no = "N";
		
		//Prompt user to pick a card
		System.out.println("Would you like to pick a card? Y/N");
		
		// Assign user input to choice
		String choice = input.nextLine();
		
		// Generate a random card
		if (choice.equals(yes)||choice.equals(Yes)) {
			
			//Generate int for card value
			faceValue = (int)(Math.random() * (13 - 1 + 1)) +1; 
			if (faceValue == 1) {
				card = "the Ace";
			}
			else if (faceValue > 1 || faceValue < 11) {
				card = Integer.toString(faceValue);
			}
			else if (faceValue == 11) {
				card = "the Jack";
			}
			else if (faceValue == 12) {
				card = "the Queen";
			}
			else if (faceValue == 13) {
				card = "the King";
			}
			
			//Generate int for card suit
			suitNum = (int)(Math.random() * (3-0 +1)) +0; 
			if (suitNum == 0) {
				suit = " of Hearts";
				
			}
			else if (suitNum == 1) {
					suit = " of Diamonds";
					
				}
			else if (suitNum == 2) {
					suit = " of Clubs";
					
				}
			else if (suitNum == 3) {
					suit = " of Spades";
					
				}
		}

		else { 
			System.out.print("Goodbye! "); // Goodbye message
		}
		
		// Display results
		System.out.println("You got " + card + suit);
		
				
	}
	}