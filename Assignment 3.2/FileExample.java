import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        // 1. Creating File object using absolute path
        File file1 = new File("C:/example/testfile.txt");
        
        // 2. Creating File object using relative path
        File file2 = new File("testfile.txt");
        
        // 3. Creating File object using directory and file name
        File file3 = new File("C:/example", "testfile.txt");
        
        // 4. Creating File object using parent File object and file name
        File parentDir = new File("C:/example");
        File file4 = new File(parentDir, "testfile.txt");
        
        // Display file paths
        System.out.println("File1 Path: " + file1.getPath());
        System.out.println("File2 Path: " + file2.getPath());
        System.out.println("File3 Path: " + file3.getPath());
        System.out.println("File4 Path: " + file4.getPath());
        
        // Checking if file exists
        System.out.println("File1 exists: " + file1.exists());
        
        // Creating a new file
        try {
            if (file2.createNewFile()) {
                System.out.println("File2 was created successfully.");
            } else {
                System.out.println("File2 already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating File2.");
            e.printStackTrace();
        }
        
        // Checking if it is a directory
        System.out.println("File1 is a directory: " + file1.isDirectory());
        
        // Checking if it is a file
        System.out.println("File1 is a file: " + file1.isFile());
        
        // Getting file size
        System.out.println("File2 size: " + file2.length() + " bytes");
        
        // Renaming the file
        File renamedFile = new File("testfile_renamed.txt");
        if (file2.renameTo(renamedFile)) {
            System.out.println("File2 was renamed to testfile_renamed.txt");
        } else {
            System.out.println("Renaming failed.");
        }
        
        // Deleting the file
        if (renamedFile.delete()) {
            System.out.println("Renamed file was deleted successfully.");
        } else {
            System.out.println("Failed to delete the renamed file.");
        }
        
        // Creating a directory
        File directory = new File("C:/example/newDirectory");
        if (directory.mkdirs()) {
            System.out.println("Directory was created successfully.");
        } else {
            System.out.println("Directory already exists or creation failed.");
        }
        
        // Listing files in a directory
        File dir = new File("C:/example");
        if (dir.isDirectory()) {
            String[] files = dir.list();
            if (files != null) {
                System.out.println("Files in the directory:");
                for (String fileName : files) {
                    System.out.println(fileName);
                }
            }
        }
    }
}
