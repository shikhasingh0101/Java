public class ComplexDemo {
    public static void main(String[] args) {
       
        Complex c1 = new Complex();         
        Complex c2 = new Complex(3, 4);     

      
        System.out.println("Initial Complex Numbers:");
        System.out.println("c1: " + c1); 
        System.out.println("c2: " + c2); 

        
        c1.setReal(1.5);
        c1.setImag(2.5);

      
        System.out.println("\nUpdated c1:");
        System.out.println("c1: " + c1); 

    
        Complex sum = c1.add(c2);
        System.out.println("\nSum of c1 and c2:");
        System.out.println("c1 + c2 = " + sum); 
       
        Complex diff = c1.subtract(c2);
        System.out.println("\nDifference of c1 and c2:");
        System.out.println("c1 - c2 = " + diff); 
    }
}
 class Complex {
   
    private double real;
    private double imag;

    
    public Complex() {
        this.real = 0;
        this.imag = 0;
    }

   
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public Complex add(Complex n) {
        double newReal = this.real + n.real;
        double newImag = this.imag + n.imag;
        return new Complex(newReal, newImag);
    }

   
    public Complex subtract(Complex n) {
        double newReal = this.real - n.real;
        double newImag = this.imag - n.imag;
        return new Complex(newReal, newImag);
    }

    
    public void setReal(double real) {
        this.real = real;
    }

   
    public void setImag(double imag) {
        this.imag = imag;
    }

    
    public double getReal() {
        return real;
    }

   
    public double getImag() {
        return imag;
    }

    
    public String toString() {
        return real + " + " + imag + "i";
    }
}
