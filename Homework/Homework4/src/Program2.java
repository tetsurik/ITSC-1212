/*
 * @author Tetsu Ri
 * @version 05/30/2019
 * 
 * Description:
 * 			This program will identify Palindrome numbers.
 * 
 * Pseudocode:
 * 			create Scanner 
		declare int variable num

		display and ask the user to enter a 3-digit integer

		declare int variable firstDigit 
		firstDigit equals num / 100 num equals 
		num % 100
		num equals 
		num % 10 
		(num now represents the last digit)

		if firstDigit equals num, the original number is a palindrome 
		display “This was a palindrome”
		else 
		display “This was not a palindrome”

 * 
 */
import java.util.Scanner; // Import Scanner


public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new Scanner
		Scanner input = new Scanner(System.in);
		
		//Assignment ID
		System.out.println("ID002");
		
		
		System.out.println("Enter a three digit number: ");
		
		// Declare and assign variable
		int num = input.nextInt();
		int palindrome = num; 
        int reverse = 0;

        	// Calculate for palindrome
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        

            // Display Output
        if (num == reverse) {
        	System.out.println("This was a palindrome");
        	

        }
        else {
        	System.out.println("This was not a palindrome");
        }
	}}