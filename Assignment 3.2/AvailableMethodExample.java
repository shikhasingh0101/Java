import java.io.FileInputStream;
import java.io.IOException;

public class AvailableMethodExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/input.txt";

        FileInputStream fileInputStream = null;

        try {
            
            fileInputStream = new FileInputStream(filePath);

            
            int availableBytes = fileInputStream.available();
            System.out.println("Number of bytes available to read: " + availableBytes);

            
            byte[] buffer = new byte[availableBytes];
            int bytesRead = fileInputStream.read(buffer);
            System.out.println("Bytes read: " + bytesRead);
            System.out.println("File content:");
            System.out.write(buffer, 0, bytesRead);
            System.out.println();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
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
