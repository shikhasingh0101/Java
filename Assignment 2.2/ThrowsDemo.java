// Define a custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

// A class demonstrating the use of 'throws'
public class ThrowsDemo {
    
    // Method that declares it might throw a CustomException
    public static void riskyMethod() throws CustomException {
        // Simulate some condition that might lead to an exception
        boolean errorOccurred = true;
        if (errorOccurred) {
            throw new CustomException("An error occurred in riskyMethod");
        }
        System.out.println("riskyMethod executed successfully");
    }

    public static void main(String[] args) {
        try {
            // Call the method that might throw an exception
            riskyMethod();
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }

        // Another method call that could be used to show no exception scenario
        try {
            // Change the condition to false to see the successful execution
            boolean errorOccurred = false;
            if (errorOccurred) {
                riskyMethod();
            } else {
                System.out.println("No exception thrown, method executed successfully.");
            }
        } catch (CustomException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
