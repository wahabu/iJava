/*
 * Write a Java program to convert a binary number to a hexadecimal number.
 * Input Data:
 * Input a decimal number: 1101
 * Expected Output

 * HexaDecimal value: D
 */
package basic_part_1;
import java.util.Scanner;

public class BinaryHexadecimalConverter {
    public static void main(String[] args) {
        // Declare an array to store hexadecimal digits, variables for calculation, and binary binary input
        int[] hex = new int[1000];
        int i = 1, j = 0, rem, dec = 0, bin;
        
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);
        
        // Prompt the user to input a binary number
        System.out.print("Input a Binary Number: ");
        bin = in.nextInt();
        
        // Convert the binary number to decimal
        while (bin > 0) {
            rem = bin % 2;
            dec = dec + rem * i;
            i = i * 2;
            bin = bin / 10;
        }
        i = 0;
        
        // Convert the decimal number to hexadecimal
        while (dec != 0) {
            hex[i] = dec  16;
            dec = dec / 16;
            i++;
        }
    }
}
