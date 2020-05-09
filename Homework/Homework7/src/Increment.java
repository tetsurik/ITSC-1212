/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		 This program demonstrates the effect of passing value by invoking a method with an argument
		to increment a value

 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Print Assignment ID
 * 		Initialize and define x
 * 		Invoke increment
 * 		Display result post increment
 * 		Create a new method to increment
 * 		 	increment n
 * 			Print n from inside method
 * 		End

 */

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Print Assignment ID
		System.out.println(" ID001 ");
		
		// Initialize and define x
		int x = 1;
		System.out.println("Before the call, x is " + x);
		// Invoke increment
		 increment(x);
		 // Display result post increment
		 System.out.println("After the call, x is " + x);
		 }
		 
	// Create a new method to increment
	public static void increment(int n) {
		// increment n
		n++;
		// Print n from inside method
		System.out.println("n inside the method is " + n);
	}

}
