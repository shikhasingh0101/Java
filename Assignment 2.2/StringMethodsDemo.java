public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // 1. int length()
        System.out.println("Length: " + str.length()); // Output: 13

        // 2. char charAt(int index)
        System.out.println("Character at index 7: " + str.charAt(7)); // Output: W

        // 3. int indexOf(int ch)
        System.out.println("Index of 'W': " + str.indexOf('W')); // Output: 7

        // 4. int indexOf(int ch, int fromIndex)
        System.out.println("Index of 'o' from index 5: " + str.indexOf('o', 5)); // Output: 8

        // 5. int indexOf(String substring)
        System.out.println("Index of 'World': " + str.indexOf("World")); // Output: 7

        // 6. int indexOf(String substring, int fromIndex)
        System.out.println("Index of 'o' from index 5: " + str.indexOf("o", 5)); // Output: 8

        // 7. int lastIndexOf(String substring)
        System.out.println("Last index of 'o': " + str.lastIndexOf('o')); // Output: 8

        // 8. String substring(int beginIndex)
        System.out.println("Substring from index 7: " + str.substring(7)); // Output: World!

        // 9. String substring(int beginIndex, int endIndex)
        System.out.println("Substring from index 7 to 12: " + str.substring(7, 12)); // Output: World

        // 10. boolean contains(CharSequence s)
        System.out.println("Contains 'World': " + str.contains("World")); // Output: true

        // 11. String concat(String s)
        System.out.println("Concatenation with ' How are you?': " + str.concat(" How are you?")); // Output: Hello, World! How are you?

        // 12. boolean equals(Object o)
        System.out.println("Equals 'Hello, World!': " + str.equals("Hello, World!")); // Output: true

        // 13. boolean equalsIgnoreCase(String s)
        System.out.println("EqualsIgnoreCase 'HELLO, WORLD!': " + str.equalsIgnoreCase("HELLO, WORLD!")); // Output: true

        // 14. boolean isEmpty()
        System.out.println("Is empty: " + str.isEmpty()); // Output: false

        // 15. boolean equals(Object o) [Repeated]
        // Already demonstrated as #12

        // 16. boolean equalsIgnoreCase(String s) [Repeated]
        // Already demonstrated as #13

        // 17. String toLowerCase()
        System.out.println("Lower case: " + str.toLowerCase()); // Output: hello, world!

        // 18. String toUpperCase()
        System.out.println("Upper case: " + str.toUpperCase()); // Output: HELLO, WORLD!

        // 19. int compareTo(String anotherString)
        System.out.println("Compare to 'Hello, World!': " + str.compareTo("Hello, World!")); // Output: 0

        // 20. int compareToIgnoreCase(String anotherString)
        System.out.println("CompareToIgnoreCase 'HELLO, WORLD!': " + str.compareToIgnoreCase("HELLO, WORLD!")); // Output: 0

        // 21. String trim()
        String strWithSpaces = "  Hello, World!  ";
        System.out.println("Trimmed: '" + strWithSpaces.trim() + "'"); // Output: 'Hello, World!'

        // 22. String replace(char oldChar, char newChar)
        System.out.println("Replace 'o' with '0': " + str.replace('o', '0')); // Output: Hell0, W0rld!

        // 23. char[] toCharArray()
        char[] chars = str.toCharArray();
        System.out.print("To char array: ");
        for (char c : chars) {
            System.out.print(c + " "); // Output: H e l l o ,   W o r l d ! 
        }
        System.out.println();

        // 24. boolean startsWith(String s)
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello")); // Output: true

        // 25. boolean endsWith(String s)
        System.out.println("Ends with 'World!': " + str.endsWith("World!")); // Output: true

        // 26. static String join(CharSequence delim, CharSequence... strs)
        System.out.println("Join 'A', 'B', 'C' with ', ': " + String.join(", ", "A", "B", "C")); // Output: A, B, C

        // 27. byte[] getBytes()
        byte[] bytes = str.getBytes();
        System.out.print("Bytes: ");
        for (byte b : bytes) {
            System.out.print(b + " "); // Output: bytes corresponding to the characters in the string
        }
        System.out.println();

        // 28. public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] destination = new char[5];
        str.getChars(7, 12, destination, 0);
        System.out.print("Get chars (7 to 12): ");
        for (char c : destination) {
            System.out.print(c); // Output: World
        }
        System.out.println();
    }
}
