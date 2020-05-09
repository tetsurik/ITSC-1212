import java.util.Scanner;
public class ac5 {
    public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("How many rows you want to build:");
		int row = sc.nextInt();
		System.out.println("How many columns you want to build:");
		int column = sc.nextInt();
		int[][][] num = new int[row][column][3];
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				num[i][j][2] = (int)(Math.random() * 255 + 1);
			 }
			}
		ImageBuilder imageBuilder = new ImageBuilder(num, 10);
		imageBuilder.show();
	}
}   