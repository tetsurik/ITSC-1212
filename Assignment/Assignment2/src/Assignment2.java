/*
 * @author Tetsu Ri
 * @version 06/11/2019
 * 
 * Description: 
 * 		This program will prompt the user for a sentence and have a menu in order to execute the following:
 * 
 * 				1   Enter a new main sentence
				2   Find a String 
				3   Find all incidents of a String
				4   Find and Replace a String 
				5   Replace all the incidents of a String
				6   Count the number of words 
				7   Count a letter’s occurrences
				8   Count the total number of letters
				9   Delete all the occurrences of a word
				10  Exit
				
		Based on the user’s choice, the program will perform the chosen functionality.
 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Prompt user for initial sentence and assign and String
 * 		Create variable for menu selection
 * 		Create a while loop to restart the menu selection until they choose to exit
 * 		Display options and assign choice to variable
 * 		Create an If-Else statement to operate selected option
 * 			Option A: Enter a new Main Sentence
 * 				Prompt user for new sentence and assign to variable
 * 				Display new sentence
 * 			Option B: Find a String
 * 				Prompt user for search String and assign to variable
 * 				If-else logic for search string; if the string is found
 * 					Display Result
 * 				Else the string is not found
 * 					Display Result
 * 			Option C: Find all incidents of a string
 * 				Prompt user for String and assign to variable
 * 				Create int variable for the index of input
 * 	 			If-else logic for search string; if the string is found
 * 					Create a while loop which searches every occurrence of String
 * 						Display result including the input and the index
 * 				Else String is not found	
 * 					Display result
 * 			Option D: Find and Replace the String
 * 				Prompt user for search String and assign to variable
 * 				If-Else statement for if String is found
 * 					Prompt user for replacement String and assign it to variable
 * 					Create index of when the search string appears
 * 					replacing found string with replacement string
 * 					Print result
 * 				Else String is not found	
 * 					Print results
 * 			Option E: Replace all incidents of a string to another one
 * 				Prompt user for search String and assign to variable
 * 				If-Else statement for if String is found
 * 					Prompt user for replacement and assign to variable
 * 					Declare String for new sentence
 * 					Declare the int for the index for search string
 * 					Create a loop  until searchIndex is zero
 * 						replacing found string with replacement string every time it appears
 * 						reassigning next index of when the search string appears
 * 					Print result
 * 				Else String is not found	
 * 					Display result
 * 			Option F: Count the number of words:
 * 				Use .trim method to create a new trimmed String
 * 				If-Else statement for if there are no gaps between char's
 * 					Display result
 * 				Else there are gaps between chars. Display result
 * 			Option G: Count the number of occurrences of a letter
 * 				Declare and assign counter
 * 				Declare char
 * 				Prompt user for input and assign to variable
 * 				Create a loop to increase counter for every occurrence of char
 * 				Display result
 * 			Option H: Count the total number of letters
 * 				Initialize variables for number of spaces and the string trimmed
 * 				First identity the number of spaces: If there are no gaps between char's
 * 					Assign value 0 to variable
 * 				Else there are gaps between chars. Assign result
 * 				Int variable for storing total number of character is equal to the length of string - number of spaces
 * 				Display result 
 * 			Option I: Delete all the occurrences of a word
 * 				Prompt user to enter a word to delete; assign word to variable
 * 				Declare variable for new 
 * 				Find the index of occurrence by using sentence.indexOf method
 * 				If the word does not exist in the sentence
 * 					Display Result
 * 				Else the word is present in the sentence
 * 					Use .replaceAll method to delete word
 * 					Display Result
 * 			 Option J: Exit
 * 				Display end prompt
 * 			Else invalid input
 * 				Display result
 * 		Close Statement
 * 		End
 * 
  */


