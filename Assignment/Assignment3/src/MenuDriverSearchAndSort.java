import java.util.Random;
import java.util.Scanner;

public class MenuDriverSearchAndSort {

   public static void main(String[] args) {
	   
	   Scanner input = new Scanner(System.in);
	   
       String[] bookTitles = { "Starting out with Java", "Java Programming",
               "Software Structures", "Design and Analysis of Algorithms",
               "Computer Graphics",
               "Artificial Intelligence: A Modern Approach",
               "Probability and Statistics", "Cognitive Science",
               "Modern Information Retrieval",
               "Speech and Language Processing" };
       
       int[] bookIDs = { 1101, 1211, 1333, 1456, 1567, 1642, 1699, 1755, 1800,
               1999 };
       
       double[] bookPrices = { 112.32, 73.25, 54.00, 67.32, 135.00, 173.22,
               120.00, 42.25, 32.11, 123.75 };

       int choice;
      
       int bookId, bookCount, resultIndex;           
       double startTime, executionTime;
       Random random;
       
       int[] sort = new int[1000];

       do {
    	   
           System.out.println("\n 1. Linear Search \n 2. Binary Search \n 3. Bubble Sort \n 4. Selection Sort \n 5. Quit"
           		+ "\n\n   Please enter number between 1-5: ");

           choice = input.nextInt();
    
           switch (choice) {
           
           case 1:
               display(bookTitles, bookIDs, bookPrices);
               System.out.println("\n *** LINEAR SEARCH ***");
               System.out
                       .print("Please enter the book ID you wish to purchase from the list above: ");
               bookId = input.nextInt();
               System.out.println("\n");
               System.out.print("How many books do you wish to purchase: ");
               bookCount = input.nextInt();
                  
               startTime = System.currentTimeMillis();
               resultIndex = linearSearch(bookIDs, bookId);
               executionTime = System.currentTimeMillis() - startTime;
               if(resultIndex !=-1){
                   System.out.println("\nBook ID: " + bookIDs[resultIndex]);
                   System.out.println("Book Title: " + bookTitles[resultIndex]);
                   System.out.println("Book Count: " + bookCount);
                   System.out.println("Total Cost: " + (bookCount * bookPrices[resultIndex]) +" $");
                   System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
               } else {
                   System.out.println("Book ID not found. Please enter a valid Book Id");
               }
               break;
           case 2:
               display(bookTitles, bookIDs, bookPrices);
               System.out.println("\n *** BINARY SEARCH ***");
               System.out
                       .print("Please enter the book ID you wish to purchase from the list above: ");
               bookId = input.nextInt();
               System.out.println("\n");
               System.out.print("How many books do you wish to purchase: ");
               bookCount = input.nextInt();
              
               startTime = System.currentTimeMillis();
               resultIndex = binarySearch(bookIDs, bookId);
               executionTime = System.currentTimeMillis() - startTime;
               if(resultIndex !=-1){
                   System.out.println("\nBook ID: " + bookIDs[resultIndex]);
                   System.out.println("Book Title: " + bookTitles[resultIndex]);
                   System.out.println("Book Count: " + bookCount);
                   System.out.println("Total Cost: " + (bookCount * bookPrices[resultIndex]) +" $");
                   System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
               } else {
                   System.out.println("Book ID not found. Please enter a valid Book Id");
               }
               break;
           case 3:
               System.out.println("\n *** BUBBLE SORT ***");
               random = new Random();
               for(int i=0; i<1000; i++){
                   sort[i] = random.nextInt(500);
               }
               System.out.println("The unsorted array is: ");
               for(int i=0; i<1000; i++){
                   System.out.print(sort[i] + " ");
               }
              
               startTime = System.currentTimeMillis();
               sort = bubbleSort(sort);
               executionTime = System.currentTimeMillis() - startTime;
          
               System.out.println("Sorted array is: ");
               for(int i=0; i<1000; i++){
                   System.out.print(sort[i] + " ");
               }
              
               System.out.println("\n\n Execution of this function took " + executionTime + " milliseconds");
               break;
           case 4:
               System.out.println("\n *** SELECTION SORT ***");
               random = new Random();
               for(int i=0; i<1000; i++){
                   sort[i] = random.nextInt(500);
               }
               System.out.println("The unsorted array is: ");
               for(int i=0; i<1000; i++){
                   System.out.print(sort[i] + " ");
               }
              
               startTime = System.currentTimeMillis();
               sort = selectionSort(sort);
               executionTime = System.currentTimeMillis() - startTime;
          
               System.out.println("Sorted array is: ");
               for(int i=0; i<1000; i++){
                   System.out.print(sort[i] + " ");
               }
              
               System.out.println("\n\n Execution of this function took " + executionTime + " seconds");
               break;
           }
       } while (choice != 5);
       input.close();
   }

   static void display(String[] bookTitle, int[] bookID, double[] bookPrice) {
       System.out.println("Book ID Title Cost");
       int maxTitleLength = 50;
       for (int i = 0; i < bookTitle.length; i++) {
           System.out.print(bookID[i] + " " + bookTitle[i]);
           int spaces = maxTitleLength - bookTitle[i].length();
           for (int k = 0; k < spaces; k++) {
               System.out.print(" ");
           }
           System.out.println(bookPrice[i]);
       }
   }

   static int linearSearch(int[] bookIDs, int bookId) {
       int resultIndex = -1;
       for (int i = 0; i < bookIDs.length; i++) {
           if (bookIDs[i] == bookId) {
               resultIndex = i;
           }
       }
       return resultIndex;
   }

   static int binarySearch(int[] bookIDs, int bookId) {
       int resultIndex = -1;
       int first = 0;
       int last = bookIDs.length - 1;
       int middle = (first + last) / 2;

       while (first <= last) {
           if (bookIDs[middle] < bookId) {
               first = middle + 1;
           } else if (bookIDs[middle] == bookId) {
               resultIndex = middle;
               break;
           } else {
               last = middle - 1;
           }
           middle = (first + last) / 2;
       }
       if (first > last)
           resultIndex = -1;
       return resultIndex;
   }
  
   static int[] bubbleSort(int[] arr) {
       for (int i = arr.length - 1; i >= 0; i--){
   // bubble up
   for (int j = 0; j <= i - 1; j++)   {
   if (arr[j] > arr[j + 1])
   swap(arr, j, j + 1);
   }
       }
       return arr;
   }
  
   static int[] selectionSort(int[] arr) {
       for (int i = 0; i < arr.length - 1; i++) {
   int min = i; // record the position of the smallest
   for (int j = i + 1; j < arr.length; j++) {
   // update min when finding a smaller element
   if (arr[j] < arr[min])
   min = j;
   }
   // put the smallest element at position i
   swap(arr, i, min);
   }
       return arr;
   }
  
   public static void swap (int[] arr, int i, int j) {
   int temp = arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
   }
  
}