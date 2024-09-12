public class StringBuilderMethodsDemo {
    public static void main(String[] args) {
        // Creating a StringBuilder object for demonstration
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() method for all data types
        sb.append(" World"); // Appending a String
        sb.append(123); // Appending an integer
        sb.append(45.67); // Appending a double
        sb.append(true); // Appending a boolean
        sb.append('!'); // Appending a char
        System.out.println("After append(): " + sb);

        // 2. insert() method for all data types
        sb.insert(5, " Beautiful"); // Inserting a String
        sb.insert(15, 789); // Inserting an integer
        sb.insert(18, 56.78); // Inserting a double
        sb.insert(24, false); // Inserting a boolean
        sb.insert(30, 'X'); // Inserting a char
        System.out.println("After insert(): " + sb);

        // 3. insert(int offset, char[] str)
        char[] chars = {' ', 'G', 'o', 'o', 'd', ' '};
        sb.insert(32, chars); // Inserting char array
        System.out.println("After insert(char[]): " + sb);

        // 4. insert(int index, char[] str, int offset, int len)
        char[] moreChars = {' ', 'D', 'a', 'y'};
        sb.insert(33, moreChars, 1, 3); // Inserting part of char array
        System.out.println("After insert(char[], offset, len): " + sb);

        // 5. insert(int dstOffset, CharSequence s)
        sb.insert(36, "Everyone"); // Inserting CharSequence
        System.out.println("After insert(CharSequence): " + sb);

        // 6. insert(int dstOffset, CharSequence s, int start, int end)
        sb.insert(45, "Nice", 0, 3); // Inserting part of CharSequence
        System.out.println("After insert(CharSequence, start, end): " + sb);

        // 7. insert(int offset, Object obj)
        sb.insert(48, new Object()); // Inserting Object
        System.out.println("After insert(Object): " + sb);

        // 8. replace(int startIndex, int endIndex, String str)
        sb.replace(48, 55, "Object"); // Replacing a substring
        System.out.println("After replace(): " + sb);

        // 9. delete(int startIndex, int endIndex)
        sb.delete(48, 55); // Deleting a substring
        System.out.println("After delete(): " + sb);

        // 10. reverse()
        sb.reverse(); // Reversing the entire string
        System.out.println("After reverse(): " + sb);

        // 11. capacity()
        System.out.println("Capacity: " + sb.capacity()); // Output current capacity

        // 12. ensureCapacity(int minimumCapacity)
        sb.ensureCapacity(100); // Ensuring minimum capacity
        System.out.println("Capacity after ensureCapacity(100): " + sb.capacity());

        // 13. charAt(int index)
        System.out.println("Character at index 0: " + sb.charAt(0)); // Output character at index 0

        // 14. length()
        System.out.println("Length: " + sb.length()); // Output the length of the string

        // 15. substring(int beginIndex)
        System.out.println("Substring from index 5: " + sb.substring(5)); // Extracts substring from index 5

        // 16. substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 5 to 10: " + sb.substring(5, 10)); // Extracts substring from index 5 to 10

        // 17. compareTo(StringBuilder another)
        StringBuilder sb2 = new StringBuilder("AnotherString");
        System.out.println("CompareTo sb2: " + sb.compareTo(sb2)); // Compares this StringBuilder with another

        // 18. getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] dest = new char[5];
        sb.getChars(5, 10, dest, 0); // Copies characters to the char array
        System.out.print("Get chars (5 to 10): ");
        for (char c : dest) {
            System.out.print(c); // Output copied characters
        }
        System.out.println();

        // 19. deleteCharAt(int index)
        sb.deleteCharAt(0); // Deleting character at a specific index
        System.out.println("After deleteCharAt(0): " + sb);

        // 20. lastIndexOf(String str)
        System.out.println("Last index of 'a': " + sb.lastIndexOf("a")); // Finds the last occurrence of a substring

        // 21. lastIndexOf(String str, int fromIndex)
        System.out.println("Last index of 'a' from index 10: " + sb.lastIndexOf("a", 10)); // Finds the last occurrence of a substring from a specific index

        // 22. indexOf(String str)
        System.out.println("Index of 'World': " + sb.indexOf("World")); // Finds the first occurrence of a substring

        // 23. indexOf(String str, int fromIndex)
        System.out.println("Index of 'World' from index 10: " + sb.indexOf("World", 10)); // Finds the first occurrence of a substring from a specific index

        // 24. setCharAt(int index, char ch)
        sb.setCharAt(1, 'Z'); // Setting character at a specific index
        System.out.println("After setCharAt(1, 'Z'): " + sb);

        // 25. toString()
        String str = sb.toString(); // Converting StringBuilder to String
        System.out.println("To String: " + str);
    }
}
