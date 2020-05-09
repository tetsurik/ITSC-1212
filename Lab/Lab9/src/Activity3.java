/*
 * @author Tetsu Ri
 * @version 06/10/2019
 * 
 * Description:
 * 		This program will:
 * 		
 * 
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create new Scanner
 * 		Prompt user for input and assign variables
 * 		Create new detector
 * 		Prompt user for desired shape
 * 		Print desired shape with user submitted parameters
 * 		Prompt user to add point
 * 		Add point with user submitted parameters
 * 		Check if point is in a shape
 * 		Prompt user to restart
 * 		If yes, remove shapes and restart
 * 		If not, Exit
 * 
 * 
 * 
 *  Declare and initialize variables
 *  Initialize int for choice
 * Initialize array for sorting
 * Create do-while loop for displaying menu and executing functions
 * 		Display menu option and prompt user to make a selection
 * 		Assign choice to variable.
 * 		Create Switch case for executing each function
        
        Case 1: Linear Search
 * Call display method to display Titles, ID'd and Prices
 * Prompt user for ID and assign input to variable
 * Prompt user for quantity and assign input to variable
 * Record start time of search
 * Call Linear Search method
	Find total time of execution
	If-Else statement for valid Book ID.
            	// If book is found, display result
 * 					Else, display error
 * 
 * Case 2: Binary Search   
 * Call display method to display Titles, ID'd and Prices
 *  Prompt user for ID and assign input to variable
 * Prompt user for quantity and assign input to variable
 * Record start time of search
 * Call Binary Search method
 * Find total time of execution
 * If-Else statement for valid Book ID.
        	// If book is found, display result
 * Else, display error
 * 
 * 
 * Case 3: Bubble Sort
 * Print selected function
 *  Fill array with 100 random integers from 1 to 500
 * Display unsorted array
 * Record start time of search
 *  Call Bubble Sort method
 * Find total time of execution and assign to variable
 * Print sorted array and total time of execution
 * 
 * 
 *  Case 4: Selection sort
 * Print selected function
 * Fill array with 100 random integers from 1 to 500
 * Display unsorted array
 * Record start time of search
 *  Call Selection Sort method
 * Find total time of execution and assign to variable
 * Print sorted array and total time of execution
 * 
 * 
 * Loop program until the user chooses to exit 	
 * 
 * If user chooses to exit, print goodbye message
 * 
 * 
 * Create display method
 * Print the arrays for Titles, Id's
 * Measure spaces to tab right prices
 * Print prices in tabular format
 * 
 * Create Linear Search method
 * Initialize variable for linear search
 * Loop through array chronologically until input matches value
 * If found, return index. If not, return -1
 * 
 * Create Binary Search method
 * Initialize variables for binary search
 * Create loop to find ID. Eliminate half of the list upon each iteration
 * If found, return index. If not, return -1
 * 
 *  Create bubble sort method
 * Perform the ith pass
 * Compare and order the pairs of elements sequentially until sorted
 *  swap if next int is greater
 *  return arranged array
 * 
 * Create selection sort method
 *  record the position of the smallest
 * update min when finding a smaller element
 * put the smallest element at position i
 * return arranged array
 * 
 * Create a method to swap numbers
 * Create temporary arrays to swap values
 * End
 */

// import Scanner and Random class
import java.util.Scanner;
import java.util.Random;

public class Activity3{

