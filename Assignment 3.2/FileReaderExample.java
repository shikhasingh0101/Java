import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        
        String filePath = "/Users/shikhasingh/Desktop/Assignment 3.2/example.txt";

        FileReader fileReader = null;

        try {
           
            fileReader = new FileReader(filePath);

            
            System.out.println("Reading file character by character:");
            int charData;
            while ((charData = fileReader.read()) != -1) {
                System.out.print((char) charData); 
            }
            System.out.println(); 

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("An error occurred while closing the FileReader.");
                    e.printStackTrace();
                }
            }
        }
    }
}
