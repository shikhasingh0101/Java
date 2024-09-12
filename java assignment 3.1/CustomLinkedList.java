import java.util.*;

public class CustomLinkedList<E> extends LinkedList<E> {

    // Constructor 1: Default constructor
    public CustomLinkedList() {
        super();
    }

    // Constructor 2: Constructor that takes a Collection as input
    public CustomLinkedList(Collection<? extends E> c) {
        super(c);
    }

    // Main method to demonstrate the functionality
    public static void main(String[] args) {
        // Creating instances using different constructors
        CustomLinkedList<String> list1 = new CustomLinkedList<>();
        CustomLinkedList<String> list2 = new CustomLinkedList<>(List.of("Apple", "Banana", "Cherry"));

        // a) Insert Elements into the LinkedList at the last position
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        // b) Add an element or collection of elements at a specific position
        list1.add(1, "Inserted Element");
        list1.addAll(2, List.of("Alpha", "Beta"));

        // c) Retrieve the first item from LinkedList
        String firstItem = list1.getFirst();
        System.out.println("First item: " + firstItem);

        // d) Retrieve the First Occurrence of the Specified Elements in a LinkedList
        int firstOccurrence = list1.indexOf("Two");
        System.out.println("First occurrence of 'Two': " + firstOccurrence);

        // e) Retrieve the position of last occurrence of a given element
        list1.add("Two"); // Adding another "Two" to demonstrate
        int lastOccurrence = list1.lastIndexOf("Two");
        System.out.println("Last occurrence of 'Two': " + lastOccurrence);

        // f) Retrieve but does not remove the Last Element of a LinkedList
        String lastItem = list1.peekLast();
        System.out.println("Last item (peek): " + lastItem);

        // g) Get the number of elements in a LinkedList
        int size = list1.size();
        System.out.println("Size of LinkedList: " + size);

        // h) Check if a Particular Element exists in a LinkedList
        boolean containsAlpha = list1.contains("Alpha");
        System.out.println("Contains 'Alpha': " + containsAlpha);

        // i) Retrieve the position of that element if it exists
        if (containsAlpha) {
            int position = list1.indexOf("Alpha");
            System.out.println("'Alpha' is at position: " + position);
        }

        // j) Iterate through all Elements in a LinkedList
        System.out.println("Iterating through LinkedList:");
        for (String item : list1) {
            System.out.println(item);
        }

        // k) Iterate a LinkedList in Reverse Order
        System.out.println("Iterating in reverse order:");
        Iterator<String> reverseIterator = list1.descendingIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }

        // l) Display the elements and their positions
        System.out.println("Elements and their positions:");
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("Element at index " + i + ": " + list1.get(i));
        }

        // m) Test if LinkedList is Empty or Not
        boolean isEmpty = list1.isEmpty();
        System.out.println("Is LinkedList empty: " + isEmpty);

        // n) Replace an Element in a LinkedList
        list1.set(2, "Replaced Element");
        System.out.println("After replacing element at index 2: " + list1);

        // o) Remove and Return the First Element of a LinkedList
        String removedFirst = list1.pollFirst();
        System.out.println("Removed first element: " + removedFirst);

        // p) Remove a specified element from a LinkedList
        list1.remove("Two");
        System.out.println("After removing 'Two': " + list1);

        // q) Remove the last element from a LinkedList
        list1.pollLast();
        System.out.println("After removing last element: " + list1);

        // r) Remove all elements from a LinkedList
        list1.clear();
        System.out.println("After clearing LinkedList: " + list1);

        // s) Pop items from the stack represented by the LinkedList
        CustomLinkedList<String> stackList = new CustomLinkedList<>();
        stackList.push("Stack1");
        stackList.push("Stack2");
        System.out.println("Popped from stack: " + stackList.pop());

        // t) Check whether an item exists in the LinkedList collection or not
        boolean exists = stackList.contains("Stack1");
        System.out.println("Does 'Stack1' exist: " + exists);

        // u) Convert a LinkedList to ArrayList
        ArrayList<String> arrayList = new ArrayList<>(stackList);
        System.out.println("Converted to ArrayList: " + arrayList);

        // v) Join two linked lists
        CustomLinkedList<String> list3 = new CustomLinkedList<>(List.of("X", "Y", "Z"));
        stackList.addAll(list3);
        System.out.println("After joining two LinkedLists: " + stackList);

        // w) Join an ArrayList at the end of a LinkedList
        ArrayList<String> arrayList2 = new ArrayList<>(List.of("A", "B", "C"));
        stackList.addAll(arrayList2);
        System.out.println("After joining ArrayList at end: " + stackList);

        // x) Add LinkedList collection into another LinkedList collection on the specified index
        CustomLinkedList<String> list4 = new CustomLinkedList<>(List.of("D", "E", "F"));
        stackList.addAll(1, list4);
        System.out.println("After adding LinkedList at index 1: " + stackList);
    }
}
