/*
 * Write a Java program to multiply two binary numbers.
 * Input Data:
 * Input the first binary number: 10
 * Input the second binary number: 11
 * Expected Output
 * Product of two binary numbers: 110
 */

package basic_part_1;
import java.util.Scanner;



public class BinaryMultiplication {
    public static void main(String[] args) {
        // Declare variables to store two binary numbers and the product
        long binary1, binary2, multiply = 0;
        
        // Initialize digit and factor variable for processing binary2
        int digit, factor = 1;
        
        // Creater a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input the first binary number
        System.out.print("Input the first binary number: ");
        binary1 = in.nextLong();
        
        // Prompt the user to input the second binary number
        System.out.print("Input the second binary number: ");
        binary2 = in.nextLong();
        
        // Process binary2 to calculate the product
        while (binary2 != 0) {
            digit = (int)(binary2 % 10);
            if (digit == 1) {
                binary1 = binary1 * factor;
                multiply = binaryproduct((int) binary1, (int) multiply);
            } else {
                binary1 = binary1 * factor;
            }
            binary2 = binary2 / 10;
            factor = 10;
        }
    }
}
