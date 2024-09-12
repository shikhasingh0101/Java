// Define a custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ThrowDemo {
    
    // Method to check if the age is valid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            // Throwing the custom exception if the age is invalid
            throw new InvalidAgeException("Age is not valid: " + age);
        } else {
            System.out.println("Age is valid: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            // Test with valid age
            checkAge(25);

            // Test with invalid age
            checkAge(-5);
            
        } catch (InvalidAgeException e) {
            // Handle the custom exception
            System.out.println("Caught exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
