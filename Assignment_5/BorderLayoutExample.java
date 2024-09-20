import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       
        setLayout(new BorderLayout());

        
        JLabel northLabel = new JLabel("North");
        JLabel westLabel = new JLabel("West");
        JLabel centerLabel = new JLabel("Center");
        JLabel eastLabel = new JLabel("East");
        JLabel southLabel = new JLabel("South");

        
        add(northLabel, BorderLayout.NORTH);
        add(westLabel, BorderLayout.WEST);
        add(centerLabel, BorderLayout.CENTER);
        add(eastLabel, BorderLayout.EAST);
        add(southLabel, BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutExample();
    }
}