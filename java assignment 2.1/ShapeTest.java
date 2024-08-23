abstract class Shape {
    abstract double calculateArea();
    abstract double calculateCircumference();
}

class Circle extends Shape {
    private double radius;

    // No-argument constructor
    public Circle() {
        this.radius = 0.0;
    }

    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class SemiCircle extends Shape {
    private double radius;

    // No-argument constructor
    public SemiCircle() {
        this.radius = 0.0;
    }

    // Parameterized constructor
    public SemiCircle(double radius) {
        this.radius = radius;
    }

    // Getter for radius
    public double getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return 0.5 * Math.PI * radius * radius;
    }

    @Override
    double calculateCircumference() {
        return Math.PI * radius + 2 * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        SemiCircle semiCircle = new SemiCircle(5.0);

        System.out.println("Circle with radius " + circle.getRadius() + ":");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        System.out.println("\nSemiCircle with radius " + semiCircle.getRadius() + ":");
        System.out.println("Area: " + semiCircle.calculateArea());
        System.out.println("Circumference: " + semiCircle.calculateCircumference());
    }
}
