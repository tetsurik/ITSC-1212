
public class ac1 {
	public static void main(String[] args) {
		int[][] num = new int [4][5];
		for (int row = 0; row < num.length; row++) {
			for (int column = 0; column < num[row].length; column++) {
			 num[row][column] = (int)(Math.random() * 10 + 1);;
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
