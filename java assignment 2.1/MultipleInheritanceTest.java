interface Figure {
    double PI = 3.14159;
    
    double area();
    double perimeter();
}

interface Draw {
    void draw_shape();
}

class Circle implements Figure, Draw {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public void draw_shape() {
        System.out.println("Drawing a Circle with radius: " + radius);
    }
}

class Rectangle implements Figure, Draw {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public void draw_shape() {
        System.out.println("Drawing a Rectangle with length: " + length + " and width: " + width);
    }
}

public class MultipleInheritanceTest {
    public static void main(String[] args) {
        Figure figure;
        Draw draw;
        
        figure = new Circle(5);
        draw = (Draw) figure;
        System.out.println("Circle Area: " + figure.area());
        System.out.println("Circle Perimeter: " + figure.perimeter());
        draw.draw_shape();

        figure = new Rectangle(10, 20);
        draw = (Draw) figure;
        System.out.println("Rectangle Area: " + figure.area());
        System.out.println("Rectangle Perimeter: " + figure.perimeter());
        draw.draw_shape();
    }
}