import java.util.*;// Import Scanner
public class Assignment2  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Prompt user for input
		System.out.println("Please input a main sentence: ");
		
		// Assign String to variable
		String main = input.nextLine();
		
		// Create variable for menu selection
		String choice = "i";
		
		while ((!choice.equals("j")) && (!choice.equals("J"))) {
			
			// Show options
			System.out.println("A. Enter a new Main Sentence\r\n" + 
					"B. Find a String \r\n" + 
					"C. Find all incidents of a string\r\n" + 
					"D. Find and Replace the String \r\n" + 
					"E. Replace all incidents of a string to another one\r\n" + 
					"F. Count the number of words\r\n" + 
					"G. Count the number of occurrences of a letter\r\n" + 
					"H. Count the total number of letters\r\n" + 
					"I. Delete all the occurrences of a word\r\n" + 
					"J. Exit\r\n\n\tEnter your choice:" );
			
			choice = input.next();
		
			// If else statement for selected option
		
			// Option A: Enter a new Main Sentence
				if (choice.equals("a") || choice.equals("A")) {
				
					// Prompt user for new sentence and assign to variable
					System.out.println("Input a new Main Sentence: ");
					main = input.nextLine();
					main = input.nextLine();
					
					// Display new sentence
					System.out.println("The new main sentence is: \n" + main + "\n");
					
				}
				
			// Option B: Find a String
				else if (choice.equals("b") || choice.equals("B")) {
				
					// Prompt user for search String and assign to variable
					System.out.println("Enter the search string: ");
					String search = input.nextLine();
					search = input.nextLine();
					
					// If-else logic for search string; if the string is found
					if (main.contains(search)) {
						// Display Result
						System.out.println(search + " is contained in the sentence at index " + main.indexOf(search) + "\n");
					// Else the string is not found
					} else {
						// Display result
						System.out.println(search + " is not found!\n");
					}
				}
				
			// Option C: Find all incidents of a string
				else if (choice.equals("c") || choice.equals("C")) {
					
					// Prompt user for String and assign to variable
					System.out.println("Enter the string you want to find all incidents for: ");
					String search = input.nextLine();
					search = input.nextLine();
					// Create int variable for the index of input
					 int searchIndex = main.indexOf(search);
					
					// If-else logic for search string; if the string is found
					if (main.contains(search)) {
						
						// Searches every occurrence of String
						while (searchIndex >=0){
							// Display result including the input and the index
			                System.out.println(search + " found at position: " + searchIndex + "\n");                
			                searchIndex = main.indexOf(search, searchIndex + search.length());
			            }
					// Else String is not found	
					} else {
						// Display result
						System.out.println(search + " is not found!\n");
					}
					
				}
			// Option D: Find and Replace the String
				else if (choice.equals("d") || choice.equals("D")) {
					
					// Prompt user for search String and assign to variable
					System.out.println("Enter the search string: ");
					String search = input.nextLine();
					search = input.nextLine();
					
					// If-Else statement for if String is found
					if (main.contains(search)) {
						// Prompt user for replacement String and assign it to variable
						System.out.print("Enter the String you want to replace the found String with: \n");
						String replace = input.nextLine();
						
						// index of when the search string appears
						int searchIndex = main.indexOf(search);
						
						// replacing found string with replacement string
						String replacedMain = main.substring(0, searchIndex) + replace
                                + main.substring(searchIndex + search.length(), main.length()); 
						
						// Print result
						System.out.println(replacedMain+ "\n");
						
						
					// Else String is not found	
					} else {
						// Print results
						System.out.println(search + " is not found!\n");
						}
				}
				
			// Option E: Replace all incidents of a string to another one
				else if (choice.equals("e") || choice.equals("E")) {

					// Prompt user for search String and assign to variable
					System.out.println("Enter the search string: ");
					String search = input.nextLine();
					search = input.nextLine();
					
					// If-Else statement for if String is found
					if (main.contains(search)) {
						
						// Prompt user for replacement and assign to variable
						System.out.print("Enter the String you want to replace the found String with: \n");
						String replace = input.nextLine();
						
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
						System.out.println(main + " is changed to: \n" + replacedMain + "\n");
						
					// String is not found	
					} else {
						// Display result
						System.out.println(search + " is not found!\n");
						}
					
					
				}
			// Option F: Count the number of words:
				else if (choice.equals("f") || choice.equals("F")) {
					
					// Use .trim method to create a new trimmed String
					String trim = main.trim();
					// If there are no gaps between char's
					if (trim.isEmpty())
						// Display result
					    System.out.println(0);
					// Else there are gaps between chars. Display result
		
					System.out.println("The number of words are: " + trim.split("\\s+").length + "\n"); 
					
				}
			// Option G: Count the number of occurrences of a letter
				else if (choice.equals("g") || choice.equals("G")) {
						
						// Declare and assign counter
					  int count = 0;
					  int i;
					  // Declare char
					  String letter;
					  // Prompt user for input and assign to variable
					System.out.println("Enter a letter to count the number of occurrences: \r\n");	
				        letter = input.next();
				        		
				        char ch = letter.charAt(0);

				        // Loop to increase counter for every occurrence of char
				        for (i=0; i < main.length(); i++) {	
				            if (ch == main.charAt(i)) {
				                 count++;
				             }
				         }
				        // Display result
				       System.out.println("The number of letters are: " + count + "\n");
				}
			// Option H: Count the total number of letters
				else if (choice.equals("h") || choice.equals("H")) {
					
					// initialize variables
					int numSpaces;
					String trim = main.trim();
					
					// First identity the number of spaces: If there are no gaps between char's
					if (trim.isEmpty())
						// Assign value 0 to variable
					    numSpaces = 0;
					// Else there are gaps between chars. Assign result
					numSpaces = trim.split("\\s+").length; 
					
					// int variable for storing total number of character is equal to the length of string - number of spaces
					int numLetters = main.length() - numSpaces + 1;
					// Display result 
					System.out.println("The number of letters are: " + numLetters + "\n");
					
				}
			// Option I: Delete all the occurrences of a word
				else if (choice.equals("i") || choice.equals("I")) {
					// Prompt user to enter a word to delete; assign word to variable
					System.out.println("Enter a word to delete:");		
					String word = input.nextLine();
					word = input.nextLine();
					
					// Declare variable for new 
					String newMain = main;
			        // Find the index of occurrence using sentence.indexOf method
			        int wordIndex = main.indexOf(word);
			      
			        // If the word does not exist in the sentence
			        if (wordIndex < 0){
			        	// Display Result
			            System.out.println("Word is not present in sentence." + "\n");
			        }
			        // Else the word is present in the sentence
			        else{
			        	// Use .replaceAll method to delete word
			            newMain = main.replaceAll(word,"");
			            // Display Result
			            System.out.println("The new Main Sentence is: " + newMain + "\n");
			        }
			      
			    }	
				
			// Option J: Exit
				else if (choice.equals("j") || choice.equals("J")) {
					
					// Display end prompt
					System.out.println("Bye!");
					
				}
			// Invalid input
				else {
					// Display invalid prompt
					System.out.println("Invalid input" + "\n");
				
				}
		}

	}

}
