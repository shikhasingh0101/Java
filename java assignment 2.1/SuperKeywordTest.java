class Animal {
    String name = "Generic Animal";

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void display() {
        System.out.println("Name in Animal class: " + super.name);  

        sound();               
        super.sound();          
    }
}

public class SuperKeywordTest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
    }
}
