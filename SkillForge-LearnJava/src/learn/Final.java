package learn;

/**
 * This class shows how to use 'final' with variables.
 * Once a final variable is assigned, its value cannot be changed.
 */
public class Final {
    public static void main(String[] args) {
        final int year = 2015; // constant: manufacturing year

        System.out.println("Manufacturing Year: " + year);

        // Trying to change the value will cause a compile-time error:
        // year = 2024; // ❌ Error: cannot assign a value to final variable 'year'
    }
}
