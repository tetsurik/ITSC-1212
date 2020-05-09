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
public class Activity5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		String x = "The trouble with programmers is that you can never tell what a programmer is doing until it’s too late.";
		
		// Find the length of the string and display it.
		System.out.println("The length of the string is " + x.length());
		
//Ask the user to enter a string, and check whether or not that string is contained in the quote. 
		System.out.println("Please enter a string: ");
		String y = input.next();
			
			if (x.contains(y)) {
				System.out.println(y + " is contained in the quote");
				
			} else {
				System.out.println(y + " is not contained in the quote");
			}
			
			// Ask the user to enter a character, and display the index of that character.
		System.out.println("Please enter a character: ");
		String z = input.next();
		System.out.println("The index of the character " + z + " is " + x.indexOf(z));
		
		//  allow the user to enter an index position, and display the character at that index.
		System.out.println("Please enter an index postition: ");
		int position = input.nextInt();
		System.out.println("The character at index postion " + position + " is " + x.charAt(position) + ".");
		
		// Display the quote, but with “trouble” being all uppercase. 
		String q =  x.substring(0, 3);
		String w = 	x.substring(3, 11);
		String e = 	x.substring(1, 103);
		w = w.toUpperCase();
		
		System.out.println(q + w + e);
		
		// Create String with quote author
		String t = " - Seymour Cray";
		
		System.out.print(x + t);
		
		
	}
}