/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		This program will allow the user to enter a String of text and a specific character they would like to count. 
 * 		The program will then Loop through and count how many times this letter occurs in the main String they first entered.


 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Print Assignment ID
 * 		Prompt user for initial sentence and assign and String
 * 		Declare and assign counter
 * 		Declare char
 * 		Prompt user for input and assign to variable
 * 		Create a loop to increase counter for every occurrence of char
 * 		Display result
 * 		End
 * 
 */

import java.util.Scanner;// Import Scanner

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Print Assignment ID
		System.out.println(" ID002 ");
		
		// Prompt user for input
		System.out.println("Enter a String: ");
				
		// Assign String to variable
		String main = input.nextLine();		
		
		// Declare and assign counter
		int count = 0;
		int i;
		// Declare char
		String letter;
		// Prompt user for input and assign to variable
		System.out.println("Enter a Letter:  \r\n");	
        letter = input.next();
        		
        char ch = letter.charAt(0);

        // Loop to increase counter for every occurrence of char
        for (i=0; i < main.length(); i++) {	
            if (ch == main.charAt(i)) {
                 count++;
             }
         }
        // Display result
       System.out.println("Total Occurrences:  " + count + "\n");
			

			
	}

}
