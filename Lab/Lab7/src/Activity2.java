
import java.util.Scanner;
public class Activity2 {
  public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     	
     System.out.println("Please enter your bill: ");
     double bill = input.nextDouble();
     
     displayPrompt();

     calculateDiscount(bill);
     
     System.out.println("Your discounted price is: " + calculateFinalPrice(bill, calculateDiscount(bill)));
     
     
  }
  public static void displayPrompt(){
			    System.out.println("Thank you for celebrating our third year of operation with us!" + "\n" + 
						"We have are doing a special tonight; flip a coin and get 20% off with heads" + "\n" 
						+ "and 25% off with tails! \n\n *flip coin*");
  }
		 
		 
  public static double calculateDiscount(double a){
    	
    	 double discountPercentage = 0;
    	 
    	 int num = (Math.random() <= 0.5) ? 1 : 2; // Generate a random integer between 1 and 2
			
			if (num == 1) { // Display result for num = 1
			discountPercentage = .20;
			
			}
				
			
			else { // Display result for num = 2
				discountPercentage = .25;
				
			}
			
    	 
    	 double discount = a * discountPercentage;
    	 return discount;

     }
     public static double calculateFinalPrice(double a, double b){
    	 double ans = a-b;
    	 return ans;

     }
     

}