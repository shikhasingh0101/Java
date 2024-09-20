import javax.swing.JFrame;


class CustomFrame extends JFrame {
    public CustomFrame() {
        setTitle("Frame Using Inheritance");
        setSize(400, 300); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setVisible(true); 
    }
}

public class InheritanceFrameApp {
    public static void main(String[] args) {
       
        CustomFrame customFrame = new CustomFrame();
    }
}
