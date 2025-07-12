// ✅ Class name is an identifier
public class IdentifierExamples {

    // ✅ Constant (final variable): cannot be changed after assignment
    public static final double PI = 3.14159;

    // ✅ Instance variable (non-static): stores data that can be changed per object
    int age = 25;

    // ✅ Method: reusable block of code
    public void greetUser() {
        System.out.println("Hello from greetUser!");
    }

    // ✅ Nested class: another identifier
    public class Car {
        int speed; // Variable inside the nested class
    }

    // ✅ Interface: contract that a class can implement
    interface Drawable {
        void draw(); // Method inside an interface
    }

    // ✅ Entry point of the program
    public static void main(String[] args) {

        // ✅ Variable identifier: starts with a lowercase letter
        int userAge = 30;

        // ✅ Valid identifier: contains a number (not at the beginning)
        String name1 = "Ali";

        // ✅ Valid identifier: contains a dollar sign
        double total$Amount = 99.99;

        // ✅ Valid identifier: starts with an underscore
        boolean _isActive = true;

        // ❌ Invalid identifier: cannot start with a digit
        // int 2ndPlace = 2;

        // ❌ Invalid identifier: 'if' is a reserved keyword
        // int if = 5;

        // ✅ Valid identifier: method name
        greetUser(name1);

        // ✅ Accessing instance method using object
        IdentifierExamples obj = new IdentifierExamples();
        obj.greetUser();

        // ✅ Printing a constant
        System.out.println("PI value is: " + PI);
    }

    // ✅ Another method (static): shows method as identifier
    public static void greetUser(String userName) {
        System.out.println("Welcome, " + userName + "!");
    }
}
