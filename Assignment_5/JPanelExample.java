import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelExample extends JFrame {
    public JPanelExample() {
        setTitle("JPanel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        
        JPanel panel = new JPanel();

        panel.setLayout(new FlowLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");

        
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);

       
        add(panel);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new JPanelExample();
    }
}