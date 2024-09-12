import java.util.*;

public class CustomHashMap<K, V> extends HashMap<K, V> {

    // Constructor 1: Default constructor
    public CustomHashMap() {
        super();
    }

    // Constructor 2: Constructor that takes a Map as input
    public CustomHashMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    // Constructor 3: Constructor that takes initial capacity
    public CustomHashMap(int capacity) {
        super(capacity);
    }

    // Constructor 4: Constructor that takes initial capacity and fill ratio
    public CustomHashMap(int capacity, float fillRatio) {
        super(capacity, fillRatio);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomHashMap<String, Integer> map1 = new CustomHashMap<>();
        CustomHashMap<String, Integer> map2 = new CustomHashMap<>(Map.of("One", 1, "Two", 2, "Three", 3));
        CustomHashMap<String, Integer> map3 = new CustomHashMap<>(10);
        CustomHashMap<String, Integer> map4 = new CustomHashMap<>(10, 0.75f);

        // Create a Map using Map.of() and Map.copyOf()
        Map<String, Integer> mapOf = Map.of("A", 10, "B", 20, "C", 30);
        Map<String, Integer> copyOfMap = Map.copyOf(mapOf);

        System.out.println("Map created using Map.of(): " + mapOf);
        System.out.println("Map created using Map.copyOf(): " + copyOfMap);

        // Add entries to map1
        map1.put("Key1", 100);
        map1.put("Key2", 200);
        map1.put("Key3", 300);

        // 1. V get(Object key)
        Integer value = map1.get("Key1");
        System.out.println("Value for 'Key1': " + value);

        // 2. V getOrDefault(Object key, V defaultValue)
        Integer defaultValue = map1.getOrDefault("Key4", 400);
        System.out.println("Value for 'Key4' or default: " + defaultValue);

        // 3. V put(K key, V value)
        map1.put("Key4", 400);
        System.out.println("Updated Map after put: " + map1);

        // 4. int hashCode()
        int hashCode = map1.hashCode();
        System.out.println("HashCode of map1: " + hashCode);

        // 5. boolean isEmpty()
        boolean isEmpty = map1.isEmpty();
        System.out.println("Is map1 empty? " + isEmpty);

        // 6. boolean containsKey(Object k)
        boolean containsKey = map1.containsKey("Key2");
        System.out.println("Does map1 contain 'Key2'? " + containsKey);

        // 7. boolean containsValue(Object v)
        boolean containsValue = map1.containsValue(200);
        System.out.println("Does map1 contain value 200? " + containsValue);

        // 8. V remove(Object k)
        Integer removedValue = map1.remove("Key3");
        System.out.println("Removed value for 'Key3': " + removedValue);
        System.out.println("Map after removal of 'Key3': " + map1);

        // 9. boolean remove(Object key, Object value)
        boolean removed = map1.remove("Key4", 400);
        System.out.println("Was 'Key4' with value 400 removed? " + removed);
        System.out.println("Map after removal: " + map1);

        // 10. V putIfAbsent(K key, V value)
        map1.putIfAbsent("Key2", 500);
        System.out.println("Map after putIfAbsent: " + map1);

        // 11. V replace(K key, V value)
        map1.replace("Key2", 250);
        System.out.println("Map after replace: " + map1);

        // 12. boolean replace(K key, V oldValue, V newValue)
        boolean replaced = map1.replace("Key2", 250, 300);
        System.out.println("Was 'Key2' value replaced? " + replaced);
        System.out.println("Map after conditional replace: " + map1);

        // 13. void clear()
        map4.clear();
        System.out.println("Map4 after clear: " + map4);

        // 14. int size()
        int size = map1.size();
        System.out.println("Size of map1: " + size);

        // 15. Collection<V> values()
        Collection<Integer> values = map1.values();
        System.out.println("Values in map1: " + values);

        // 16. Set<K> keySet()
        Set<String> keys = map1.keySet();
        System.out.println("Keys in map1: " + keys);

        // 17. Set<Map.Entry<K,V>> entrySet()
        Set<Map.Entry<String, Integer>> entries = map1.entrySet();
        System.out.println("Entries in map1: " + entries);

        // 18. K getKey() of Map.Entry
        Map.Entry<String, Integer> entry = map1.entrySet().iterator().next();
        String firstKey = entry.getKey();
        System.out.println("First key in map1: " + firstKey);

        // 19. V getValue() of Map.Entry
        Integer firstValue = entry.getValue();
        System.out.println("First value in map1: " + firstValue);
    }
}
