import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        setTitle("FlowLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        setLayout(new FlowLayout());

       
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");

        
        add(button1);
        add(button2);
        add(button3);
        add(button4);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutExample();
    }
}