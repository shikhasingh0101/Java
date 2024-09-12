import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);

        System.out.println("Map: " + map); // Output: {Apple=3, Banana=2, Orange=5}

        // Getting a value by key
        System.out.println("Value for 'Apple': " + map.get("Apple")); // Output: 3

        // Checking if a key exists
        System.out.println("Contains key 'Banana': " + map.containsKey("Banana"));

        // Removing an entry by key
        map.remove("Banana");
        System.out.println("Map after removal: " + map); // Output: {Apple=3, Orange=5}

        // Iterating over entries
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
