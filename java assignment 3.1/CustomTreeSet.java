import java.util.*;

public class CustomTreeSet<E> extends TreeSet<E> {

    // Constructor 1: Default constructor
    public CustomTreeSet() {
        super();
    }

    // Constructor 2: Constructor that takes a Collection as input
    public CustomTreeSet(Collection<? extends E> c) {
        super(c);
    }

    // Constructor 3: Constructor that takes a SortedSet as input
    public CustomTreeSet(SortedSet<E> ss) {
        super(ss);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomTreeSet<String> treeSet1 = new CustomTreeSet<>();
        CustomTreeSet<String> treeSet2 = new CustomTreeSet<>(List.of("Apple", "Banana", "Cherry"));
        CustomTreeSet<String> treeSet3 = new CustomTreeSet<>(new TreeSet<>(List.of("Xylophone", "Violin", "Piano")));

        // Create a Set using Set.of() and Set.copyOf()
        Set<String> setOf = Set.of("One", "Two", "Three");
        Set<String> copyOfSet = Set.copyOf(setOf);

        System.out.println("Set created using Set.of(): " + setOf);
        System.out.println("Set created using Set.copyOf(): " + copyOfSet);

        // 1. E ceiling(E obj)
        String ceiling = treeSet2.ceiling("Blueberry");
        System.out.println("Ceiling of 'Blueberry': " + ceiling);

        // 2. Iterator<E> descendingIterator()
        System.out.println("Descending Iterator:");
        Iterator<String> descendingIterator = treeSet2.descendingIterator();
        while (descendingIterator.hasNext()) {
            System.out.println(descendingIterator.next());
        }

        // 3. NavigableSet<E> descendingSet()
        NavigableSet<String> descendingSet = treeSet2.descendingSet();
        System.out.println("Descending Set: " + descendingSet);

        // 4. E floor(E obj)
        String floor = treeSet2.floor("Blueberry");
        System.out.println("Floor of 'Blueberry': " + floor);

        // 5. NavigableSet<E> headSet(E toElement, boolean inclusive)
        NavigableSet<String> headSet = treeSet2.headSet("Cherry", true);
        System.out.println("HeadSet up to 'Cherry' inclusive: " + headSet);

        // 6. NavigableSet<E> subSet(E lowerBound, boolean lowIncl, E upperBound, boolean highIncl)
        NavigableSet<String> subSet = treeSet2.subSet("Apple", true, "Banana", true);
        System.out.println("SubSet from 'Apple' to 'Banana' inclusive: " + subSet);

        // 7. E higher(E obj)
        String higher = treeSet2.higher("Banana");
        System.out.println("Element higher than 'Banana': " + higher);

        // 8. E lower(E obj)
        String lower = treeSet2.lower("Banana");
        System.out.println("Element lower than 'Banana': " + lower);

        // 9. E pollFirst()
        String pollFirst = treeSet2.pollFirst();
        System.out.println("Poll First Element: " + pollFirst);
        System.out.println("TreeSet after pollFirst: " + treeSet2);

        // 10. E pollLast()
        String pollLast = treeSet2.pollLast();
        System.out.println("Poll Last Element: " + pollLast);
        System.out.println("TreeSet after pollLast: " + treeSet2);

        // 11. NavigableSet<E> tailSet(E fromElement, boolean inclusive)
        NavigableSet<String> tailSet = treeSet3.tailSet("Violin", true);
        System.out.println("TailSet from 'Violin' inclusive: " + tailSet);
    }
}
