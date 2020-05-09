
import java.util.Scanner;
public class Activity1 {
  public static void main(String[] args){
     Scanner scan = new Scanner(System.in);
     
     int choice = 0;
     
     while (choice != 6) {
     displayMenu();
     System.out.print("Enter your choice: ");
      choice = scan.nextInt();

     if(choice == 1){
       System.out.print("Enter two integers to add: ");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       System.out.println("Sum = " + add(num1, num2));
     }
     else if(choice == 2){
         System.out.print("Enter two integers to subtract: ");
         int num1 = scan.nextInt();
         int num2 = scan.nextInt();
         System.out.println("Answer = " + add(num1, num2));
      }
     else if(choice == 3){
         System.out.print("Enter two doubles to subtract: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Answer = " + subtractDoubles(num1, num2));
       }
     else if(choice == 4){
         System.out.print("Enter two doubles to multiply: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Answer = " + multiply(num1, num2));
       }
     else if(choice == 5){
         System.out.print("Enter two numbers to divide: ");
         double num1 = scan.nextDouble();
         double num2 = scan.nextDouble();
         System.out.println("Answer = " + divide(num1, num2));
       }
     else if(choice == 6){
    	 System.out.println("Goodbye!");
     }
     else {
    	 System.out.print("Invalid input. Please choose again!");
     }
     }

  }

  public static void displayMenu(){
    System.out.println("1. Add");
    System.out.println("2. Subtract");
    System.out.println("3. Subtract with doubles");
    System.out.println("4. Multiple");
    System.out.println("5. Divide");
    System.out.println("6. Quit");
 }

 public static int add(int a, int b){
    int sum = a + b;
    return sum;
 }

 public static int subtract(int a, int b){
    return a - b;
 }

 public static double subtractDoubles(double a, double b){
	 double ans = a-b;
	 return ans;

 }

 public static double multiply(double a, double b){
	 double ans = a*b;
	 return ans;

 }
 public static double divide(double a, double b){
	 double ans = a/b;
	 return ans;

 }
 public static String quit() {
	 String quit = "Goodbye!";
	 return quit;
 }

}