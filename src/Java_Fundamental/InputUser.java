package Java_Fundamental;
import java.util.Scanner;

public class InputUser {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Prompt the user for their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Calculate the year of birth
        int currentYear = 2023; // You can update this to the current year
        int birthYear = currentYear - age;

        // Display the user's information
        System.out.println("Hello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        System.out.println("You were born in the year " + birthYear + ".");

        // Close the Scanner
        scanner.close();
    }
}
