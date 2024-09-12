import java.util.Scanner;

public class AverageOddEvenNumbers {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the value of N
        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        // Calculate the sum of the first N odd numbers
        int oddSum = 0;
        int evenSum = 0;

        // Generate and sum the first N odd numbers
        System.out.println("First " + N + " odd numbers:");
        for (int i = 0; i < N; i++) {
            int oddNumber = 2 * i + 1;
            oddSum += oddNumber;
            System.out.print(oddNumber + " ");
        }
        System.out.println();

        // Generate and sum the first N even numbers
        System.out.println("First " + N + " even numbers:");
        for (int i = 0; i < N; i++) {
            int evenNumber = 2 * i;
            evenSum += evenNumber;
            System.out.print(evenNumber + " ");
        }
        System.out.println();

        // Calculate the average of odd and even numbers
        double oddAverage = (double) oddSum / N;
        double evenAverage = (double) evenSum / N;

        // Display the results
        System.out.println("Average of first " + N + " odd numbers: " + oddAverage);
        System.out.println("Average of first " + N + " even numbers: " + evenAverage);

        // Close the scanner
        scanner.close();
    }
}
