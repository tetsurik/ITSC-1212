import java.util.Scanner;// Import Scanner
public class Activity2 {

	
	public static void main(String[] args) {
		//declarations
		int choice = 0;
		double op1, op2;
		double result = 0;
		// Display menu for user
		
		while (choice !=5) {
		//Step 1 : display message
		System.out.println("Enter \r\n" + 
				"1. Add\r\n" + 
				"2. Subtract\r\n" + 
				"3. Multiply \r\n" + 
				"4. Divide \r\n" + 
				"5. Exit\r\n"+
				"What is your choice ? -");
	  //Step 2:
	  // Create Scanner to get user input choice and operands
	   Scanner input = new Scanner(System.in);
	   //Steps 3:
	   //Get user input
	   choice = input.nextInt();
	   if (choice != 5) {
	   // op1
	   System.out.println("Enter first variable in calculation:");
	   op1= input.nextDouble();
	   //op2
	   System.out.println("Enter second variable in calculation:");
	   op2 = input.nextDouble();
	   
	   //later iterative
	   // switch of if-else if branching statements?
	   switch(choice)
	   {
	   //Add
	   case 1:
		   result = op1 +op2;
		   break;
	   //Subtract
	   case 2:
		   result = op1 - op2;
		   break;
	  //Multiply
	   case 3:
		   result = op1 * op2;
		   break;
	   // Divide
	   case 4:
		   if(op2 != 0)
			   result = op1/op2;
		   else
			   System.out.println("op2 is zero invalid for divsion!");	 
		   break;
	   default:
		   System.out.println("Invalid option is provided!");
	   }
			   
       System.out.println("Your solution is: " + result);
	   }
	   else {
		   System.out.println("Goodbye!");
	   }
	 
	}}

}
