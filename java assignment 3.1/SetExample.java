import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicate, will not be added

        System.out.println("Set: " + set); // Output: [Apple, Banana]

        // Checking for element presence
        System.out.println("Contains 'Banana': " + set.contains("Banana"));

        // Removing an element
        set.remove("Banana");
        System.out.println("Set after removal: " + set); // Output: [Apple]

        // Iterating over elements
        for (String fruit : set) {
            System.out.println(fruit);
        }
    }
}
