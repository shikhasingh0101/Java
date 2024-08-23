abstract class Animal {
   
    abstract void sound();
}

class Lion extends Animal {
    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal cat = new Cat();

        lion.sound();  
        cat.sound();   
    }
}
