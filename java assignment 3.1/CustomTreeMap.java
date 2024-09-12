import java.util.*;

public class CustomTreeMap<K, V> extends TreeMap<K, V> {

    // Constructor 1: Default constructor
    public CustomTreeMap() {
        super();
    }

    // Constructor 2: Constructor that takes a Comparator as input
    public CustomTreeMap(Comparator<? super K> comp) {
        super(comp);
    }

    // Constructor 3: Constructor that takes a Map as input
    public CustomTreeMap(Map<? extends K, ? extends V> m) {
        super(m);
    }

    // Constructor 4: Constructor that takes a SortedMap as input
    public CustomTreeMap(SortedMap<K, ? extends V> sm) {
        super(sm);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomTreeMap<String, Integer> map1 = new CustomTreeMap<>();
        CustomTreeMap<String, Integer> map2 = new CustomTreeMap<>(Comparator.reverseOrder());
        CustomTreeMap<String, Integer> map3 = new CustomTreeMap<>(Map.of("One", 1, "Two", 2, "Three", 3));
        CustomTreeMap<String, Integer> map4 = new CustomTreeMap<>(map3);

        // Adding entries to map1
        map1.put("Apple", 10);
        map1.put("Banana", 20);
        map1.put("Cherry", 30);
        map1.put("Date", 40);
        map1.put("Elderberry", 50);

        // 1. K firstKey()
        System.out.println("First key: " + map1.firstKey());

        // 2. SortedMap<K, V> headMap(K end)
        System.out.println("HeadMap up to 'Cherry': " + map1.headMap("Cherry"));

        // 3. K lastKey()
        System.out.println("Last key: " + map1.lastKey());

        // 4. SortedMap<K, V> subMap(K start, K end)
        System.out.println("SubMap from 'Banana' to 'Date': " + map1.subMap("Banana", "Date"));

        // 5. SortedMap<K, V> tailMap(K start)
        System.out.println("TailMap from 'Cherry': " + map1.tailMap("Cherry"));

        // 6. Map.Entry<K,V> ceilingEntry(K obj)
        System.out.println("Ceiling Entry for 'Blueberry': " + map1.ceilingEntry("Blueberry"));

        // 7. K ceilingKey(K obj)
        System.out.println("Ceiling Key for 'Blueberry': " + map1.ceilingKey("Blueberry"));

        // 8. Map.Entry<K,V> floorEntry(K obj)
        System.out.println("Floor Entry for 'Blueberry': " + map1.floorEntry("Blueberry"));

        // 9. K floorKey(K obj)
        System.out.println("Floor Key for 'Blueberry': " + map1.floorKey("Blueberry"));

        // 10. Map.Entry<K,V> higherEntry(K obj)
        System.out.println("Higher Entry for 'Banana': " + map1.higherEntry("Banana"));

        // 11. NavigableSet<K> navigableKeySet()
        System.out.println("Navigable Key Set: " + map1.navigableKeySet());

        // 12. Map.Entry<K,V> pollFirstEntry()
        System.out.println("Poll First Entry: " + map1.pollFirstEntry());
        System.out.println("Map after polling first entry: " + map1);

        // 13. Map.Entry<K,V> pollLastEntry()
        System.out.println("Poll Last Entry: " + map1.pollLastEntry());
        System.out.println("Map after polling last entry: " + map1);

        // 14. NavigableMap<K,V> subMap(K lowerBound, boolean lowIncl, K upperBound, boolean highIncl)
        NavigableMap<String, Integer> subMapIncl = map1.subMap("Banana", true, "Date", false);
        System.out.println("SubMap from 'Banana' (inclusive) to 'Date' (exclusive): " + subMapIncl);

        // 15. NavigableMap<K,V> tailMap(K lowerBound, boolean incl)
        NavigableMap<String, Integer> tailMapIncl = map1.tailMap("Cherry", true);
        System.out.println("TailMap from 'Cherry' (inclusive): " + tailMapIncl);

        // 16. NavigableSet<K> descendingKeySet()
        System.out.println("Descending Key Set: " + map1.descendingKeySet());

        // 17. NavigableMap<K,V> descendingMap()
        System.out.println("Descending Map: " + map1.descendingMap());

        // 18. Map.Entry<K,V> firstEntry()
        System.out.println("First Entry: " + map1.firstEntry());

        // 19. NavigableMap<K,V> headMap(K upperBound, boolean incl)
        NavigableMap<String, Integer> headMapIncl = map1.headMap("Cherry", true);
        System.out.println("HeadMap up to 'Cherry' (inclusive): " + headMapIncl);

        // 20. Map.Entry<K,V> lastEntry()
        System.out.println("Last Entry: " + map1.lastEntry());
    }
}
