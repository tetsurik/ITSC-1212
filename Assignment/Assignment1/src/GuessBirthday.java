/*
 * @author Tetsu Ri
 * @version 06/04/2019
 * 
 * Description:
 * 		This program will find out the date of the month when your friend was born by asking 
 * 		five questions. Each question asks whether the day is in one of the five sets of 
 * 		numbers.
 * 		
 * 
 * Pseudocode:
 * 		Start
 * 		Create String sets 1-5
 * 		Create variable day and assign to 0
 * 		Prompt the user to answer if the day is in set 1
 * 		Assign input to change day accordingly
 * 		Prompt the user to answer if the day is in set 2
 * 		Assign input to change day accordingly
 * 		Prompt the user to answer if the day is in set 3
 * 		Assign input to change day accordingly
 *		Prompt the user to answer if the day is in set 4
 * 		Assign input to change day accordingly
 * 		Prompt the user to answer if the day is in set 5
 * 		Assign input to change day accordingly
 * 		Display Result
 * 
 * 
 * 
  */
import java.util.Scanner;// Import Scanner

 public class GuessBirthday { 
	 
	 public static void main(String[] args) {
		 
		 // Print Assignment ID
		 System.out.println("ID001");
		 
		 String set1 = 
				 " 1 3 5 7\n" + 
				 " 9 11 13 15\n" + 
				 "17 19 21 23\n" + 
				 "25 27 29 31";
		 
		 String set2 =		 
				 " 2 3 6 7\n" +
				 "10 11 14 15\n" +
				 "18 19 22 23\n" +
				 "26 27 30 31";
 
		 String set3 =
				 " 4 5 6 7\n" +
				 "12 13 14 15\n" +
				 "20 21 22 23\n" +
				 "28 29 30 31";
		 
		 String set4 =
				 " 8 9 10 11\n" +
				 "12 13 14 15\n" +
				 "24 25 26 27\n" +
				 "28 29 30 31";
 
		 String set5 =
				 "16 17 18 19\n" +
				 "20 21 22 23\n" +
				 "24 25 26 27\n" +
				 "28 29 30 31";
 
		 int day = 0 ;
 
		 // Create a Scanner
		 Scanner input = new Scanner(System.in);

		 // Prompt the user to answer questions
		 System.out.print("Is your birthday in Set1?\n");
		 System.out.print(set1);
		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 int answer = input.nextInt();
 
		 if (answer == 1)
			 day += 1;
 
		 // Prompt the user to answer questions
		 System.out.print("\nIs your birthday in Set2?\n");
		 System.out.print(set2);
		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 answer = input.nextInt();
 
		 if (answer == 1)
			 day += 2;
	 
		 // Prompt the user to answer questions
		 System.out.print("Is your birthday in Set3?\n");
		 System.out.print(set3);
		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 answer = input.nextInt();

		 if (answer == 1)
			 day += 4;
 
		 // Prompt the user to answer questions
		 System.out.print("\nIs your birthday in Set4?\n");
		 System.out.print(set4);
		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 answer = input.nextInt();
 
		 if (answer ==1)
			 day += 8;
 
		 // Prompt the user to answer questions
		 System.out.print("\nIs your birthday in Set5?\n");
		 System.out.print(set5);
		 System.out.print("\nEnter 0 for No and 1 for Yes: ");
		 answer = input.nextInt();
 
		 if (answer == 1)
			 day += 16;
		 
		 // Display Result
		 System.out.println("\nYour birthday is " + day + "!");  
	 
 }
	 }