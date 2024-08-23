import java.util.Scanner; 

public class Circle {
   
    private double radius;

    
    public Circle() {
        this.radius = 1.0;
    }

   
    public Circle(double radius) {
        this.radius = radius;
    }

    
    public double getRadius() {
        return this.radius;
    }

   
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the radius of the circle: ");
        double inputRadius = scanner.nextDouble();

        
        Circle circle = new Circle(inputRadius);

        
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        
        scanner.close();
    }
}
