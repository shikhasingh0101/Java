public class OddNumbersBetween1And20 {

    public static void main(String[] args) {
        // Print odd numbers between 1 and 20
        System.out.println("Odd numbers between 1 and 20 are:");
        
        for (int i = 1; i <= 20; i++) {
            if (i % 2 != 0) { // Check if the number is odd
                System.out.println(i);
            }
        }
    }
}
