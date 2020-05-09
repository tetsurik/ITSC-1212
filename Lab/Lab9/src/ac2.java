import java.util.Scanner;
public class ac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many rows you want to build:");
		int row = sc.nextInt();
		System.out.println("How many columns you want to build:");
		int column = sc.nextInt();
		int[][] num = new int[row][column];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println("Enter the value: ");
				num[i][j] = sc.nextInt();
			 }
			}
		print2DArray(num);
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
}
