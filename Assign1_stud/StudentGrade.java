import java.util.Scanner;

public class StudentGrade {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a score
        System.out.print("Enter the student's score (0-100): ");
        int score = scanner.nextInt();

        // Determine the grade using switch case
        char grade;

        // Validate the score range
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
        } else {
            // Use a switch-case statement to determine the grade
            switch (score / 10) {
                case 10:
                case 9:
                    grade = 'A';
                    break;
                case 8:
                    grade = 'B';
                    break;
                case 7:
                    grade = 'C';
                    break;
                case 6:
                    grade = 'D';
                    break;
                case 5:
                    grade = 'E';
                    break;
                default:
                    grade = 'F';
                    break;
            }
            
            // Output the result
            System.out.println("The student's grade is: " + grade);
        }

        // Close the scanner
        scanner.close();
    }
}
