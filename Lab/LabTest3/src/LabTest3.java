/*
 * @author Tetsu Ri
 * @version 06/21/2019
 * 
 * Description:
 * 		 This program will ask the user to enter the length of the array. Based on the 
 * 		 input, a method will populate the array with a set of integers.

 * 		This program will allow the user to choose between the following menu choices:

			1. Search Array
			2. Sort Array
			3. Shuffle Array
			4. Re-Initialize Array
			5. Analyze Array
			6. Display Array
			7. Quit

		
	
 * 
 * 	
 * Pseudocode:
		Shuffle Array method
			
		Re-Initialize Array method
			Prompt user for new size and assign input to variable
			Create new array
			Call fillarray to enter integers into array
			Display new array
		Sort Array method
 * 			Initialize loop to repeat the length of array
 * 			record the position of the smallest
			update min when finding a smaller element
			 put the smallest element at position i
			return arranged array
 */

import java.util.Scanner;
import java.util.Random;

public class LabTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Create new Scanner
        Scanner input = new Scanner(System.in);
        
        // Create new Random method
        Random random = new Random();
        // Initialize int for choice
        int choice;
        
         // Prompt user for size of array
        System.out.println("Enter the size of the array: ");
        int i = input.nextInt();
        int[] main = new int[i];
        
        // Call fillarray to enter integers into array
        fillArray(main);
        
        do {
        	// Display menu option and prompt user to make a selection
        	System.out.println("Menu: \n 1. Search Array \n "
        			+ "2. Sort Array \n "
        			+ "3. Shuffle Array \n "
        			+ "4. Re-Initialize Array \n "
        			+ "5. Analyze Array \n "
        			+ "6. Display Array \n "
        			+ "7. Quit"
               		+ "\n\n   Please enter number between 1-7: ");
        	
        	// Assign choice to variable.
        	choice = input.nextInt();
    	
        	// Create Switch case for executing each function
        	switch (choice) {
    
    			// Case 1: Search Array
        		case 1:
        			// Prompt user for input and assign to variable
        			System.out.print("Enter a parameter: ");
                    int searchIndex = input.nextInt();
                    
                    // Call search method
                    int index = search(main, searchIndex);
                    
                    // Display result
                    // If found display index
                    if(index != -1) {
                    	System.out.println("Found at:" + index);
                    }
                    // Else display error
                    else {
                    	System.out.println("Parameter not found");
                    }
        			break;
    		
        		// Case 2: Sort Array  
        		case 2:
        			// Display prompt 
        			System.out.println("Sorting array…");
        			// Call sort method
                    sort(main);
                    // Call display method to print result
                    display(main);
        			break;
    
        		// Case 3: Shuffle Array
        		case 3:
        			// Display prompt 
        			System.out.println("Suffling the array ....");
        			// Call shuffle method
                    shuffle(main);
                    // Call display method to print result
                    display(main);
        			break;
        
        		// Case 4: Re-Initialize Array
        		case 4:
        			// Prompt user and assign input to variable
        			 System.out.print("Enter the size of the array :");
                     i = input.nextInt();
                     
                     // Create new array
                     main = new int[i];
                     // Call fillarray to enter integers into array
                     fillArray(main);
                     // Display new array
                     display(main);
        			break;
	    	
        		// Case 5:  Analyze Array
        		case 5:
    	
        			break;
    	   
        			// Case 6: Display Array
        		case 6:
        			// Call display method to display array
        			display(main);
        			break;
        
        	}
    	// Loop program until the user chooses to exit 	
    	
    	// If user chooses to exit, print goodbye message
        } while (choice != 7);
        System.out.println("Goodbye!");

}

	static void fillArray(int[] main) {
	
		// Create a random Class object
		Random r = new Random();
		// Fill array with random integers of -100 to 2200
		for (int i = 0; i < main.length; i++) {
			main[i] = r.nextInt((200) + 1) - 100;
	
		}
	}
	private static int search(int[] main, int searchIndex) {
				// Initialize index of -1
		       int index = -1;
		       // Loop until searched Index is found within array 
		       for (int i = 0; i < searchIndex; i++) {
		           if (main[i] == searchIndex)
		               return i;
		       }
		       // return found Index
		       return index;
		   
	}
	private static void display(int[] main) {
		// Print each entry of array
		 for (int i = 0; i < main.length; i++) {
	            System.out.print(main[i] + " ");
		 }
	}

	//Create selection sort method
	private static int[] sort(int[] main) {
		//Initialize loop to repeat the length of array
		for (int i = 0; i < main.length - 1; i++) {
    	
			// record the position of the smallest
			int min = i;
			for (int j = i + 1; j < main.length; j++) {
    		
				// update min when finding a smaller element
				if (main[j] < main[min])
    			min = j;
			}
			// put the smallest element at position i
			swap(main, i, min);
		}
		// return arranged array
		return main;
	}

	// Create a method to swap numbers
	public static void swap (int[] main, int i, int j) {
		// Create temporary arrays to swap values
		int temp = main[i];
		main[i] = main[j];
		main[j] = temp;
	}
	// Create a method to shuffle
	private static void shuffle(int[] main) {
		// Loop the shuffle method the length of main times
		for (int i = 0; i < main.length; i++) {
			
			// Create 
			int index1 = (int) (Math.random() *(200) + 1) - 100;
			int index2 = (int) (Math.random() *(200) + 1) - 100;		
			int temp = main[index1];
			main[index1] = main[index2];
			main[index2] = temp;
		}
}	
	
}