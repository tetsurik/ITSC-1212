/**
  * @author Tetsu Ri
  * @version 05/29/2019
  * Description: 
  * 		A new restaurant near university is celebrating its 3rd year of opening. For this occasion,
  * 		they are giving away special offers to customers. Flip a coin for 20% or 25% off
  * 

  */

// Import Scanner
import java.util.*;
public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Greet customer and explin promotion
		System.out.println("Thank you for celebrating our third year of operation with us!" + "\n" + 
				"We have are doing a special tonight; flip a coin and get 20% off with heads" + "\n" 
				+ "and 25% off with tails!"
				);
		
		System.out.print("*flip coin*");
	
			int num = (Math.random() <= 0.5) ? 1 : 2; // Generate a random integer between 1 and 2
			
			if (num == 1) { // Display result for num = 1
			System.out.println("You got heads! This means you get 20% off.");
			}
				
			
			else if (num == 2){ // Display result for num = 2
			System.out.println("You got tails! This means you get 25% off.");
			
			
		}
			System.out.println("Thank you and enjoy!");
			}
		
			
	}


	