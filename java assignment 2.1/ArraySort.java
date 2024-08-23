import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[] numbers = {40, 10, 30, 20, 50}; 

        System.out.println("Original array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        Arrays.sort(numbers);

      
        System.out.println("Sorted array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
