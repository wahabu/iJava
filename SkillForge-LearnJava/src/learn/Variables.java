package learn;

/**
 * This class is for practicing and understanding
 * how to declare and use different types of variables in Java.
 */
public class Variables {
    public static void main(String[] args) {
        // Age of the machine or its owner (in years)
        int year = 2025;

        // Weight of the machine (in kilograms)
        float weight = 22.7f;

        // Name of the person who owns the machine
        String machineOwnerName = "Hibo";

        // Model code or version of the machine (represented as a single character)
        char model = 'Z';

        // Indicates whether the machine is currently running (true = running, false = stopped)
        boolean isRun = false;

        // Print all variable values
        System.out.println(year + "\n" + weight + "\n" + machineOwnerName + "\n" + model + "\n" + isRun);
    }
}