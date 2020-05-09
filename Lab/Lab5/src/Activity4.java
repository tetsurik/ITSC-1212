import java.util.Scanner;// Import Scanner
public class Activity4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
		
		System.out.println("Enter a string to talk to the robot: ");
		String s1 = input.nextLine();
		
		while (!(s1.equals(""))) {
			int response = (int) (Math.random()*((5-1+1)+1));
			
			
			switch (response) {
			case 1: System.out.println("I am a robot");
			break;
			case 2:  System.out.println("Hello");
			break;
			case 3:  System.out.println("Yes I agree");
			break;
			case 4:  System.out.println("No I disagree");
			break;
			default:  System.out.println("Are you talking to me?");
			
			}
			
			System.out.println("Enter a string to talk to the robot: ");
			s1 = input.nextLine();
			
		}
		
		System.out.println("You did not input a string");
	}
}