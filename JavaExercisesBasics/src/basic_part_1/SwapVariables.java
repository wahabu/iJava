/*
 * Write a Java program to swap two variables.
 * 
 */
package basic_part_1;


public class SwapVariables {
    public static void main(String[] args) {
        // Declare variables for the values to be swapped
        int a, b, temp;
        
        // Assign values to variables a and b
        a = 15;
        b = 27;
        
        // Print the values before swapping
        System.out.println("Before swapping : a, b = " + a + ", " + b);
        
        // Perform the swap using a temporary variable
        temp = a;
        a = b;
        b = temp;
        
        // Print the values after swapping
        System.out.println("After swapping : a, b = " + a + ", " + b);
    }
}
