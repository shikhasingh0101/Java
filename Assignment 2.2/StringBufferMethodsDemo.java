public class StringBufferMethodsDemo {
    public static void main(String[] args) {
        // Creating a StringBuffer object for demonstration
        StringBuffer sb = new StringBuffer("Hello, World!");

        // 1. int capacity()
        System.out.println("Initial capacity: " + sb.capacity()); // Output the current capacity

        // 2. char charAt(int index)
        System.out.println("Character at index 7: " + sb.charAt(7)); // Output character at index 7

        // 3. StringBuffer delete(int start, int end)
        sb.delete(5, 12); // Delete characters from index 5 to 11
        System.out.println("After delete(5, 12): " + sb);

        // 4. StringBuffer deleteCharAt(int index)
        sb.deleteCharAt(5); // Delete character at index 5
        System.out.println("After deleteCharAt(5): " + sb);

        // 5. void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
        char[] dest = new char[5];
        sb.getChars(0, 5, dest, 0); // Copy characters to the char array
        System.out.print("Get chars (0 to 5): ");
        for (char c : dest) {
            System.out.print(c); // Output copied characters
        }
        System.out.println();

        // 6. int indexOf(String str)
        System.out.println("Index of 'World': " + sb.indexOf("World")); // Find the first occurrence of substring

        // 7. int indexOf(String str, int fromIndex)
        System.out.println("Index of 'World' from index 0: " + sb.indexOf("World", 0)); // Find the first occurrence of substring from index

        // 8. int lastIndexOf(String str)
        System.out.println("Last index of 'World': " + sb.lastIndexOf("World")); // Find the last occurrence of substring

        // 9. int lastIndexOf(String str, int fromIndex)
        System.out.println("Last index of 'World' from index 5: " + sb.lastIndexOf("World", 5)); // Find the last occurrence of substring from index

        // 10. int length()
        System.out.println("Length: " + sb.length()); // Output the length of the StringBuffer

        // 11. StringBuffer replace(int start, int end, String str)
        sb.replace(5, 10, "Universe"); // Replace characters from index 5 to 9 with the specified string
        System.out.println("After replace(5, 10, 'Universe'): " + sb);

        // 12. StringBuffer reverse()
        sb.reverse(); // Reverse the entire sequence
        System.out.println("After reverse(): " + sb);

        // 13. void setCharAt(int index, char ch)
        sb.setCharAt(0, 'H'); // Set character at index 0
        System.out.println("After setCharAt(0, 'H'): " + sb);

        // 14. StringBuffer replace(int start, int end, String str) [Repeated]
        // Already demonstrated as #11

        // 15. StringBuffer reverse() [Repeated]
        // Already demonstrated as #12

        // 16. void setCharAt(int index, char ch) [Repeated]
        // Already demonstrated as #13

        // 17. String substring(int start)
        System.out.println("Substring from index 0: " + sb.substring(0)); // Extract substring from index 0

        // 18. String substring(int start, int end)
        System.out.println("Substring from index 0 to 5: " + sb.substring(0, 5)); // Extract substring from index 0 to 5

        // 19. String toString()
        String str = sb.toString(); // Convert StringBuffer to String
        System.out.println("To String: " + str);
    }
}
