/*
 * @author Tetsu Ri
 * @version 05/28/2019
 * 
 * Read the balance and the annual percentage rate in order to compute the interest
 * on the next monthly payment using the formula:
 * 
			interest = balance * (annualInterestRate/1200)

 * 
 * Pseudocode:
 * 			Prompt the user to "Enter balance: "
 * 			Declare and initialize user input into a double
 * 			Prompt the user to "Enter annual interest rate: "
 * 			Declare and initialize user input into a double
 * 			Perform the calculation: interest = balance * (annualInterestRate/1200)
 * 			Assign interest rate to new double
 * 			Display results by printing "The interest is " + interest
 * 
 * 
 */

import java.util.Scanner; // Import Scanner
public class PostLab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("ID002"); // Print ID for assignment
		
		Scanner input = new Scanner(System.in); 
		//Create new Scanner
		

		System.out.println("Enter balance: "); 				//Prompt user for input
		double balance = input.nextDouble();				//Assign input to the variable balance

		System.out.println("Enter annual interest rate: "); //Prompt user for input
		double annualInterestRate = input.nextDouble(); 	//Assign input to the variable balance
		
		// Calculate interest and assign to variable	
		double interest = balance * (annualInterestRate/1200);
		
		// Display results
		System.out.println("The interest is " + interest);
		
		
		
		

	}

}
