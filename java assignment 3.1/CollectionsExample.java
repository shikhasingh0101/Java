import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(1);

        // Sorting the list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        // Reversing the list
        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        // Finding the maximum and minimum values in the list
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);
        System.out.println("Max Value: " + max);
        System.out.println("Min Value: " + min);

        // Making the list unmodifiable
        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);
        System.out.println("Unmodifiable List: " + unmodifiableList);

        // Trying to add an element to the unmodifiable list (this will throw an exception)
        // unmodifiableList.add(10); // Uncommenting this line will throw UnsupportedOperationException
    }
}
