public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // Example data
        int[] array = {1, 2, 3, 4, 5};
        String str = "Hello";

        try {
            // Code that might throw exceptions
            
            // ArrayIndexOutOfBoundsException
            System.out.println("Accessing array element at index 10: " + array[10]);

            // StringIndexOutOfBoundsException
            System.out.println("Accessing string character at index 20: " + str.charAt(20));
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle ArrayIndexOutOfBoundsException
            System.out.println("Exception caught: ArrayIndexOutOfBoundsException");
            System.out.println("Details: " + e.getMessage());
            e.printStackTrace();
            
        } catch (StringIndexOutOfBoundsException e) {
            // Handle StringIndexOutOfBoundsException
            System.out.println("Exception caught: StringIndexOutOfBoundsException");
            System.out.println("Details: " + e.getMessage());
            e.printStackTrace();
            
        } finally {
            // This block will always execute, regardless of whether an exception was thrown
            System.out.println("Finally block executed.");
        }
    }
}
