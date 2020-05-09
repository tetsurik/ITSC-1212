import java.util.Random;

public class Activity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random r = new Random();
		int Low = 1;
		int High = 1000;

		int numbers[] = new int[50];

			for(int i = 0; i < 50; i++)

				numbers[i] = r.nextInt(High-Low) + Low;

			System.out.println("The highest element in the array is " + getHighest(numbers));
			System.out.println("The highest element in the array is " + getLowest(numbers));
			System.out.println("The average of the array is " + getAverage(numbers));
			System.out.println("The number of elements in the array above the average value is " + getAboveAverage(numbers));
			System.out.println("The number of elements in the array below the average value is " + getBelowAverage(numbers));
			}

	private static int getBelowAverage(int[] numbers) {

		double avg = getAverage(numbers);
		int count = 0;
		for(int i = 0; i < 50; i++)
		if(numbers[i] < avg)
		count++;
		return count;
	}

	private static int getAboveAverage(int[] numbers) {

		double avg = getAverage(numbers);
		int count = 0;
		for(int i = 0; i < 50; i++)
		if(numbers[i] > avg)
		count++;
		return count;
	}

	private static double getAverage(int[] numbers) {

		double sum = 0;
		for(int i = 0; i < 50; i++)
		sum += numbers[i];
		return sum / numbers.length;
	}

	private static int getLowest(int[] numbers) {
		
		int number = numbers[0];
		for(int i = 1; i < 50; i++)
		if(numbers[i] < number)
		number = numbers[i];
		return number;
	}

	private static int getHighest(int[] numbers) {

		int number = numbers[0];
		for(int i = 1; i < 50; i++)
		if(numbers[i] > number)
		number = numbers[i];
		return number;

	}

	
}


