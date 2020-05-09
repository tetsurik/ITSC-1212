import java.util.Random;
import java.util.Scanner;

public class ArrayOperations {

   public static void main(String[] args) {
       int size, choice;
       /*
       * Creating an Scanner class object which is used to get the inputs
       * entered by the user
       */
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the size of the array :");
       size = sc.nextInt();

       int arr[] = new int[size];

       fillArray(arr);
       while (true) {
           System.out.println("\nMenu:");

           System.out.println("\t1. Search Array");

           System.out.println("\t2. Sort Array");

           System.out.println("\t3. Shuffle Array");

           System.out.println("\t4. Re-Initialize Array");

           System.out.println("\t5. Analyze Array");

           System.out.println("\t6. Display Array");

           System.out.println("\t7. Quit");

           System.out.print("Enter Choice :");
           choice = sc.nextInt();

           switch (choice) {
           case 1: {
               System.out.print("Enter a parameter: ");
               int searchNum = sc.nextInt();
               int indx = search(arr, searchNum);

               System.out.println("Found at:" + indx);

               continue;
           }
           case 2: {
               System.out.println("Sorting array…");
               sort(arr);
               display(arr);
               continue;
           }
           case 3: {
               System.out.println("Suffling the array ....");
               shuffle(arr);
               display(arr);
               continue;
           }
           case 4: {
               System.out.print("Enter the size of the array :");
               size = sc.nextInt();

               arr = new int[size];
               fillArray(arr);
               continue;
           }
           case 5: {
               analyze(arr);

               continue;
           }
           case 6: {
               display(arr);
               continue;
           }
           case 7: {
               break;
           }
           default: {
               System.out.println("** Invalid Choice **");
               continue;
           }

           }
           break;
       }

   }

   private static void display(int[] arr) {
       System.out.println("Displaying the array ....");

       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }

   }

   private static void analyze(int[] arr) {
       int cntPos = 0, cntNeg = 0, cntPosPrime = 0;

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] > 0) {
               cntPos++;
           }
           if (arr[i] < 0) {
               cntNeg++;
           }
           if (isPrime(arr[i]))
               cntPosPrime++;
       }

       System.out.println("Total Positive Numbers in Array :" + cntPos);

       System.out.println("Total Negative Numbers in Array :" + cntNeg);

       System.out.println("Total Positive Prime Numbers in Array :"
               + cntPosPrime);

   }

   // This method will check whether the number is prime or not
   private static boolean isPrime(int n) {
       // If the user entered number is '2' return true
       if (n == 2)
           return true;
       for (int i = 2; i * i <= n; i++) {
           if (n % i == 0)
               return false;
       }
       return true;
   }

   private static void shuffle(int[] arr) {
       int temp;
       int n = arr.length;
       for (int i = 0; i < n; i++) {
           int r = i + (int) (Math.random() * (n - i));
           temp = arr[r];
           arr[r] = arr[i];
           arr[i] = temp;
       }

   }

   private static void sort(int[] array) {
       // This Logic will Sort the Array of elements in Ascending order
       int temp;
       for (int i = 0; i < array.length; i++) {
           for (int j = i + 1; j < array.length; j++) {
               if (array[i] > array[j]) {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
       }

   }

   private static int search(int[] main, int searchNum) {
	   
   	// Initialize variables for binary search
   	int resultIndex = -1;
       int first = 0;
       int last = main.length - 1;
       int middle = (first + last) / 2;
       
       // Create loop to find ID. Eliminate half of the list upon each iteration
       while (first <= last) {
           if (main[middle] < searchNum) {
               first = middle + 1;
           } else if (main[middle] == searchNum) {
               resultIndex = middle;
               break;
           } else {
               last = middle - 1;
           }
           middle = (first + last) / 2;
       }
       if (first > last)
           resultIndex = -1;
       
       // If found, return index. If not, return -1
       return resultIndex;
   }

   private static void fillArray(int[] arr) {
       // Creating a random Class object
       Random r = new Random();
       for (int i = 0; i < arr.length; i++) {
           arr[i] = r.nextInt((200) + 1) - 100;
       }

   }

}