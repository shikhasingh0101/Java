import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/input.txt"; 

        BufferedInputStream bufferedInputStream = null;

        try {
            
            FileInputStream fileInputStream = new FileInputStream(filePath);

            
            bufferedInputStream = new BufferedInputStream(fileInputStream);

           
            System.out.println("Reading file byte by byte:");
            int byteData;
            while ((byteData = bufferedInputStream.read()) != -1) {
                System.out.print((char) byteData);
            }
            System.out.println();

            
            bufferedInputStream.close();
            fileInputStream = new FileInputStream(filePath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

            
            System.out.println("Reading file into a byte array:");
            byte[] byteArray = new byte[1024]; 
            int bytesRead = bufferedInputStream.read(byteArray);
            if (bytesRead != -1) {
                System.out.write(byteArray, 0, bytesRead); 
            }
            System.out.println();

            
            bufferedInputStream.close();
            fileInputStream = new FileInputStream(filePath);
            bufferedInputStream = new BufferedInputStream(fileInputStream);

          
            System.out.println("Reading file with offset and length:");
            byteArray = new byte[1024]; 
            int offset = 10; 
            int length = 50; 
            bytesRead = bufferedInputStream.read(byteArray, offset, length);
            if (bytesRead != -1) {
                System.out.write(byteArray, offset, bytesRead); 
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            
            if (bufferedInputStream != null) {
                try {
                    bufferedInputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the bufferedInputStream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
