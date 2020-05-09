/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		This program prompts the user to enter two integers and displays their greatest common divisor
 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner
 * 		Create new Scanner
 * 		Print Assignment ID
 * 		Prompt the user to enter two integers
 * 		Print result post method
 * 		Create the method gcd to return the greatest common factor of tow integers
 * 		Declare and initialize gcd is 1
 * 		Declare and initialize the possible value of gcd to 2
 * 		Create a loop to find the gcm
 * 		Update gcd if modulus returns 0 for both integers
 * 		Return the value of gcd
 * 		End

 */

// Import Scanner
import java.util.Scanner;

public class GreatestCommonDivisorMethod {

	/** Main method */
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);
	 
		// Print Assignment ID
		System.out.println(" ID003 ");
				
		// Prompt the user to enter two integers
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		// Print result post method
		System.out.println("The greatest common divisor for " + n1 +
			  " and " + n2 + " is " + gcd(n1, n2));
	 }
			
		/** Return the gcd of two integers */
	public static int gcd(int n1, int n2) {
		
		// Declare and initialize gcd is 1
		int gcd = 1; 
		// Declare and initialize the possible value of gcd to 2
		int k = 2; 			 
		
		// Create a loop to find the gcd
		while (k <= n1 && k <= n2) {
			
				// Update gcd if modulus returns 0 for both integers
			 if (n1 % k == 0 && n2 % k == 0)
				 gcd = k; 
			 k++;
		}
		// Return gcd	 
		return gcd; 
	 
	}
}