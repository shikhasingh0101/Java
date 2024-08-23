class Animal {
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

   
    public Animal() {
        this.vegetarian = false;
        this.food = "Unknown";
        this.numOfLegs = 0;
    }

    
    public Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }


    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    
    public String toString() {
        return "Animal [Vegetarian=" + vegetarian + ", Food=" + food + ", Number of Legs=" + numOfLegs + "]";
    }
}

class Cat extends Animal {
    private String color;

    public Cat() {
        super();
        this.color = "Unknown";
    }

    public Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    
    public String toString() {
        return "Cat [Color=" + color + ", " + super.toString() + "]";
    }
}

class Cow extends Animal {
    private String breed;

    
    public Cow() {
        super();
        this.breed = "Unknown";
    }

    public Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    
    public String toString() {
        return "Cow [Breed=" + breed + ", " + super.toString() + "]";
    }
}

  public class Main {
    public static void main(String[] args) {
      
        Cat cat = new Cat(true, "Milk", 4, "White");
        System.out.println(cat);

      
        Cow cow = new Cow(true, "Grass", 4, "Jersey");
        System.out.println(cow);
    }
}
