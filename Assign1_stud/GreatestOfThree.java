import java.util.Scanner;

public class GreatestOfThree {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();
        
        // Initialize a variable to hold the greatest number
        int greatest;
        
        // Determine the greatest number using if-else statements
        if (num1 >= num2 && num1 >= num3) {
            greatest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            greatest = num2;
        } else {
            greatest = num3;
        }
        
        // Output the result
        System.out.println("The greatest number is: " + greatest);
        
        // Close the scanner
        scanner.close();
    }
}
