/*
 * @author Tetsu Ri
 * @version 05/28/2019
 * 
 * Description:
 * 			This program will randomly generate a lottery of a two-digit number, 
 * 			prompt the user to enter a two-digit number, and determines whether 
 * 			the user wins according to the following rules:
 * 				1. If the user input matches the lottery number in exact order, the award is $10,000
 				2. If all digits in the user input match all digit in the lottery number, the award is $3,000
 				3. If one digit in the user input matches a digit in the lottery number, the award is $1,000
 * 
 * Pseudocode:
 * 			Generate a lottery number using Math.random
 * 			Prompt user to guess two number
 * 			Get digits from lottery
 * 			Get digits from guess
 * 			Check the guess and display result
 * 			
 * 
 */
import java.util.Scanner;

public class PreLab3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ID001"); // Print ID for assignment

		// Generate a lottery number
		int lottery = (int)(Math.random() * 100);
		
		// Prompt the user to enter a guess
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();
		
		// Get digits from lottery
		int lotteryDigit1 = lottery / 10;
		int lotteryDigit2 = lottery % 10;
		
		//Get digits from guess
		int guessDigit1 = guess / 10;
		int guessDigit2 = guess % 10;
		
		System.out.println("The lottery number is " + lottery);
		
		//Check the guess
		if (guess == lottery)
			System.out.println("Exact match: you win $10,000");
		else if (guessDigit2 == lotteryDigit1
				&& guessDigit1 == lotteryDigit2)
			System.out.println("Match all digits: you win $3,000");
		else if (guessDigit1 == lotteryDigit1
				|| guessDigit1 == lotteryDigit2
				|| guessDigit2 == lotteryDigit1
				|| guessDigit2 == lotteryDigit2)
			System.out.println("Match one digit: you win $1,000");
		else 
			System.out.println("Sorry, no match");
		
		
		
	}

}
