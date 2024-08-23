public class ArrayMinMax {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 5, 15, 25}; 

       
        int min = numbers[0];
        int max = numbers[0];

        
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }

        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
    }
}
