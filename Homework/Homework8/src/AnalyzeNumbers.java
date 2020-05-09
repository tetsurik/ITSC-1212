/*
 * @author Tetsu Ri
 * @version 06/16/2019
 * 
 * Description: 
 * 		This program will prompt the user to enter the number of entries and the value of each entry. The program will then find the average
 * 		 and the number of items above the average.
 * 
 * 	
 * Pseudocode:
 * 		Start
 * 		Import Scanner 
 * 		Create a new Scanner
 * 		Print Assignment ID
 		Prompt user for the size of the array and assign to variable
 		Display output using method and input
 		Create an array with n entries
 		Create the variable for sum
 		Prompt user to input array elements
 		Loop until each entry is assigned a value
 			Add each variable into the variable sum
 		Declare and calculate the variable for average
 		Loop to count each entry above average
 		Display result
 * 		End
 * 
 */
public class AnalyzeNumbers {
	
	public static void main(String[] args) { 
		
		// Import and Create a new  Scanner
		java.util.Scanner input = new java.util.Scanner(System.in); 
		
		// Print Assignment ID
		System.out.println(" ID001 ");
		
		// Prompt user for the size of the array and assign to variable
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		
		// Create an array with n entries
		double [] numbers = new double[n]; 
		
		// Create the variable for sum
		double sum = 0; 
		
		// Prompt user to input array elements
		System.out.print("Enter the numbers: ");
		
		// Loop until each entry is assigned a value
		for (int i = 0; i < n; i++) {
			numbers[i] = input.nextDouble();
			// Summation of each entry
			sum += numbers[i];
		}
		
		// Calculate the average
		double average = sum / n;
		
		// Loop for counting each entry above average
		int count = 0; 
		for (int i = 0; i < n; i++)
			if (numbers[i] > average)
				count++;
		
		// Display results
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is "
		 + count);
	}
 }



