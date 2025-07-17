/* Write a Java program that takes two numbers as input and displays the product of two numbers.
 * Test Data:
 * Input first number: 25
 * Input second number: 5
 * Expected Output:
 * 25 X 5 = 125
*/
//import java.util.Scanner;
package basic_part_1;

public class ProductOfTwoNumbers {
       // main method begins execution of Java application
       public static void main(String[] args) {
          // create a Scanner to obtain input from the command window
          Scanner input = new Scanner(System.in);

         System.out.print("Enter first integer: "); // prompt
         int number1 = input.nextInt(); // read first number from user

         System.out.print("Enter second integer: "); // prompt
         int number2 = input.nextInt(); // read second number from user

         int sum = number1 + number2; // add numbers, then store total in sum

         System.out.printf("Sum is %d%n", sum); // display sum
      } // end method main
   } // end class Addition