    public static void main(String[] args) {
    	
    	// Create new Scanner
        Scanner input = new Scanner(System.in);
       
        
        // Create new Random method
        Random random = new Random();
        
        // Declare and Initialize Arrays 
        String[] bookTitles = { "Starting out with Java", "Java Programming",
                "Software Structures", "Design and Analysis of Algorithms",
                "Computer Graphics",
                "Artificial Intelligence: A Modern Approach",
                "Probability and Statistics", "Cognitive Science",
                "Modern Information Retrieval",
                "Speech and Language Processing" };
      
        int[] bookIDs = { 1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800,
                1999};
        
        double[] bookPrices = { 112.32, 73.25, 54.00, 67.32, 135.00, 173.22,
                120.00, 42.25, 32.11, 123.75};
        
        // Declare and initialize variables
        int id, quantity, resultIndex;           
        double startTime, executionTime;
        
        // Initialize int for choice
        int choice;
        
        // Initialize array for sorting
        int[] sort = new int[100];
        
        // Create do-while loop for displaying menu and executing functions
        do {
        	// Display menu option and prompt user to make a selection
        	System.out.println("\n 1. Linear Search \n 2. Binary Search \n 3. Bubble Sort \n 4. Selection Sort \n 5. Quit"
               		+ "\n\n   Please enter number between 1-5: ");
        	
        	// Assign choice to variable.
        	choice = input.nextInt();
        	
        	// Create Switch case for executing each function
        	switch (choice) {
        
        // Case 1: Linear Search	
        case 1:
        	// Call display method to display Titles, ID'd and Prices
            display(bookTitles, bookIDs, bookPrices);
            
            // Prompt user for ID and assign input to variable
            System.out.println("\n\n *** LINEAR SEARCH ***\n\nPlease enter the book ID you wish to purchase from the list above: ");
            id = input.nextInt();
            
            // Prompt user for quantity and assign input to variable
            System.out.print("\nHow many books do you wish to purchase: ");
            quantity = input.nextInt();
            
            // Record start time of search
            startTime = System.currentTimeMillis();
            
            // Call Linear Search method
            resultIndex = linearSearch(bookIDs, id);
            
            // Find total time of execution
            executionTime = System.currentTimeMillis() - startTime;
            
            // If-Else statement for valid Book ID.
            	// If book is found, display result
            	if(resultIndex !=-1){
                System.out.println("\nBook ID: " + bookIDs[resultIndex]);
                System.out.println("Book Title: " + bookTitles[resultIndex]);
                System.out.println("Book Count: " + quantity);
                System.out.println("Total Cost: " + (quantity * bookPrices[resultIndex]) +" $");
                System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
                //Else, display error
            } else {
                System.out.println("Book ID not found. Please enter a valid Book Id");
            }
            break;
         // Case 1: Binary Search   
        case 2:
        	// Call display method to display Titles, ID'd and Prices
            display(bookTitles, bookIDs, bookPrices);
            
            // Prompt user for ID and assign input to variable
            System.out.println("\n\n *** BINARY SEARCH ***\n\nPlease enter the book ID you wish to purchase from the list above: ");
            id = input.nextInt();
            
            // Prompt user for quantity and assign input to variable
            System.out.print("\nHow many books do you wish to purchase: ");
            quantity = input.nextInt();
           
            // Record start time of search
            startTime = System.currentTimeMillis();
            
            // Call Binary Search method
            resultIndex = binarySearch(bookIDs, id);
            
            // Find total time of execution
            executionTime = System.currentTimeMillis() - startTime;
            
         // If-Else statement for valid Book ID.
        	// If book is found, display result
            if(resultIndex !=-1){
                System.out.println("\nBook ID: " + bookIDs[resultIndex]);
                System.out.println("Book Title: " + bookTitles[resultIndex]);
                System.out.println("Book Count: " + quantity);
                System.out.println("Total Cost: " + (quantity * bookPrices[resultIndex]) +" $");
                System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
              //Else, display error
            } else {
                System.out.println("Book ID not found. Please enter a valid Book Id");
            }
            break;
        
        // Case 3: Bubble Sort
        case 3:
        	// Print selected function
            System.out.println("\n *** BUBBLE SORT ***");
            
            // Fill array with 100 random integers from 1 to 500
            for(int i=0; i<100; i++){
                sort[i] = random.nextInt(500);
            }
            // Display unsorted array
            System.out.println("The unsorted array is: ");
            for(int i=0; i<100; i++){
                System.out.print(sort[i] + " ");
            }
            // Record start time of search
            startTime = System.currentTimeMillis();
            
            // Call Bubble Sort method
            sort = bubbleSort(sort);
            
            // Find total time of execution and assign to variable
            executionTime = System.currentTimeMillis() - startTime;
            
            // Print sorted array and total time of execution
            System.out.println("Sorted array is: ");
            for(int i=0; i<100; i++){
                System.out.print(sort[i] + " ");
            }
            System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
            break;
            
        // Case 4: Selection sort
        case 4:
        	// Print selected function
            System.out.println("\n *** SELECTION SORT ***");

            // Fill array with 100 random integers from 1 to 500
            for(int i=0; i<100; i++){
                sort[i] = random.nextInt(500);
            }
            // Display unsorted array
            System.out.println("The unsorted array is: ");
            for(int i=0; i<100; i++){
                System.out.print(sort[i] + " ");
            }
            // Record start time of search
            startTime = System.currentTimeMillis();
            
            // Call Selection Sort method
            sort = selectionSort(sort);
            
            // Find total time of execution and assign to variable
            executionTime = System.currentTimeMillis() - startTime;
            
            // Print sorted array and total time of execution
            System.out.println("Sorted array is: ");
            for(int i=0; i<1000; i++){
                System.out.print(sort[i] + " ");
            }
            System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
            break;
        }
      // Loop program until the user chooses to exit 	
    } while (choice != 5);
    System.out.println("Goodbye!");
    
}
 
    
    // Create display method
    static void display(String[] bookTitle, int[] bookID, double[] bookPrice) {
        
    	// Prompt function of method
    	System.out.println("Book ID Title Cost");
    	
        int maxTitleLength = 100;
        for (int i = 0; i < bookTitle.length; i++) {
            System.out.print(bookID[i] + "\t\t" + bookTitle[i]);
            int spaces = maxTitleLength - bookTitle[i].length();
            
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            System.out.println(bookPrice[i]);
        }
    }

    static int linearSearch(int[] bookIDs, int bookId) {
        int resultIndex = -1;
        for (int i = 0; i < bookIDs.length; i++) {
            if (bookIDs[i] == bookId) {
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    static int binarySearch(int[] bookIDs, int bookId) {
        int resultIndex = -1;
        int first = 0;
        int last = bookIDs.length - 1;
        int middle = (first + last) / 2;

        while (first <= last) {
            if (bookIDs[middle] < bookId) {
                first = middle + 1;
            } else if (bookIDs[middle] == bookId) {
                resultIndex = middle;
                break;
            } else {
                last = middle - 1;
            }
            middle = (first + last) / 2;
        }
        if (first > last)
            resultIndex = -1;
        return resultIndex;
    }
   
    static int[] bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--){
    // bubble up
    for (int j = 0; j <= i - 1; j++)   {
    if (arr[j] > arr[j + 1])
    swap(arr, j, j + 1);
    }
        }
        return arr;
    }
   
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
    int min = i; // record the position of the smallest
    for (int j = i + 1; j < arr.length; j++) {
    // update min when finding a smaller element
    if (arr[j] < arr[min])
    min = j;
    }
    // put the smallest element at position i
    swap(arr, i, min);
    }
        return arr;
    }
   
    public static void swap (int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
    }
   
 }
