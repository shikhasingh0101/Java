public class Rectangle {
    
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle() {
       
    }

   
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    public float getLength() {
        return length;
    }

    
    public void setLength(float length) {
        this.length = length;
    }

   
    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

   
    public double getPerimeter() {
        return 2 * (length + width);
    }

    
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

   
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        
        System.out.print("Enter the length of the rectangle: ");
        float userLength = scanner.nextFloat();

        System.out.print("Enter the width of the rectangle: ");
        float userWidth = scanner.nextFloat();

        
        Rectangle rectangle = new Rectangle(userLength, userWidth);

        
        System.out.println("\nRectangle Details:");
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println("String Representation: " + rectangle.toString());

        
        scanner.close();
    }
}
