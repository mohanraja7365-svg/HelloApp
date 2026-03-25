/**
 * HelloApp.java
 * UC7: Display  "Hello" with Multiple Command-Line Arguments
 **/

public class HelloApp {
    public static void main(String[] args) {

        String names = "World";

        if (args.length > 0) {
            names = String.join(", ", args);
        }

        System.out.println("Hello, " + names + "!");
    }
}