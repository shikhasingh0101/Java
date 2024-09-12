import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/example.txt"; 

        FileInputStream fileInputStream = null;

        try {
           
            fileInputStream = new FileInputStream(filePath);

            
            System.out.println("Reading file byte by byte:");
            int byteData;
            while ((byteData = fileInputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println();

            
            fileInputStream.close();
            fileInputStream = new FileInputStream(filePath);

            
            System.out.println("Reading file into a byte array:");
            byte[] byteArray = new byte[1024]; 
            int bytesRead = fileInputStream.read(byteArray);
            if (bytesRead != -1) {
                System.out.write(byteArray, 0, bytesRead); 
            }
            System.out.println();

            
            fileInputStream.close();
            fileInputStream = new FileInputStream(filePath);

            
            System.out.println("Reading file with offset and length:");
            byteArray = new byte[1024]; 
            int offset = 10; 
            int length = 50; 
            bytesRead = fileInputStream.read(byteArray, offset, length);
            if (bytesRead != -1) {
                System.out.write(byteArray, offset, bytesRead); 
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            
            if (fileInputStream != null) {
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the fileInputStream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
