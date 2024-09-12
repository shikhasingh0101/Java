import java.io.Serializable;

public class Cat implements Serializable {
    private static final long serialVersionUID = 1L; 
    private String color;
    private String breed;
    private int age;
    private transient String country; 
    private static String ownerName; 

    
    public Cat(String color, String breed, int age, String country, String ownerName) {
        this.color = color;
        this.breed = breed;
        this.age = age;
        this.country = country;
        Cat.ownerName = ownerName; 
    }

   
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public static String getOwnerName() {
        return ownerName;
    }

    public static void setOwnerName(String ownerName) {
        Cat.ownerName = ownerName;
    }

    
    public String toString() {
        return "Cat [color=" + color + ", breed=" + breed + ", age=" + age + 
               ", country=" + country + ", ownerName=" + ownerName + "]";
    }
}
