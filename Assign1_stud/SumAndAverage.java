public class SumAndAverage {

    public static void main(String[] args) {
        // Initialize the sum variable
        int sum = 0;
        int count = 10; // Number of elements from 1 to 10

        // Calculate the sum of numbers from 1 to 10
        for (int i = 1; i <= count; i++) {
            sum += i;
        }

        // Calculate the average
        double average = (double) sum / count;

        // Output the results
        System.out.println("Sum of numbers from 1 to 10: " + sum);
        System.out.println("Average of numbers from 1 to 10: " + average);
    }
}
