import java.util.Arrays;
import java.util.Scanner;


public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		int i = 0;
		
		System.out.println("How many names would you like to enter?");
		int namesLength = input.nextInt();
		
		String [] names = new String[namesLength];
		
		for (i = 0; i < names.length; i++) {
			System.out.println("Enter the names:");
			 names[i] = input.next();
		}
			System.out.println("The names in alphabetical order are:");
			
		Arrays.sort(names);
        for(i = 0; i < names.length; i++)
        	
            System.out.println(names[i]);
	}

}
