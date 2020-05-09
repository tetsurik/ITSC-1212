/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		 This program will allow the user to enter a main String and two separate words: 
 * 			(1) the word they would like to be replaced
 * 			(2) the word that will replace the first 
 * 		The program will locate all the occurrences of the first word in the main String,
 * 		and replace all of them with the second word.


 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Print Assignment ID
 * 		Prompt user for initial sentence and assign and String
 * 		Prompt user for search String and assign to variable
 * 		Prompt user for replacement and assign to variable
 * 		If-Else statement for if String is found
 * 			Part 2: Using .replace method
 * 				Create new String using .replace method
 * 				Display Result
 * 			Part 2: Using loops		
 * 				Declare String for new sentence
 * 				Declare the int for the index for search string
 * 				Create a loop  until searchIndex is zero
 * 					replacing found string with replacement string every time it appears
 *					reassigning next index of when the search string appears
  				Print result
* 		Else String is not found	
 * 				Display result
 * 		End
 * 
 */

import java.util.Scanner;// Import Scanner

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Print Assignment ID
		System.out.println(" ID003 ");
		
		// Prompt user for input
		System.out.println("Enter a String: ");
				
		// Assign String to variable
		String main = input.nextLine();		
		

		// Prompt user for search String and assign to variable
		System.out.println("Enter Word 1 (to be replaced): ");
		String search = input.nextLine();
		
		// Prompt user for replacement and assign to variable
		System.out.print("Enter Word 2 (that replaces Word 1): \n");
		String replace = input.nextLine();
		
		// If-Else statement for if String is found
		if (main.contains(search)) {
				
			// Part 1
			// Print "Part 1"
			System.out.println("Part 1");
			
				// Use .replace method 
				String replacedMain1 = main.replace(search, replace);
		
				// Print result
				System.out.println("New String: " + replacedMain1 + "\n");
		
		
			// Part 2
			// Print "Part 2"
			System.out.println("Part 2");
				
				// Declare String for new sentence
				String replacedMain = main;
				// Declare the int for the index for search string
				int searchIndex = main.indexOf(search);
				
					// Loop until searchIndex is zero
					while (searchIndex >=0) {	
					
						// replacing found string with replacement string every time it appears
						replacedMain = replacedMain.substring(0, searchIndex) + replace
								+ replacedMain.substring(searchIndex + search.length(), main.length());
					
						// reassigning next index of when the search string appears		
						searchIndex = main.indexOf(search, searchIndex + search.length());
						}
					
					// Print result
					System.out.println("New String: \n" + replacedMain + "\n");
					
			}	// String is not found	
			else {
				// Display result
				System.out.println(search + " is not found!\n");
		
		
	}

}
}