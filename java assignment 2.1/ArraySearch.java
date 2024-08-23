public class ArraySearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; 
        int target = 30; 
        boolean found = false;

       
        for (int number : numbers) {
            if (number == target) {
                found = true;
                break; 
            }
        }

        if (found) {
            System.out.println("Element " + target + " is present in the array.");
        } else {
            System.out.println("Element " + target + " is not present in the array.");
        }
    }
}
