import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ImageCopyExample {
    public static void main(String[] args) {
        
        String sourceFilePath = "/Users/shikhasingh/Desktop/Assignment 3.2/sourceImage.jpg";
        String destinationFilePath = "/Users/shikhasingh/Desktop/Assignment 3.2/destinationImage.jpg";

        InputStream inputStream = null;
        OutputStream outputStream = null;

        try {
            
            inputStream = new FileInputStream(sourceFilePath);
            outputStream = new FileOutputStream(destinationFilePath);

           
            byte[] buffer = new byte[1024];
            int bytesRead;

            
            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("Image copied successfully!");

        } catch (IOException e) {
            System.out.println("An error occurred while copying the image file.");
            e.printStackTrace();
        } finally {
            
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the input stream.");
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the output stream.");
                    e.printStackTrace();
                }
            }
        }
    }
}
