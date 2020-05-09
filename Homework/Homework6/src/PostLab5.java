/*
 * @author Tetsu Ri
 * @version 06/09/2019
 * 
 * Description:
 * 		Part one of this program will determine whether a number is a prime number, and display a message 
 * 		depending on whether or not it is prime.. Part two of this program
 * 		Part two of this program will allow the user to enter a max number. Then, display whether each number from 1
 * 		to the user-inputted maximum range is prime.
 * 
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 *			Part 1:
 *				Prompt user for input
 *				Assign int to variable
 *				Loop condition for part 1 (num != -1)
 *				Determine whether prime number
 *				If else statement for displaying corresponding message
 *			Part2:
 *				Prompt user for max input
 *				Assign int to variable
 *				Loop prime condition and display corresponding message with each number until int max is reached
 *		End
 * 
  */
import java.util.Scanner;// Import Scanner
public class PostLab5  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ID001");
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
	//Part 1:	
		// Prompt user for input
		System.out.println("Please enter a number (enter -1 to move to part 2): ");
		
		// Assign int to variable
		int num = input.nextInt();
		
		// loop condition for prime number
		while (num != -1) {
			boolean isPrime = false;
	        for(int i = 2; i <= num/2; ++i)
	        {
	            
	            if(num % i == 0)
	            {
	                isPrime = true;
	                break;
	            }
	        }
	        // Display result for prime number
	        if (!isPrime) {
	            System.out.println(num + " is prime.");
	        	System.out.println("Please enter a number: ");
	        	num = input.nextInt();
	        // Display result for non prime number
	        }else {
	            System.out.println(num + " is not prime.");
	     	  System.out.println("Please enter a number: ");
	     	  num = input.nextInt();
	        	   }
	        }
		
	// Part 2
		// Prompt user for max input
		System.out.println("Moving to part 2 \nEnter max number:");
		
		// Assign int to variable
		int max = input.nextInt();
		
		// loop prime condition until int max is reached
		for(int x = 1; x < max+1 ; x++){
			boolean isPrime = false;
	        for(int i = 2; i <= x/2; ++i)
	        {
	            
	            if(x % i == 0)
	            {
	                isPrime = true;
	                break;
	            }
	        }
	        // Display result for prime number
	        if (!isPrime) {
	            System.out.println(x + " is prime.");
	         // Display result for non prime number	
	        }else {
	            System.out.println(x + " is not prime.");
			   
				}
			}
	}

}
