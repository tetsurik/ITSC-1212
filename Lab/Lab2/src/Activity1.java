/*
 * @author Tetsu Ri
 * @version 05/24/2019
 * 
 * This program will teach children about shapes, areas, and perimeters
 * 
 * 
 */
import java.util.Scanner; //Import Scanner from util.Scanner


public class Activity1 {
	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);
		//Create new Scanner
		
		System.out.println("Shapes are fun! Today we will learn about perimeters and areas!"); 
		// Greeting for user
		
		System.out.println("Let's start by typing in the length and height of a rectangle!");
		// Prompt user to enter data
		
		System.out.println("\n");
		
		System.out.println("Length: ");
		double length = input.nextDouble(); // Variable for length
		
		System.out.println("Width: ");
		double width = input.nextDouble(); // Variable for width
		
		double perimeter = length*2 + width*2; // Calculate the perimeter
		double area = length * width; // Calculate the are
		
		
		System.out.println("We can calculate the perimeter by adding up all four sides of the" + "\n" + // Display result in perimeter
				 "rectangle which can be written as: " + length + " + " + length + " + " + width + 
				" + " + width + " = " + perimeter);
		
		System.out.println("\n");
		
		System.out.println("We can calculate the area by multiplying the length and the width" + "\n" + " which can be written as: "
				+ length + " x " + width +" = " + area);
		// Display result in area
		
		System.out.println("\n");
		
		System.out.println("Goodjob!"); // Final comment
		
		
	}
}
