import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        // Create a Scanner object for input.
        Scanner scanner = new Scanner(System.in);

        // Ask for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Display greeting
        System.out.println("Hello, " + name + "! Welcome to Java programming.");

        // Close the scanner to avoid resource leaks
        scanner.close();
    }
}
