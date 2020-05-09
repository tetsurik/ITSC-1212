import java.util.Scanner; //Import Scanner from util.Scanner

	public class BasicCalculator { // Name of class
	    public static void main(String[] args){
	        Scanner input = new Scanner(System.in); // Create a Scanner
	        // Variable Declaration
       int  y, x, z, z2; // Declare values y, x, z, z2 as int
       double dy, dx, dz; // Declare values dy, dx, dz as double
       float f = 7.12f; // Declare f as float
       System.out.print("Enter a Double Number (dy): "); // Prompt user for input
      //Take user input and store it in dy
      dy = input.nextDouble(); //Take user input and store it in dy
      //Prompt the user for another number
      System.out.print("Enter another Double Number (dx): "); // Prompt user for 								 input
	dx = input.nextDouble(); //Take user input and store it in dx
      y = (int) dy           ; // What do you think will happen now? 
      x = (int) dx; //  
      System.out.println("Line 18 " + y + " , " + dy);
      // What is the output in Line #18?
      System.out.println("Line 20 " + x + " , " + dx);
     //What is the output in Line #20?
      dz = dx + dy;
       z = (int) dx + (int) dy;
       f = z;
       z2 = x + y;
       System.out.println("Line 26 " + z + " , " + z2 + " , " + f);
      //What is the output in Line #26?
      //Are they the same? If different, explain why are they different? (Write your answer in the Table below for Line #28.)
	System.out.println("Line 29 " + x / y + " , " + dx / dy);
     //What is the output in Line #29?
      System.out.println("Line 31 " + x % y + " , " + (int)dx % (int)dy);
      //What is the output in Line #31?
}
	}