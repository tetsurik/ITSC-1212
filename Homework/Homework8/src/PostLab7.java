/*
 * @author Tetsu Ri
 * @version 06/16/2019
 * 
 * Description: 
 * 		This program will prompt the user to enter the number of sides and the
		length of one side of a regular polygon. Then the program will output displays its area

 * 
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Print Assignment ID
 		Prompt user for inputs and assign to variables
 		Display output using method and input
 		Declare method for calculating area of polygon
 		Declare and assign the variable for area in terms of int n and double side using formula for computing the area of a regular polygon
 		Return output
 * 		End
 * 
 */

import java.util.Scanner;// Import Scanner

public class PostLab7{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Print Assignment ID
		System.out.println(" ID001 ");
		
		// Prompt user for inputs and assign to variables
		System.out.println("Enter the number of sides: ");
		int n = input.nextInt();
		System.out.print("Enter the side:");
		double side = input.nextDouble();
		
		// Display output using method and input
		System.out.println("The area of the polygon is: " + area(n, side));
		
	}
	// Declare method for calculating area of polygon
	public static double area(int n, double side) {
			
			// Declare and assign the variable for area in terms of int n and double side using for computing the area of a regular polygon
			double area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI/n));
			
			// Return output
			return area;

	}

}
