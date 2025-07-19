/*

 */
package basic_part_1;

import java.util.Scanner;

public class MultiplicaionTable {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
   
        // Prompt the user to input the first number
        System.out.print("Input a number: ");
        // Read and store the first number
        int x = in.nextInt();
        
        for (int i = 1; i <=10; i++) {
        // Calculate the product of the two numbers and display the result
            System.out.println(x + " x " + i + " = " + x * (i));
//        System.out.println(x + " x " + 2 + " = " + x * 2);
//        System.out.println(x + " x " + 3 + " = " + x * 3);
        }
    }
}
