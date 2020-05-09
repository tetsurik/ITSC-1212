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
import java.util.*;
public class Testingu {
/** Main method */

	    public static void main(String[] args) 
	    	{   
	    	int x  = 4;

	    	if (x == 4) {

	    	int x = 5;

	    	System.out.print(x);

	    	}

	    	System.out.print(x);
	    	}}