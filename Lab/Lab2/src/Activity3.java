/*
 * @author Tetsu Ri
 * @version 05/24/2019
 * 
 * Write a program that takes in two user-inputted values and assigns them to variables. Next, swap the values
in the variables. 
 * 
 */

import java.util.Scanner;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//Create new Scanner
		
		
		System.out.println("This program that takes in two user-inputted values and assigns them to variables. Then, swap the values\r\n" + 
				"in the variables.");
		// Explanation of program
		
		System.out.println("Assign a value to x:"); // Prompt user for x and y
		double x = input.nextDouble();
		System.out.println("Assign a value to y:");
		double y = input.nextDouble();
		
		double tempX = x; // Temp memory to hold variables
		double tempY = y;
		
		x = tempY; // Assign new values to x and y 
		y = tempX;
		
		System.out.println("The variables have been now switched that x = "  // Output final result
				+ x + " and y now equals " + y );
		
		
	}

}
