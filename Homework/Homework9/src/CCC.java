import java.util.Scanner;
import java.util.*;

public class CCC
{  
   public static void choice1()
   {
   Scanner sc=new Scanner(System.in);
   Random rand = new Random();
   int computer, user;

   while (true)
   {
      System.out.println("\nPick a number(0-51): ");
       user = sc.nextInt();

       if(user < 0 || user > 51)
           System.out.println("Invalid Input");
       else
           break;

   }
     
      while (true)
      {
          computer = rand.nextInt(51);
          if(computer != user)
              break;
      }

      if(computer > user)
      {
          System.out.println("Computers card was highest");
      }
      else
      {
          System.out.println("Users card was highest");
      }
   }

   public static void choice2()
   {
       Random rand = new Random();
   int computer1;
   int computer2;
   int countcomputer1 = 0;
   int countcomputer2 = 0;
   int count = 0;
   while (count < 100)
   {
      computer1 = rand.nextInt(51);
      computer2 = rand.nextInt(51);
      while(computer2 == computer1)
      {
          computer2 = rand.nextInt(51);
      }
      if (computer1 > computer2)
      {
          countcomputer1++;  
      }
      else
          countcomputer2++;

      count++;
   }

   System.out.println("Computer1: " + countcomputer1);
   System.out.println("Computer2: " + countcomputer2);
      if(countcomputer1 > countcomputer2)
      {
          System.out.println("Computer1 won");
      }
      else if(countcomputer2 > countcomputer1)
      {
          System.out.println("Computer2 won");
      }
       else
       {
           System.out.println("Draw");
       }
   }


   public static void main(String[] args)
   {


       Scanner sc=new Scanner(System.in);
       int choice;

       while(true)
       {
           System.out.println("\n1. Part1\n2. Part2\n3. exit");
           System.out.println("Enter choice ");
           choice = sc.nextInt();
           if(choice == 1)
               choice1();

           else if (choice == 2)
               choice2();

           else
               break;
       }
   }
}