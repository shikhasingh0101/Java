public class NestedTryCatchDemo {
    public static void main(String[] args) {
        try {
            // Outer try block
            System.out.println("Outer try block");

            // Nested try-catch block
            try {
                System.out.println("Inner try block");

                // This will throw ArithmeticException
                int result = 10 / 0;
                
            } catch (ArithmeticException e) {
                // Handling ArithmeticException in the inner try-catch
                System.out.println("Caught ArithmeticException in inner try-catch");
                System.out.println("Details: " + e.getMessage());
                e.printStackTrace();
            }
            
            // This will throw ArrayIndexOutOfBoundsException
            int[] array = new int[5];
            System.out.println("Accessing array element at index 10: " + array[10]);

        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException in the outer try-catch
            System.out.println("Caught ArrayIndexOutOfBoundsException in outer try-catch");
            System.out.println("Details: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            // Handling any other exceptions
            System.out.println("Caught Exception in outer try-catch");
            System.out.println("Details: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // This block will always execute
            System.out.println("Finally block executed.");
        }
    }
}
