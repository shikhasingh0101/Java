import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        int[] numbers = new int[n];

        
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        
        scanner.close();

       
        System.out.println("Array elements are:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
