/**
  * @author Tetsu Ri
  * @version 05/29/2019
  * Description: 
  * 		Program "flips a coin" and outputs heads or tails		
  * 
  * Pseudocode:
  * 1. Prompt user to flip or not
  * 2. If no, display goodbye
  * 3. If yes, generate a random integer between 1 and 2
  * 4. If int = 1, display "You got head!"
  * 5. If int = 2, display "You got tails!"
  */

// Import Scanner
import java.util.*;
public class Activity3_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user to flip a coin
		System.out.println("Would you like to flip a coin? "
				+ "Enter 0 for no.");
		int choice = input.nextInt();
		
		
		if (choice == 0) {
			System.out.println("Goodbye!");
		}
		else {
			int num = (Math.random() <= 0.5) ? 1 : 2; // Generate a random integer between 1 and 2
			
			if (num == 1) { // Display result for num = 1
			System.out.println("You got heads!");
			}
				
			
			else if (num == 2){ // Display result for num = 2
			System.out.println("You got tails!");
			
			
		}
			System.out.println("Goodbye!");
			}
		
			
	}
}

	