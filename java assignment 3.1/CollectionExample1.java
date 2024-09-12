import java.util.*;

public class CollectionExample1 {
    public static void main(String[] args) {
        // List Example
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // Duplicates are allowed
        System.out.println("List: " + list); // Output: [Apple, Banana, Apple]

        // Set Example
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // Duplicates are not allowed
        System.out.println("Set: " + set); // Output: [Apple, Banana]

        // Queue Example
        Queue<String> queue = new LinkedList<>();
        queue.offer("Apple");
        queue.offer("Banana");
        queue.offer("Cherry");
        System.out.println("Queue: " + queue); // Output: [Apple, Banana, Cherry]
        System.out.println("Head of Queue: " + queue.poll()); // Output: Apple
        System.out.println("Queue after poll: " + queue); // Output: [Banana, Cherry]
    }
}
