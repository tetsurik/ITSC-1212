/*
 * @author Tetsu Ri
 * @version 06/16/2019
 * 
 * Description: 
 * 		This program will generate characters and count the occurrences of each letter in an array.
 * 
 * 	
 * Pseudocode:
 * 		Start randomcharacter;
 * 		Import package 
 * 		Print Assignment ID
 		Create Main method
 			Print Assignment ID
 			Declare and create an array
 			Display the array
 			Count the occurrences of each letter
 			Display counts
 		Create a method for creating an array of characters
 			Declare an array of characters and create it
 			Create lowercase letters randomly and assign them to the array
 			Return the array
 		Create a method for displaying the array of characters	
 			Display the characters in the array 20 on each line
 		Create a method to count the occurrences of each letter	
 			Declare and create an array of 26 int
 			For each lowercase letter in the array, count it
 		Create a method for displaying counts		
 * 		End
 * 
 */
package randomcharacter;
public class CountLettersInArray {
		/** Main method */
		public static void main(String[] args) {
			
			// Print Assignment ID
			System.out.println(" ID003 ");
			
			// Declare and create an array
			char[] chars = createArray();

			// Display the array
			System.out.println("The lowercase letters are:");
			displayArray(chars);
			// Count the occurrences of each letter
			int[] counts = countLetters(chars);

			// Display counts
			System.out.println();
			System.out.println("The occurrences of each letter are:");
			displayCounts(counts);
		}

		/** Create an array of characters */
		public static char[] createArray() {
			// Declare an array of characters and create it
			char[] chars = new char[100];

			// Create lowercase letters randomly and assign them to the array
			for (int i = 0; i < chars.length; i++)
				chars[i] = RandomCharacter.getRandomLowerCaseLetter();

			// Return the array
			return chars;
		}

		/** Display the array of characters */
		public static void displayArray(char[] chars) {
			// Display the characters in the array 20 on each line
			for (int i = 0; i < chars.length; i++) {
				if ((i + 1) % 20 == 0)
					System.out.println(chars[i]);
				else
					System.out.print(chars[i] + " ");
			}
		}

		/** Count the occurrences of each letter */
		public static int[] countLetters(char[] chars) {
			// Declare and create an array of 26 int
			int[] counts = new int[26];

			// For each lowercase letter in the array, count it
			for (int i = 0; i < chars.length; i++)
				counts[chars[i] - 'a']++;

			return counts;
		}

		/** Display counts */
		public static void displayCounts(int[] counts) {
			for (int i = 0; i < counts.length; i++) {
				if ((i + 1) % 10 == 0)
					System.out.println(counts[i] + " " + (char)(i + 'a'));
				else
					System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
			}
		}
}