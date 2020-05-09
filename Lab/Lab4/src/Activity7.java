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
public class Activity7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
		
		// Simulate dice roll
		int rollInt = (int) (Math.random()*((6-1+1)+1));
		
		System.out.println("You rolled a " + rollInt + "!");
		
		int rollInt1 = (int) (Math.random()*((6-1+1)+1));
		int rollInt2 = (int) (Math.random()*((6-1+1)+1));
		int rollInt3 = (int) (Math.random()*((6-1+1)+1));
		
		System.out.println("You rolled a: " + "\n" + rollInt1 + "\n" + rollInt2 + "\n" + rollInt3);
		
	}
}