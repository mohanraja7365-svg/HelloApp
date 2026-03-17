/**
 * HelloApp.java
 * UC5: Display "Hello" with multiple command-line arguments
 * If names are provided → Hello, name1, name2, ...
 * If no names → Hello, World!
 */

public class HelloApp {

    public static void main(String[] args) {

        // If no arguments → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Build names using StringBuilder
        StringBuilder nameBuilder = new StringBuilder();
        boolean first = true;

        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Print final output
        System.out.println("Hello, " + nameBuilder.toString() + "!");
    }
}