
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}


class Dog extends Animal {
    
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another subclass
class Cat extends Animal {
   
    void sound() {
        System.out.println("Cat meows");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        
        Animal myAnimal;

        
        myAnimal = new Dog();
        myAnimal.sound();  
        myAnimal = new Cat();
        myAnimal.sound();  
        myAnimal = new Animal();
        myAnimal.sound(); 
    }
}
