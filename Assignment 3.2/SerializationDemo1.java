import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo1 {
    public static void main(String[] args) {
        String filePath = "employee.ser";

        
        Address address = new Address("1234 Elm St", "Downtown", "Springfield", "USA");

        
        Employee employee = new Employee(1, "Alice", address, "E123", "HR", "Manager");

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(employee);
            System.out.println("Employee object serialized to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Employee deserializedEmployee = (Employee) ois.readObject();
            System.out.println("Deserialized Employee object: " + deserializedEmployee);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}
