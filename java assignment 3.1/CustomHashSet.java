import java.util.*;

public class CustomHashSet<E> extends HashSet<E> {

    // Constructor 1: Default constructor
    public CustomHashSet() {
        super();
    }

    // Constructor 2: Constructor that takes a Collection as input
    public CustomHashSet(Collection<? extends E> c) {
        super(c);
    }

    // Constructor 3: Constructor that sets initial capacity
    public CustomHashSet(int capacity) {
        super(capacity);
    }

    // Constructor 4: Constructor that sets initial capacity and fill ratio
    public CustomHashSet(int capacity, float fillRatio) {
        super(capacity, fillRatio);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomHashSet<String> set1 = new CustomHashSet<>();
        CustomHashSet<String> set2 = new CustomHashSet<>(List.of("Apple", "Banana", "Cherry"));
        CustomHashSet<String> set3 = new CustomHashSet<>(10);
        CustomHashSet<String> set4 = new CustomHashSet<>(10, 0.75f);

        // 1. Convert a HashSet to a List/ArrayList
        List<String> listFromSet = new ArrayList<>(set2);
        System.out.println("List from HashSet: " + listFromSet);

        // 2. Convert a HashSet to a TreeSet
        TreeSet<String> treeSetFromHashSet = new TreeSet<>(set2);
        System.out.println("TreeSet from HashSet: " + treeSetFromHashSet);

        // 3. Convert a HashSet to an Array
        String[] arrayFromSet = set2.toArray(new String[0]);
        System.out.println("Array from HashSet: " + Arrays.toString(arrayFromSet));

        // 4. Test if a HashSet is empty or not
        boolean isEmpty = set1.isEmpty();
        System.out.println("Is HashSet empty: " + isEmpty);

        // 5. Empty a HashSet
        set2.clear();
        System.out.println("HashSet after clearing: " + set2);

        // 6. Get the number of elements in a HashSet
        int size = set1.size();
        System.out.println("Size of HashSet: " + size);

        // 7. Iterate through all elements in a HashSet
        set1.add("One");
        set1.add("Two");
        set1.add("Three");
        System.out.println("Iterating through HashSet:");
        for (String element : set1) {
            System.out.println(element);
        }

        // 8. Add a specified element to HashSet
        set1.add("Four");
        System.out.println("HashSet after adding 'Four': " + set1);

        // 9. Remove a specified element from HashSet
        set1.remove("Two");
        System.out.println("HashSet after removing 'Two': " + set1);

        // 10. Try to add duplicate elements to HashSet
        boolean added = set1.add("Three"); // This should not add anything as "Three" already exists
        System.out.println("Trying to add duplicate 'Three': " + added);
        System.out.println("HashSet after trying to add duplicate: " + set1);

        // 11. Add ArrayList elements to HashSet
        List<String> arrayList = List.of("Five", "Six");
        set1.addAll(arrayList);
        System.out.println("HashSet after adding ArrayList: " + set1);

        // 12. Copy Set content to another HashSet
        CustomHashSet<String> setCopy = new CustomHashSet<>(set1);
        System.out.println("Copied HashSet: " + setCopy);

        // 13. Create a HashSet with string items
        CustomHashSet<String> stringSet = new CustomHashSet<>(List.of("Hello", "World"));
        System.out.println("String HashSet: " + stringSet);

        // 14. Print a HashSet collection using the foreach loop
        System.out.println("Printing HashSet using foreach:");
        stringSet.forEach(System.out::println);

        // 15. Check whether a HashSet contains a specified item or not
        boolean containsWorld = stringSet.contains("World");
        System.out.println("HashSet contains 'World': " + containsWorld);

        // 16. Create a set of Box objects using HashSet
        class Box {
            int length, height, width;

            Box(int length, int height, int width) {
                this.length = length;
                this.height = height;
                this.width = width;
            }

            @Override
            public String toString() {
                return "Box(" + length + ", " + height + ", " + width + ")";
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Box box = (Box) o;
                return length == box.length && height == box.height && width == box.width;
            }

            @Override
            public int hashCode() {
                return Objects.hash(length, height, width);
            }
        }

        HashSet<Box> boxSet = new HashSet<>();
        boxSet.add(new Box(3, 4, 5));
        boxSet.add(new Box(7, 8, 9));
        System.out.println("HashSet of Boxes: " + boxSet);

        // 17. Find the union of HashSet collections
        HashSet<String> setA = new HashSet<>(List.of("A", "B", "C"));
        HashSet<String> setB = new HashSet<>(List.of("C", "D", "E"));
        setA.addAll(setB); // Union
        System.out.println("Union of HashSets: " + setA);

        // 18. Find the intersection of HashSet collection
        setA = new HashSet<>(List.of("A", "B", "C"));
        setB = new HashSet<>(List.of("C", "D", "E"));
        setA.retainAll(setB); // Intersection
        System.out.println("Intersection of HashSets: " + setA);

        // 19. Compare two sets and retain elements which are the same in both sets
        setA = new HashSet<>(List.of("A", "B", "C"));
        setB = new HashSet<>(List.of("B", "C", "D"));
        setA.retainAll(setB);
        System.out.println("Common elements in both sets: " + setA);

        // 20. Compare two hash sets
        setA = new HashSet<>(List.of("A", "B", "C"));
        setB = new HashSet<>(List.of("A", "B", "C"));
        boolean areEqual = setA.equals(setB);
        System.out.println("Are HashSet A and B equal: " + areEqual);

        // 21. Remove all of the elements from a hash set
        setA.clear();
        System.out.println("HashSet A after clearing: " + setA);
    }
}
