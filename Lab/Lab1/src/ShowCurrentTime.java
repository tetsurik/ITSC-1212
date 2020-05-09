/*
 * @author Tetsu Ri
 * @version 5/23/2019
 * Description: Displaying the Current Time (GMT)
 * 
 * How do you obtain the current second, minute, and hour?
 * 	
 * 
 *  	The current second, minute, and hour is obtained by first 
 *  	invoking System.currentTimeMillis() which returns the current 
 *  	time in milliseconds elapsed since midnight, January 1, 1970 GMT. 
 *  
 *  	The total second elapsed is then calculated by using the / operator.
 * 		The current second can now be derived; the finding the remainder is 
 * 		obtained by the % operator.
 *
 *		This process is repeated with the remaining minute and hour.
 * 
 * 
 */

import java.util.Scanner; //Import Scanner from util.Scanner


public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in); // Create a Scanner
        // Variable Declaration
		
		System.out.println("ID001" + "\n");
		
		// Obtain the total milliseconds since midnight, Jan 1, 1970
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1970
		long totalSeconds = totalMilliseconds / 1000;
		
		// Compute the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinute = totalMinutes % 60;
		
		// Obtain total hours
		long totalHours = totalMinutes/ 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		//Display results
		System.out.println("Current time is " + currentHour + ":"
				+ currentMinute + ":" + currentSecond + " GMT");
		
		int x = 5;
		int y = 2;
		int z = x%y;
	
		System.out.println(z);
		
		int power = (int)(Math.pow(2,3));
		System.out.println(power);
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the price: ");
		double price = in.nextDouble();
		System.out.print("Enter the discount rate: ");
		double rate = in.nextDouble();
		double newPrice = price - price * (rate/100.0);
		System.out.println("The new price is " + newPrice);
	}
	}
	


