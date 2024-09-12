import java.util.Scanner;

public class ArmstrongNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is an Armstrong number
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrong(int num) {
        // Convert the number to a string to easily get digits and count the number of digits
        String numStr = Integer.toString(num);
        int numberOfDigits = numStr.length();
        
        // Calculate the sum of digits raised to the power of the number of digits
        int sum = 0;
        int temp = num;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numberOfDigits);
            temp /= 10;
        }

        // Check if the sum is equal to the original number
        return sum == num;
    }
}
