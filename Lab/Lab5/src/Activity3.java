import java.util.Scanner;// Import Scanner
public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		// Create new Scanner
		Scanner input = new Scanner(System.in);
	// TODO Auto-generated method stub
		
		System.out.println("Please enter a positive integer "
				+ "that is not divisible by 10: ");
		int i = input.nextInt();
		
		while ((i < 0) || ((i % 10) == 0)){
			System.out.println("Please enter a positive"
					+ " integer that is not divisible by 10: ");
			i = input.nextInt();
			}
		System.out.println("Wise choice.");

	}

}
