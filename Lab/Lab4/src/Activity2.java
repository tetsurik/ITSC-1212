/*
 * @author Tetsu Ri
 * @version 06/05/2019
 * 
 * Description:
 * 		
 * 
 * Pseudocode:
 * 		
 * 
 * 
 * 
  */
import java.util.Scanner;// Import Scanner
public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three sentences on what you think of the Lab TA.");
		
		// Assign input to strings
				String s1 = input.nextLine();
				String s2 = input.nextLine();
				String s3 = input.nextLine();
				String sTotal = s1 + s2 + s3;
				int length = sTotal.length();
				
				
				
		// Display Results
			System.out.println(sTotal);
			
			System.out.println("The character at index of 0 is " + sTotal.charAt(0) + "\n" + "The character at the last index is " + sTotal.charAt(length-1) + "\n" + "The character at the middle index is  " + sTotal.charAt(length/2));
			
			
			
	}
}