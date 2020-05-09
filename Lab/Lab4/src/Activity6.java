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
public class Activity6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the dividend: ");
		double dividend = input.nextDouble();
		
		System.out.print("Enter the divisor: ");
		double divisor = input.nextDouble();
		
		if (divisor == 0) {
			System.out.println("Cannot divide a number by 0.");
		}else {
			double answer = dividend / divisor;
			System.out.println(Math.round(answer * 100.0)/100.0);
			
		}
	}
}