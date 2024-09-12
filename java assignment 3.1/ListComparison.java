import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListComparison {
    public static void main(String[] args) {
        // ArrayList Example
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");

        System.out.println("ArrayList: " + arrayList);

        // LinkedList Example
        List<String> linkedList = new LinkedList<>();
        linkedList.add("X");
        linkedList.add("Y");
        linkedList.add("Z");

        System.out.println("LinkedList: " + linkedList);

        // Performance Difference - Insertion
        arrayList.add(1, "Insert in ArrayList");
        linkedList.add(1, "Insert in LinkedList");

        System.out.println("ArrayList after insertion: " + arrayList);
        System.out.println("LinkedList after insertion: " + linkedList);

        // Performance Difference - Deletion
        arrayList.remove(2);
        linkedList.remove(2);

        System.out.println("ArrayList after deletion: " + arrayList);
        System.out.println("LinkedList after deletion: " + linkedList);

        // Accessing Elements
        System.out.println("Element at index 1 in ArrayList: " + arrayList.get(1));
        System.out.println("Element at index 1 in LinkedList: " + linkedList.get(1));
    }
}
