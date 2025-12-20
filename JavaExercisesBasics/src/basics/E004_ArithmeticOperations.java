/* Write a Java program to print the results of the following operaions. 
 * Test Data:
 * a. -5 + 8 * 6 >> 43
 * b. (55+9) % 9 >> 1
 * c. 20 + -3*5 /8 >> 19
 * d. 5 + 15 / 3 * 2 - 8 % 3 >> 13
*/

package basics;

public class E004_ArithmeticOperations {
    public static void main(String[] args) {
    
        int a = -5 + 8 * 6;
        int b = (55+9) % 9;
        int c = 20 + -3*5 / 8;
        int d = 5 + 15 / 3 * 2 - 8 % 3;
    
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
