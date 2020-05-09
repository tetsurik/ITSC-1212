package homework2;
/*
 * @author Tetsu Ri
 * @version 5/23/2019
 * Description: Unit converter (km -> miles)
 * 
 * Pseudocode: [Steps of the program]
 * 
 * 
 */

public class postLab1 {

	public static void main(String[] args) {
		import java.util.Scanner;
		// TODO Auto-generated method stud
		Scanner s = new Scanner(System.in);
		 System.out.println("ID001" + "\n");
		 
		// Prompt the user for input
		 System.out.println("Enter a distance in miles: " );
		 double miles = s.nextDouble();
		 
		 double kilometers = miles * 0.621;
		 System.out.println(miles + "miles in kilometers is " + kilometers);
		 
		 
		 

	}

}
