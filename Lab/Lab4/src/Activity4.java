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
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first String:");
		String string1 = input.next();
		
		System.out.println("Enter second String:");
		String string2 = input.next();
		
		if (string1 == string2)
			 System.out.println("string1 and string2 are the same object");
			else
			 System.out.println("string1 and string2 are different objects");
		
		if (string1.equals(string2))
			 System.out.println("string1 and string2 have the same contents");
			else
			 System.out.println("string1 and string2 are not equal");
}
}