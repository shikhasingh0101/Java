import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/output.txt"; 

        FileOutputStream fileOutputStream = null;

        try {
            
            fileOutputStream = new FileOutputStream(filePath);

            
            System.out.println("Writing a single byte:");
            fileOutputStream.write(65);
            System.out.println("Byte 'A' written to file.");

            
            System.out.println("Writing a byte array:");
            byte[] byteArray = "Hello, FileOutputStream!".getBytes(); 
            fileOutputStream.write(byteArray); 
            System.out.println("Byte array written to file.");

            
            System.out.println("Writing a portion of a byte array:");
            byteArray = "This is a portion of the array.".getBytes(); 
            int offset = 5; 
            int length = 10; 
            fileOutputStream.write(byteArray, offset, length); 
            System.out.println("Portion of the byte array written to file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the fileOutputStream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
