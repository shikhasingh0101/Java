 class Geometry {

   
    public double calculateArea(double side) {
        return side * side;
    }

    
    public double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0;
    }

   
    public double calculateArea(double length, double width) {
        return length * width;
    }
}
public class GeometryDemo {
    public static void main(String[] args) {
        Geometry geometry = new Geometry();

      
        double squareArea = geometry.calculateArea(5);
        System.out.println("Area of the square: " + squareArea);

        double circleArea = geometry.calculateArea(7, true);
        System.out.println("Area of the circle: " + circleArea);

    
        double rectangleArea = geometry.calculateArea(4, 8);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}
