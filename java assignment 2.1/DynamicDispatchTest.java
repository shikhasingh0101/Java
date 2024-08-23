class Figure {
    double dim1, dim2;

    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    double area() {
        return 0;
    }
}

class Rectangle extends Figure {
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1 * dim2;
    }
}

class Triangle extends Figure {
    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return 0.5 * dim1 * dim2;
    }
}

public class DynamicDispatchTest {
    public static void main(String[] args) {
        Figure figure;
        
        figure = new Rectangle(10, 20);
        System.out.println("Area of Rectangle: " + figure.area());

        figure = new Triangle(10, 20);
        System.out.println("Area of Triangle: " + figure.area());
    }
}
