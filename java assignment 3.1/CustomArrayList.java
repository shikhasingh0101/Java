import java.util.*;

public class CustomArrayList<E> extends ArrayList<E> {

    // Constructor 1: Default constructor
    public CustomArrayList() {
        super();
    }

    // Constructor 2: Constructor that takes a Collection as input
    public CustomArrayList(Collection<? extends E> c) {
        super(c);
    }

    // Constructor 3: Constructor that sets initial capacity
    public CustomArrayList(int capacity) {
        super(capacity);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomArrayList<String> list1 = new CustomArrayList<>();
        CustomArrayList<String> list2 = new CustomArrayList<>(List.of("Apple", "Banana", "Cherry"));
        CustomArrayList<String> list3 = new CustomArrayList<>(10);

        // Adding elements using add(Object obj) method
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        // Adding all elements from another collection
        list3.addAll(list2);

        // Removing an element
        list3.remove("Banana");

        // Clearing the list
        list1.clear();

        // Checking if the list contains an element
        boolean containsCherry = list3.contains("Cherry");

        // Checking the size of the list
        int size = list3.size();

        // Adding element at a specific index
        list3.add(1, "Date");

        // Getting element at a specific index
        String element = list3.get(0);

        // Iterating using for loop
        System.out.println("For loop iteration:");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i));
        }

        // Iterating using for-each loop
        System.out.println("For-each loop iteration:");
        for (String s : list3) {
            System.out.println(s);
        }

        // Iterating using Iterator
        System.out.println("Iterator iteration:");
        Iterator<String> iterator = list3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterating using ListIterator
        System.out.println("ListIterator iteration:");
        ListIterator<String> listIterator = list3.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        // Using List.of(), List.copyOf(), and List.asList()
        List<String> listOf = List.of("X", "Y", "Z");
        List<String> copyOf = List.copyOf(listOf);
        List<String> asList = Arrays.asList("A", "B", "C");

        // Display the lists
        System.out.println("List.of(): " + listOf);
        System.out.println("List.copyOf(): " + copyOf);
        System.out.println("List.asList(): " + asList);
    }
}
