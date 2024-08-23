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

class BoxColor extends BoxWt {
    String color;

    BoxColor() {
        super();
        color = "undefined";
    }

    BoxColor(double w, double h, double d, double m, String c) {
        super(w, h, d, m);
        color = c;
    }

    BoxColor(BoxColor ob) {
        super(ob);
        color = ob.color;
    }

    void print_BoxColor() {
        print_BoxWt();
        System.out.println("Color: " + color);
    }
}

class BoxColorTest {
    public static void main(String[] args) {
        BoxColor bc = new BoxColor(3, 5, 7, 8.37, "Red");
        bc.print_BoxColor();
    }
}
