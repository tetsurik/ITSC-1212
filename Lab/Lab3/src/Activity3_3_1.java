/**
  * @author Tetsu Ri
  * @version 05/29/2019
  * Description: 
  * 		Takes the number of hours the user slept and shows a corresponding message
  *
  * Pseudocode:
  * 1. Prompt user for hours slept
  * 2. Assign input to the int hours
  * 3. Display a specific message according to how much the user slept
  * 4. End
  */

// Import Scanner
import java.util.*;
public class Activity3_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		// Ask user for amount of sleep in hours
		System.out.println("How many hours did you sleep?");
		int hours = input.nextInt();
		
		// Conditions from user input
		if (hours > 8){
			System.out.println("Good! You got enough sleep.");
		}
		else if (hours > 5) {
			System.out.println("That's okay. Should probably still have more though!");
			
		}
		else {
			System.out.print("You definitely need more sleep!!");
		}
		

	}

}
