/**
 * HelloApp.java
 * A simple Java application that:
 * UC1: Displays "Hello World"
 * UC2: Displays user name from command-line argument
 */

public class HelloApp {

    public static void main(String[] args) {

        // Check if user provided a name
        if (args.length > 0) {
            String name = args[0];
            System.out.println("Hello, " + name + "!");
        } else {
            System.out.println("Hello World");
        }

    }
}