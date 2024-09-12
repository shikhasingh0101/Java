public class TypeConversionDemo {

    public static void main(String[] args) {
        // Demonstrate implicit type conversion
        implicitConversion();
        
        // Demonstrate explicit type conversion
        explicitConversion();
    }

    // Implicit Type Conversion
    public static void implicitConversion() {
        int intVar = 10;
        double doubleVar = 5.5;

        // Implicit conversion: int to double
        double result = intVar + doubleVar;  // intVar is implicitly converted to double
        System.out.println("Implicit Conversion: " + intVar + " (int) + " + doubleVar + " (double) = " + result + " (double)");
    }

    // Explicit Type Conversion
    public static void explicitConversion() {
        String stringVar = "123";
        int intVar = 456;

        // Convert String to int explicitly
        int stringToInt = Integer.parseInt(stringVar); 

        // Adding integer values
        int result = stringToInt + intVar;

        System.out.println("Explicit Conversion: Integer.parseInt(\"" + stringVar + "\") = " + stringToInt +
                           ", " + stringVar + " (String) + " + intVar + " (int) = " + result + " (int)");
    }
}
