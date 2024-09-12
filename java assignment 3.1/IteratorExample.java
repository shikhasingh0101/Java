import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        Iterator<String> iterator = list.iterator();
        
        // Forward traversal using Iterator
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Removing an element using Iterator
        iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals("Banana")) {
                iterator.remove();
            }
        }
        System.out.println("List after removal: " + list); // Output: [Apple, Cherry]
    }
}
