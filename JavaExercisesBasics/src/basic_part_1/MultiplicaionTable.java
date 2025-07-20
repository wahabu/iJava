/* Write a Java program that takes a number as input and prints its multiplication table up to 10.
 * Test Data:
 * Input a number: 8
 * Expected Output:
 * 8 X 1 = 8
 * 8 X 2 = 16
 * ...
 * 8 X 10 = 80
 */

package basic_part_1;

import java.util.Scanner;

public class MultiplicaionTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
   
        // Prompt the user to input a number
        System.out.print("Input a number: ");
        
        // Read and store the input number
        int x = in.nextInt();
        
        for (int i = 1; i <=10; i++) {
            // Calculate and print the result of x multiplied by (i+1)
            System.out.println(x + " x " + i + " = " + x * (i));
        }
    }
}
