/**
* @author: <Your Name>
* @date: <Date>
* @description: Activity 8.2
* 
*/
import java.util.Scanner;
public class Act8_2 {
static String[] shoppingList ;


public static void main(String[] args) {
Scanner sc = new Scanner (System.in);
shoppingList = new String[5];


for (int i = 0; i<shoppingList.length;i++){
System.out.print("Input an item to your shopping list: ");
shoppingList[i]=sc.next();
}


for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" ");

}
System.out.println();

// part B

for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i].length()+" ");

}
System.out.println();




shoppingList[0]="shampoo"; 

System.out.println("Making a new variable with same name:");
String [] shoppingList= {"chips","coke","milk","cheese","notebook"};


int i=0;
for (i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" ");
}
System.out.println("\n array length is "+i);




myMethod();


}


public static void myMethod() {
for (int i =0; i<shoppingList.length;i++){
System.out.print(shoppingList[i]+" "); 
}
}


}