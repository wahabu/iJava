package vehicles; // Same package as Main.java

public class Car { 
    int year = 2014;
    
    public static void main(String[] args) { // Main method - starting point when you run Car.java
        Car myCar = new Car();   // Object creation — 'myCar' is an instance of class 'Car'
        myCar.color();                  // Method call — calls the 'color()' method on the object
        myCar.lifeTime();              // Method call — calls the 'lifeTime()' method
    }
    
    void color() { // Method - prints the car's color
        System.out.println("Blue");
    }
    
    void lifeTime() { // Method - prints car lifespan info
        System.out.println("Ten Years later");
    }
}
