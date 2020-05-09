/*
 * @author Tetsu Ri
 * @version 5/23/2019
 * Description: Unit converter (km -> miles)
 * 
 * Pseudocode:
 * # Output distance in kilometers from an input of distance in miles
 * print direction for user to input 
 * assign value given to the variable miles
 * declare variable kilometers and assign it to 0.621 * miles
 * output product
 *
 * 
 * 
 */


import java.util.Scanner;
public class postLab_1 {

	public static void main(String[] args) {  //This is the main method. You need this to run the program in the console.
		
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		 System.out.println("ID001" + "\n");
		 
		// Prompt the user for input
		 System.out.println("Enter a distance in miles: " );
		 
		 // Declare the variable "miles" in double
		double miles = input.nextDouble(); 
		
		// Declare and assign variable "kilometers" in terms of "miles" 
		 double kilometers = miles * 0.621;
		 
		 // Output final solution with user input onto console
		 System.out.println(miles + " miles is " + kilometers + " kilometers.");
		 
	}

}
