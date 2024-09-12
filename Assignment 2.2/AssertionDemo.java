public class AssertionDemo {

    // Method to calculate the square root
    public static double calculateSquareRoot(double number) {
        // Assert that the number is non-negative
        assert number >= 0 : "Number should be non-negative. Given: " + number;

        // Calculate and return the square root
        return Math.sqrt(number);
    }

    public static void main(String[] args) {
        // Test with a positive number
        System.out.println("Square root of 16: " + calculateSquareRoot(16));

        // Test with a negative number to trigger assertion
        try {
            System.out.println("Square root of -9: " + calculateSquareRoot(-9));
        } catch (AssertionError e) {
            System.out.println("AssertionError caught: " + e.getMessage());
        }
    }
}
