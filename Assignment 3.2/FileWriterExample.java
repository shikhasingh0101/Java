import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/output.txt";

        FileWriter fileWriter = null;

        try {
            
            fileWriter = new FileWriter(filePath);

            
            System.out.println("Writing a single character:");
            fileWriter.write('A'); 
            System.out.println("Character 'A' written to file.");

            
            System.out.println("Writing a character array:");
            char[] charArray = "Hello, FileWriter!".toCharArray(); 
            fileWriter.write(charArray); 
            System.out.println("Character array written to file.");

            
            System.out.println("Writing a portion of a character array:");
            charArray = "This is a portion of the array.".toCharArray(); 
            int offset = 5; 
            int length = 10; 
            fileWriter.write(charArray, offset, length); 
            System.out.println("Portion of the character array written to file.");

            
            System.out.println("Writing a string:");
            fileWriter.write("This is a string written to the file."); 
            System.out.println("String written to file.");

          
            fileWriter.close();
            System.out.println("FileWriter closed.");

           
            fileWriter = new FileWriter(filePath, true); 

            
            System.out.println("Appending a string:");
            fileWriter.write("\nThis string is appended to the file."); 
            System.out.println("String appended to file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
           
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the FileWriter.");
                    e.printStackTrace();
                }
            }
        }
    }
}
