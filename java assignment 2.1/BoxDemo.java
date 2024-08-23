
class Box {
    double width, height, depth;

   
    Box() {
        width = height = depth = 0;
    }

    
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

   
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    
    double volume() {
        return width * height * depth;
    }

    
    void print_Box() {
        System.out.println("Dimensions are: " + width + " x " + height + " x " + depth);
    }
}

class BoxWt extends Box {
    double weight;

  
    BoxWt() {
        super();
        weight = 0;
    }

    
    BoxWt(double w, double h, double d, double m) {
        super(w, h, d); 
        weight = m;
    }

 
    BoxWt(BoxWt ob) {
        super(ob); 
        weight = ob.weight;
    }

   
    void print_BoxWt() {
        print_Box(); 
        System.out.println("Weight: " + weight);
    }
}


public class  BoxDemo {
    public static void main(String[] args) {
        
        BoxWt bw1 = new BoxWt();
        BoxWt bw2 = new BoxWt(3, 5, 7, 8.37);
        BoxWt bw3 = new BoxWt(bw2);

       
        System.out.println("BoxWt 1:");
        bw1.print_BoxWt();

        System.out.println("\nBoxWt 2:");
        bw2.print_BoxWt();

        System.out.println("\nBoxWt 3 (Copy of BoxWt 2):");
        bw3.print_BoxWt();
    }
}
