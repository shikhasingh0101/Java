import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
       
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/output.txt"; 

        BufferedOutputStream bufferedOutputStream = null;

        try {
            
            FileOutputStream fileOutputStream = new FileOutputStream(filePath);

            
            bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

           
            System.out.println("Writing a single byte:");
            bufferedOutputStream.write(65); 
            System.out.println("Byte 'A' written to file.");

            
            System.out.println("Writing a byte array:");
            byte[] byteArray = "Hello, BufferedOutputStream!".getBytes(); 
            bufferedOutputStream.write(byteArray); 
            System.out.println("Byte array written to file.");

          
            System.out.println("Writing a portion of a byte array:");
            byteArray = "This is a portion of the array.".getBytes(); 
            int offset = 5; 
            int length = 10; 
            bufferedOutputStream.write(byteArray, offset, length); 
            System.out.println("Portion of the byte array written to file.");

            
            bufferedOutputStream.flush();
            System.out.println("BufferedOutputStream flushed and closed.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
           
            if (bufferedOutputStream != null) {
                try {
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the bufferedOutputStream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
