import java.util.*;

public class Activity1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int[] myList = new int[10];
		
		int i;
		for (i = 0; i < 10; i++) {
			System.out.print("Enter the value for index position " + i + ".\n");
			myList[i] = input.nextInt();
		}
		
		int position = 0;
		while (position != -1) {
			System.out.println("Enter an index position to display element. Enter -1 to exit: \n");
			position = input.nextInt();
			if (position == -1) {
				break;
			}
			else if (position >= 0 && position <= 9) {
				System.out.println("The value at index postion " + position + " is " + myList[position]);
			}
			else {
				System.out.println("The entered position is out of bounds");
			}
		}

		System.out.println("You have exited the program.");
		
	}
}