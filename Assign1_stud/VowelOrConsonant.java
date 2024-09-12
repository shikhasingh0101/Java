import java.util.Scanner;

public class VowelOrConsonant {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a character
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0); // Read the first character of the input

        // Check if the character is a letter
        if (Character.isLetter(ch)) {
            // Convert the character to lowercase for easier comparison
            char lowerCh = Character.toLowerCase(ch);

            // Determine if the character is a vowel or consonant
            switch (lowerCh) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println(ch + " is a vowel.");
                    break;
                default:
                    System.out.println(ch + " is a consonant.");
                    break;
            }
        } else {
            System.out.println(ch + " is not a letter.");
        }

        // Close the scanner
        scanner.close();
    }
}
