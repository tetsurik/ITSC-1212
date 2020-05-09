import java.util.Scanner; // Scanner was not imported


public class Activity7 {
	
public static void main(String[] args){
	
int numPets1;

int numPets2; // Corrected double to int

int total; // Forgot to end line with semicolon
Scanner scan = new Scanner(System.in); // Scanner scan corrected to Scanner input

System.out.println("How many pets do you own?");
numPets1 = scan.nextInt();

System.out.print("How many pets does your partner own?");
numPets2 = scan.nextInt();

total = numPets1 + numPets2; // Space in between numPets and 1

System.out.println("Together, you both have " + total + " pets"); //Added a space after have
}
}
