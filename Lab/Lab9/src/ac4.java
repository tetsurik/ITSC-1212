import java.util.Scanner;
public class ac4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many student you are going to build:");
		int row = sc.nextInt();
		int[][] num = new int[row][4];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				if(j == 0){
					System.out.println("Enter the student Id: ");
					num[i][j] = sc.nextInt();
				}
				else if(j == 1){
					System.out.println("Enter the 1st grade: ");
					num[i][j] = sc.nextInt();
				}
				else if(j == 2){
					System.out.println("Enter the 2nd grade: ");
					num[i][j] = sc.nextInt();
				}
				else if(j == 3){
					System.out.println("Enter the 3rd grade: ");
					num[i][j] = sc.nextInt();
				}
			 }
			}
		print2DArray(num);
		System.out.println("The highest grade with student ID is: " + getHighest(num));
	}
	 public static void print2DArray(int[][] array){
	        for(int row = 0; row < array.length; row++){
	            for(int column = 0; column < array[row].length; column++){
	                // Part G
	                System.out.print(array[row][column] + "\t");
	            }
	            // Part H
	            System.out.println();
	        }
	    }
	 public static int getHighest(int[][] num){
		 int high = 0,hiId =0;
		 for (int row = 0; row < num.length; row++) {
				for (int column = 1; column < num[row].length; column++) {
				 if(high < num[row][column]){
					 high = num[row][column];
					 hiId = row;
				 }
				 }
				}
		 System.out.println("The student who gor highest grade is: " + num[hiId][0]);
		 return high;
	 }
}
