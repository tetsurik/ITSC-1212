import java.util.Arrays;
import java.util.Scanner;


public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
		
		System.out.println("How many Strings would you like to enter?");
		int namesLength = input.nextInt();
		
		String [] names = new String[namesLength];
		
		System.out.println("Enter the " + namesLength + " values:");
		
		for (i = 0; i < names.length; i++) {
			 names[i] = input.next();

			 
			 sum = sum + Integer.parseInt(names[i]);
		}
	

		
		System.out.println("Total: " + sum);
	
		
	}

}
