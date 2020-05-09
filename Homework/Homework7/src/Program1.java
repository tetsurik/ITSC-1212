/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		This program will allow the user to enter a String of text. Then loops through and keep a counter of 
 * 		how many separate words are in that String. Once counting is complete, the total number of words will 
 * 		be displayed back to the user.

 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Print Assignment ID
 * 		Prompt user for initial sentence and assign and String
 * 		Use .trim method to create a new trimmed String
 * 		If-Else statement for if there are no gaps between char's
 * 		Display result
 * 		Else there are gaps between chars. Display result
 * 		End
 * 
 */

import java.util.Scanner;// Import Scanner

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Print Assignment ID
		System.out.println(" ID001 ");
		
		// Prompt user for input
		System.out.println("Please input a String: ");
				
			// Assign String to variable
			String main = input.nextLine();		

			// Use .trim method to create a new trimmed String
			String trim = main.trim();
			// If there are no gaps between char's
				if (trim.isEmpty())
					// Display result
				    System.out.println(0);
				
			// Else there are gaps between chars. Display result
			System.out.println("Total Words:  " + trim.split("\\s+").length + "\n"); 
		

	}

}
