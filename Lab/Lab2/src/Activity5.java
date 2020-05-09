/*
 * @author Tetsu Ri
 * @version 05/24/2019
 * 
 * Write a program that allows Billy to quickly determine gas mileage
 * 
 */
import java.util.Scanner;

public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		// Create new Scanner
		
		System.out.println("Enter total miles driven: "); // Prompt user to enter miles driven
		double miles = input.nextDouble();
		
		System.out.println("Enter amount of gas consumed (gal): "); // Prompt user to enter gas consumed
		double gas = input.nextDouble();
		
		double mpg = miles / gas; // Perform calculation
		
		System.out.println("The mileage of the vehicle driven in mpg is: " + mpg); // Output final solution
		

	}

}
