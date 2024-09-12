import java.io.FileInputStream;
import java.io.IOException;

public class StreamMethodsExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/input.txt";

        FileInputStream fileInputStream = null;

        try {
            
            fileInputStream = new FileInputStream(filePath);

            
            if (fileInputStream.markSupported()) {
                System.out.println("The stream supports mark and reset.");

                
                byte[] buffer = new byte[10];
                fileInputStream.read(buffer);
                System.out.println("Read bytes: " + new String(buffer));

                
                fileInputStream.mark(20); 

                
                fileInputStream.read(buffer);
                System.out.println("Read more bytes: " + new String(buffer));

                
                fileInputStream.skip(5);
                System.out.println("Skipped 5 bytes.");

                
                fileInputStream.read(buffer);
                System.out.println("Read bytes after skipping: " + new String(buffer));

                
                fileInputStream.reset();
                System.out.println("Stream reset to the marked position.");

               
                fileInputStream.read(buffer);
                System.out.println("Read bytes after reset: " + new String(buffer));
                
            } else {
                System.out.println("The stream does not support mark and reset.");
            }

        } catch (IOException e) {
            System.out.println("An error occurred while processing the file.");
            e.printStackTrace();
        } finally {
            
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the FileInputStream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
