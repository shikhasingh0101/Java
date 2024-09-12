import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a positive number
        System.out.print("Enter a positive number: ");
        int number = scanner.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("Please enter a positive number.");
            scanner.close();
            return;
        }

        // Reverse the digits of the number
        int reversedNumber = 0;
        int originalNumber = number;

        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Get the last digit
            reversedNumber = reversedNumber * 10 + digit; // Append digit to reversed number
            originalNumber /= 10; // Remove the last digit from the original number
        }

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}
