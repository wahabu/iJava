public class IdentifierExamples {

    // ✅ Valid identifier: Class name starts with uppercase letter
    public static void main(String[] args) {

        // ✅ Valid identifier: variable name starts with a lowercase letter
        int age = 30;

        // ✅ Valid identifier: contains a number (not at the beginning)
        String name1 = "Ali";

        // ✅ Valid identifier: contains a dollar sign
        double total$Amount = 99.99;

        // ✅ Valid identifier: starts with an underscore
        boolean _isActive = true;

        // ❌ Invalid identifier: cannot start with a digit
        // int 2ndPlace = 2; // ← This will cause a compilation error

        // ❌ Invalid identifier: 'if' is a reserved keyword
        // int if = 5; // ← This will also cause a compilation error

        // ✅ Valid identifier: method name
        greetUser(name1);
        
        // Package is usually declared at the top of the file
        // Example: package com.example.utils;
        
        // Create object to access non-static method
        IdentifierExamples obj = new IdentifierExamples();
        obj.greetUser();

        // Print constant
        System.out.println("PI value is: " + PI);
    }

    // ✅ Valid identifier: method name
    public static void greetUser(String userName) {
        System.out.println("Welcome, " + userName + "!");
    }
}
