import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        String filePath = "cat.ser";

        
        Cat myCat = new Cat("Black", "Siamese", 5, "USA", "John Doe");

        
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(myCat);
            System.out.println("Cat object serialized to " + filePath);
        } catch (IOException e) {
            System.out.println("An error occurred during serialization.");
            e.printStackTrace();
        }

        
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            Cat deserializedCat = (Cat) ois.readObject();
            System.out.println("Deserialized Cat object: " + deserializedCat);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred during deserialization.");
            e.printStackTrace();
        }
    }
}
