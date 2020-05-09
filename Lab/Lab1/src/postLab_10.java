/*
 * @author Tetsu Ri
 * @version 5/23/2019
 * Description: Unit converter (km -> miles)
 * 
 * Pseudocode: [Steps of the program]
 * 
 * 
 */


import java.util.Scanner;
public class postLab_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Scanner input = new Scanner(System.in);
		 System.out.println("ID001" + "\n");
		 
		// Prompt the user for input
		 System.out.println("Enter a distance in miles: " );
	
		double miles = input.nextDouble();
		 
		 double kilometers = miles * 0.621;
		 System.out.println(miles + "miles in kilometers is " + kilometers);
		 
	}

}
