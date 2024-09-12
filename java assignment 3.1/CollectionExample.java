import java.util.ArrayList;
import java.util.Collection;

public class CollectionExample {
    public static void main(String[] args) {
        // Creating a collection (ArrayList) that implements the Collection interface
        Collection<String> fruits = new ArrayList<>();

        // Adding elements to the collection
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Checking if the collection contains a specific element
        System.out.println("Does the collection contain 'Apple'? " + fruits.contains("Apple"));

        // Removing an element from the collection
        fruits.remove("Banana");

        // Iterating through the collection
        System.out.println("Fruits in the collection:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Checking the size of the collection
        System.out.println("Number of fruits: " + fruits.size());

        // Checking if the collection is empty
        System.out.println("Is the collection empty? " + fruits.isEmpty());
    }
}
