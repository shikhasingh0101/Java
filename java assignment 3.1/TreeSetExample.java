import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");
        treeSet.add("Date");

        System.out.println("TreeSet: " + treeSet); // Output: [Apple, Banana, Cherry, Date]

        System.out.println("First Element: " + treeSet.first()); // Output: Apple
        System.out.println("Last Element: " + treeSet.last());  // Output: Date

        System.out.println("Ceiling of 'Blueberry': " + treeSet.ceiling("Blueberry")); // Output: Cherry
    }
}
