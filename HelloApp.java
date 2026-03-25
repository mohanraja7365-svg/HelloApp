/**
 * HelloApp.java
 * UC6: Display  "Hello" with Multiple Command-Line Arguments
 **/

public class HelloApp {
    public static void main(String[] args) {

        String name;

        if (args.length > 0) {
            // Use StringBuilder to efficiently concatenate names
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop: iterate over each argument
            for (String arg : args) {
                nameBuilder.append(arg).append(", ");
            }

            // Remove the trailing ", " using substring
            name = nameBuilder.substring(0, nameBuilder.length() - 2);

        } else {
            // Default to "World" if no arguments are provided
            name = "World";
        }

        System.out.println("Hello, " + name + "!");
    }
}
