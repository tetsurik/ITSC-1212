/*
 * @author Tetsu Ri
 * @version 05/28/2019
 * 
 * Write a program that converts Pounds into Kilograms
 * 
 * Pseudocode:
 * 			Prompt the user to "Enter a number in pounds: "
 * 			Declare and initialize user input into a double
 * 			Perform unit conversion and assign new value to the variable kilograms
 * 			Display results in terms of original input
 * 
 * 
 */

import java.util.Scanner; // Import Scanner

public class PostLab2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ID001"); // Print ID for assignment
		
		Scanner input = new Scanner(System.in); 
		//Create new Scanner
		

		System.out.println("Enter a number in pounds: "); 
		// Prompt the user for input
				double pounds = input.nextDouble(); 
				// Declare and initialize user input
		
				// One pound is 0.454 kilograms.
		double kilograms = 0.454*pounds; // Calculate variable kilograms in terms of pounds
		
		System.out.println(pounds + " pounds is " + kilograms + " kilograms"); 
		// Display results
		
	

	}

}
