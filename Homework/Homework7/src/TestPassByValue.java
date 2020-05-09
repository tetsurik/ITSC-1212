/*
 * @author Tetsu Ri
 * @version 06/13/2019
 * 
 * Description: 
 * 		This program demonstrates the effect of passing value by invoking a method with an argument
		to swap a value

 * 		
 * 	
 * Pseudocode:
 * 		Start
 * 		Print Assignment ID
 * 		Initialize and define variables
 * 		Print values of num1 and num2 pre method
 * 		Invoke the swap method to attempt to swap two variables
 * 		Print values of num1 and num2 post method
 * 		Create swap method
 * 		Print values of num1 and num2 pre swap
 * 		Swap n1 with n2
 * 		Print values of num1 and num2 post swap
 * 		End
 * 
		
		Scopes are important in the use of methods to insure that the variable can be properly referenced through proper 
		declaration; A local variable must be declared and initialized before it is used. When you invoke a method with an argument, the value of 
		the argument is passed to the parameter. This is referred to as pass-by-value.
 * 
 * 
 * 
 * 
 * 
 */
public class TestPassByValue {
/** Main method */
	public static void main(String[] args) {
		
		// Print Assignment ID
		System.out.println(" ID002 ");
				
		// Declare and initialize variables
		int num1 = 1;
		int num2 = 2;
		
		// Print values of num1 and num2 pre method
		System.out.println("Before invoking the swap method, num1 is " +
				num1 + " and num2 is " + num2);

		// Invoke the swap method to attempt to swap two variables
		swap(num1, num2);
		
		//  Print values of num1 and num2 post method
		System.out.println("After invoking the swap method, num1 is " +
				num1 + " and num2 is " + num2);
	}

	/** Swap two variables */
	public static void swap(int n1, int n2) {
		System.out.println("\tInside the swap method");
		
		// Print values of num1 and num2 pre swap
		System.out.println("\t\tBefore swapping, n1 is " + n1
			 + " and n2 is " + n2);

		// Swap n1 with n2
		int temp = n1;
		n1 = n2;
		n2 = temp;
		
		// Print values of num1 and num2 post swap
		System.out.println("\t\tAfter swapping, n1 is " + n1
			 + " and n2 is " + n2);
 	}
}	



