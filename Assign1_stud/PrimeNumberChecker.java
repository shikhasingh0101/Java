import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if the number is prime
        boolean isPrime = isPrime(number);
        
        // Output the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        // Close the scanner
        scanner.close();
    }
    
    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        // Negative numbers, 0, and 1 are not prime
        if (num <= 1) {
            return false;
        }
        
        // Check for factors from 2 up to the square root of num
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }
        
        return true; // Prime number
    }
}
