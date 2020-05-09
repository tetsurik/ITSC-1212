/*
 * @author Tetsu Ri
 * @version 06/02/2019
 * 
 * Description:
 * 		Write a Java Program that displays a menu with five different options:
			1. The Summation and Average of numbers from 1 to an integer number N.
			2. Dice Roll
			3. Total Price Calculator
			4. Compute Distance
			5. Quit
 * 			
 * 
 * Pseudocode:
 * 			Import Scanner
 * 			Create new Scanner
 * 			Display the functions of the program for the user to choose
 * 				1. The Summation and Average of numbers from 1 to an integer number N.
				2. Dice Roll
				3. Total Price Calculator
				4. Compute Distance
				5. Quit
 * 			Prompt the user for input
 * 			Assign the user input to a string
 * 			Create an if-else statement to run the program chosen by the user 
 * 				Option 1: The Summation and Average of numbers from 1 to an integer number N.
 * 						Prompts the user to enter an integer number N.
						Prompts the user to enter an integer number N.
						Calculate sum of integers 1 to N using the formula "sum = ( N / 2.0 * ( 1.0 + N))
						Display sum in terms of N
						Calculate the average with the formula "average = sum/N"
						Assign variable to a double
						Display average in terms of N
						Display end message
				Option 2: Dice Roll
						Create string variable for user input
						Display dice roll scenario and prompt user to guess odd/even
						Simulate dice roll using Math.random() 
						Cast variable roll to double
						Assign user input to string guess
						Create an if-else statement and display result
						Display end message
				Option 3: Total Price Calculator
						Prompts the user to enter the unit price of an item
						Assign user input to variable
						Prompt user to enter number of purchases units
						Assign user input to variable
						Calculate total price
						Display result
						Display end message
				Option 4: Compute Distance
						Print the function of the program and prompt user for x1 input
						Declare and assign input to x1
						Prompt user for input. Declare and assign input to y1
						Prompt user for input. Declare and assign input to x2
						Prompt user for input. Declare and assign input to y2
						Calculate the distance between the two points with the formula "√ (x2 − x1)^2 + (y2 − y1)^2
						Display results
						Display end message
				Option 5: Quit
						Display end message
			End
						
 */
import java.util.Scanner; // Import Scanner

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create new Scanner
				Scanner input = new Scanner(System.in);
				
				// Display the options for the user to choose
				System.out.println("The functions of this program is as follows:" + "\n"+ "\n" +
									"1. The Summation and Average of numbers from 1 to an integer number N." + "\n" + 
									"2. Dice Roll" + "\n" + 
									"3. Total Price Calculator" + "\n" +
									"4. Compute Distance" + "\n" + 
									"5. Quit" + "\n");
				
				// Prompt user for input
				System.out.println("Please make a selection:");
		      
				// Assign input to string
				int choice = input.nextInt();
				 
				 // If-else statements for running user selected program
				
						// Option 1: The Summation and Average of numbers from 1 to an integer number N.
				if (choice == 1) {
							// Prompts the user to enter an integer number N.
						System.out.println("Please enter an integer number N.");					
							// Assign user input to int N
						int N = input.nextInt();
							// Calculate sum of integers 1 to N
						double sum = (double) ( N / 2.0 * ( 1.0 + N));
							// Display sum
						System.out.println("The total of all integers from 1 to the number " + N + " is " + sum + ".");
							// Calculate the average
						double average = sum/N;
							// Display average
						System.out.println("The average of all the integers from 1 to the number " + N + " is " + average + ".");
							// End
						System.out.println("Goodbye!");			
					
						
						
						// Option 2: Dice Roll
				}else if (choice == 2) {
					
							//Create string variable for user input
						String guess;
				
							// Display scenario and prompt user for input
						System.out.println("A dice has been rolled! Guess whether the dice value is even or odd." + "\n" + "\n" +
						"Please enter odd or even:");	
						
							// Simulate dice roll
						int rollInt = (int) (Math.random()*((6-1+1)+1));
						
							// Cast roll to double
						double roll = (double) rollInt;
						
							// Assign user input to string guess
						guess = input.next();
						
				
							// Win-lose logic and display result to user
						
							// Isolate all even rolls 
							if (roll % 2.0 == 0.0) {
								// Scenario for guessing even
								if (guess.equals("even")) {
								System.out.println("Congratulations! The dice value is " + roll + " and you guessed even!");
								// Scenario for guessing odd
							}	else {
								System.out.println("Unfortunately, the dice value is " + roll + " and you guessed odd.");
							}
							}
							// Leftover with all odd rolls
							else {
								// Scenario for guessing odd 
								if (guess.equals("odd")) {
								System.out.println("Congratulations! The dice value is " + roll + " and you guessed odd!");
								// Scenario for guessing even
							}	else {
								System.out.println("Unfortunately, the dice value is " + roll + " and you guessed even.");
							}
							} 
							
							// End
							System.out.println("Goodbye!");			
						
					
					
						// Option 3: Total Price Calculator
				}else if (choice == 3) {
						// Prompts the user to enter the unit price of an item
						System.out.println("Please enter the unit price of an item: ");
						//Assign user input to variable
						double price = input.nextDouble();
						// Prompt user to enter number of purchases units
						System.out.println("Please enter the number of purchased units: ");
						// Assign user input to variable
						int unit = input.nextInt();
						// Calculate total price
						double total = unit*price;
						// Display result
						System.out.println(unit + " unit(s) at $" + price + " per item comes to a toal of $" + total + ".");
						
						// End
						System.out.println("\n" + "Goodbye!");
					
						
						
						// Option 4: Compute Distance
				}else if (choice == 4) {
						// Display function and prompt user for input
						System.out.println("Please enter the x and y coordinates for two points (x1, y1 and x2, y2). "
								+ "\n" + "This program will compute and display the distance between the two points." + "\n" +
								"Enter x1:");
						// Declare and assign input to x1
						double x1 = input.nextDouble();
						// Prompt user for input. Declare and assign input to y1
						System.out.println("Enter y1:");
						double y1 = input.nextDouble();
						// Prompt user for input. Declare and assign input to x2
						System.out.println("Enter x2:");
						double x2 = input.nextDouble();
						// Prompt user for input. Declare and assign input to y2
						System.out.println("Enter y2:");
						double y2 = input.nextDouble();
						
						// Calculate the distance between the two points
						double distance = Math.pow((Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2)) , 0.5);
						
						//Display results
						System.out.println("The distance between the points (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") is " + distance + ".");
						
						// End
						System.out.println("\n" + "Goodbye!");
						
						
							
						// Option 5: Quit
				}else if (choice == 5) {
					System.out.println("Goodbye!");
						
						
			
				
		
	}

}
}