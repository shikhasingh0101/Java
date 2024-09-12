public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("Program started");

        try {
            System.out.println("Inside try block");

            // Simulate an exception
            int result = 10 / 0; // This will throw ArithmeticException

            // This line will not be executed
            System.out.println("This line will not be executed");
            
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException");
            System.out.println("Exception message: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            System.out.println("Inside finally block");
        }

        System.out.println("Program ended");
    }
}
