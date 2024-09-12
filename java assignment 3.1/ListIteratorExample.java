import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        ListIterator<String> listIterator = list.listIterator();
        
        // Forward traversal using ListIterator
        while (listIterator.hasNext()) {
            System.out.println("Forward: " + listIterator.next());
        }

        // Backward traversal using ListIterator
        while (listIterator.hasPrevious()) {
            System.out.println("Backward: " + listIterator.previous());
        }

        // Adding an element using ListIterator
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Banana")) {
                listIterator.add("Blueberry");
            }
        }
        System.out.println("List after addition: " + list); // Output: [Apple, Banana, Blueberry, Cherry]
        
        // Replacing an element using ListIterator
        listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            if (listIterator.next().equals("Cherry")) {
                listIterator.set("Grape");
            }
        }
        System.out.println("List after replacement: " + list); // Output: [Apple, Banana, Blueberry, Grape]
    }
}
