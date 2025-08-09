/*
 * Write a Java program to multiply two binary numbers.
 * Input Data:
 * Input a Decimal Number: 5
 * Expected Output
 * Binary number is: 101
 */

package basic_part_1;
import java.util.Scanner;
public class BinaryConverter {
    public static void main(String args[]) {
        // Declare variables to store decimal number, quotient, and an array for binary digits
        int dec_num, quot, i = 1, j;
        int bin_num[] = new int[100];
    
    // Create a Scanner object to read input from the user
    Scanner scan = new Scanner(System.in);
    
    // Prompt the user to input a decimal number
    System.out.print("Input a Decimal Number: ");
    dec_num = scan.nextInt();
    
    // Initialize the quotient with the decimal number
    quot = dec_num;
    
    // Convert the decimal number to binary and store binary digits
    while (quot != 0) {
        bin_num[i++] = quot % 2;
        quot = quot / 2;
    }
    }
}
