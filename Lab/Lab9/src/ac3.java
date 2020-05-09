public class ac3 {
	public static void main(String[] args) {
		int[][] num = new int [4][5];
		for (int row = 0; row < num.length; row++) {
			for (int column = 0; column < num[row].length; column++) {
			 num[row][column] = (int)(Math.random() * 1000 + 1);
			 }
			}
		print2DArray(num);
		System.out.println("The highest value is: " + getHighest(num));
		System.out.println("The lowest value is: " + getLowest(num));
		double avg = getAverage(num, 4 , 5);
		System.out.println("The average value is: " + avg);
		System.out.println("The number of values above average is: " + getAbove(num, avg));
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
		 int high = 0;
		 for (int row = 0; row < num.length; row++) {
				for (int column = 0; column < num[row].length; column++) {
				 if(high < num[row][column]){
					 high = num[row][column];
				 }
				 }
				}
		 return high;
	 }
	 public static int getLowest(int[][] num){
		 int low = 1001;
		 for (int row = 0; row < num.length; row++) {
				for (int column = 0; column < num[row].length; column++) {
				 if(low > num[row][column]){
					 low = num[row][column];
				 }
				 }
				}
		 return low;
	 }
	 public static double getAverage(int[][] num, int row, int column){
		 int sum = 0;
		 double avg =0;
		 for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
				 sum += num[i][j];
				 }
				}
		 avg =(double) (sum/(row*column));
		 return avg;
	 }
	 public static int getAbove(int[][] num, double avg){
		 int count = 0;
		 for (int i = 0; i < num.length; i++) {
				for (int j = 0; j < num[i].length; j++) {
				 if(num[i][j] > avg){
					 count ++;
				 }
				 }
				}
		 return count;
	 }
}