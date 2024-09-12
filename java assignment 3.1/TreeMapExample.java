import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Apple", 3);
        treeMap.put("Banana", 2);
        treeMap.put("Cherry", 5);
        treeMap.put("Date", 4);

        System.out.println("TreeMap: " + treeMap); // Output: {Apple=3, Banana=2, Cherry=5, Date=4}

        System.out.println("Value for 'Banana': " + treeMap.get("Banana")); // Output: 2
        System.out.println("First Key: " + treeMap.firstKey()); // Output: Apple
        System.out.println("Last Key: " + treeMap.lastKey());  // Output: Date
        System.out.println("Ceiling Entry for 'Blueberry': " + treeMap.ceilingEntry("Blueberry")); // Output: Cherry=5
    }
}
