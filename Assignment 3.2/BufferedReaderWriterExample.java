import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExample {
    public static void main(String[] args) {
        String inputFilePath = "/Users/shikhasingh/Desktop/Assignment 3.2/input.txt";
        String outputFilePath = "/Users/shikhasingh/Desktop/Assignment 3.2/output.txt";

        
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFilePath))) {
            System.out.println("Reading from file using BufferedReader:");
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); 
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFilePath))) {
            System.out.println("Writing to file using BufferedWriter:");
            bufferedWriter.write("Hello, BufferedWriter!"); 
            bufferedWriter.newLine(); 
            bufferedWriter.write("This is a new line in the file."); 
            bufferedWriter.newLine(); 
            bufferedWriter.write("BufferedWriter makes writing efficient."); 
            System.out.println("Data written to file successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
