import java.util.Scanner;

public class GreaterNumberFinder {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        // Find the greater number using the conditional (ternary) operator
        int greater = (num1 > num2) ? num1 : num2;
        
        // Output the result
        System.out.println("The greater number is: " + greater);
        
        // Close the scanner
        scanner.close();
    }
}
