/**
 * HelloApp.java
 * A simple Java application that greets the user by name if provided,
 * or defaults to "World" if no name is given.
 *
 * UC1: Display "Hello World"
 * UC2: Display User Name
 * UC3: Provide Default Value
 *
 * Usage: java HelloApp [name]
 * If a name is provided → "Hello, [Name]!"
 * If no name → "Hello, World!"
 *
 * @author Mohan
 * @version 3.0
 * @since UC1
 */

public class HelloApp {

    public static void main(String[] args) {

        // Default value
        String name = "World";

        // Check if argument is provided
        if (args.length > 0) {
            name = args[0];
        }

        // Print greeting
        System.out.println("Hello, " + name + "!");
    }
}