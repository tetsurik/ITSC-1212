/*
 * @author Tetsu Ri
 * @version 05/28/2019
 * 
 * This is a program for a dealership that displays information and cost about a particular car model. 
 * The program will take in the car model as user-input, as well as the initial cost. 
 * It will then add a 3.6% sales tax to the total price.
 * We will also assume that the customer has a membership with the dealership, which means they will also receive a 15% discount, calculated in after tax.
 * The following items will be displayed at the end:
		1.       Car Model
		2.       Initial Cost
		3.       Sales Tax (3.6%)
		4.       Discount (15% post tax)
		5.       Final Price
		6.		 Commission for salesman (10%)



 * 
 * Pseudocode:
 * 			Prompt the user to "Enter car model: "
 * 			Declare and initialize user input into a string
 * 			Prompt the user to "Enter initial cost: "
 * 			Declare and initialize user input into a double
 * 			Perform the calculation: tax = cost*0.036 and assign result to the variable tax
 * 			Perform the calculation: cost post tax = cost + tax and assign result to the variable costPostTax
 * 			Perform the calculation: discount =  = cost post tax*0.15 and assign result to the variable discount
 * 			Perform the calculation: final Price = cost post tax - discount  and assign result to the variable finalPrice
  * 		Perform the calculation: commission = final price * 0.10 and assign result to the variable commission
  * 		Display results:
  * 			1.       Car Model
				2.       Initial Cost
				3.       Sales Tax (3.6%)
				4.       Discount (15% post tax)
				5.       Final Price
				6.		 Commission for salesman (10%)
  * 
  * 
  * 
 */			

import java.util.Scanner; // Import Scanner
public class PostLab2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println("ID003"); // Print ID for assignment
		
		Scanner input = new Scanner(System.in); 
		//Create new Scanner
		
		System.out.println("Enter Car Model: "); 		// Prompt user for input
		String model = input.next();					// Assign input to the char model
		
		System.out.println("Enter Initial Cost: "); 	// Prompt user for input
		double cost = input.nextDouble();				// Assign input to the 
		
		double tax = cost*0.036;						// Calculate tax from cost and assign to double
		double costPostTax = cost + tax;				// Calculate cost after tax assign to double
		double discount = costPostTax*0.15;	 			// Calculate discount and assign to double
		double finalPrice = costPostTax - discount;		// Calculate final price and assign to double
		double commission = finalPrice * 0.10;			// Calculate the commission and assign to double
		
		//Display results
		System.out.println("The car modelis a " + model);
		System.out.println("The initial cost is: $" + cost);
		System.out.println("The sales tax is: $" + tax);
		System.out.println("The discount is: $" + discount);
		System.out.println("The Final Price is: $" + finalPrice);
		System.out.println("The salesman will make $" + commission + " in commission");
		
		if (false) {
		    System.out.println("Hello");
		}
		
	}

}
