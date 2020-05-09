import java.util.Scanner;

public class Activity4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] grades = new int[4][5];
        
        for(int i = 0; i < grades.length; ++i) {
        	
            System.out.println("Enter student " + (i+1) + " details");
            
            System.out.print("Id: ");
            grades[i][0] = input.nextInt();
            
            System.out.print("Lab1 grade: ");
            grades[i][1] = input.nextInt();
            
            System.out.print("Lab2 grade: ");
            grades[i][2] = input.nextInt();
            
            System.out.print("Lab3 grade: ");
            grades[i][3] = input.nextInt();
            
        }
        // Display results
        for(int i = 0; i < grades.length; ++i) {
            System.out.printf("Student Id: %d, Lab1: %d, Lab2: %d, Lab3: %d\n", grades[i][0], grades[i][1], grades[i][2], grades[i][3]);
        }
        System.out.print("\nThe highest grade is " + getHighest(grades));
        
    }
    public static int getHighest(int[][] numbers) {
    	
        int maxValue = numbers[0][0];
        
        for (int j = 1; j < numbers.length; j++) {
        	
            for (int i = 1; i < numbers.length; i++) {
            	
                if (numbers[j][i] > maxValue) {
                    maxValue = numbers[j][i];
                }
            }
        }
        return maxValue;
    }
    }


