import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CounterApp extends JFrame {
    private int count = 0; 
    private JLabel label; 
    private JButton button; 

    public CounterApp() {
        setTitle("Counter Application");
        setSize(300, 200); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLayout(null); 

        label = new JLabel("Count: " + count);
        label.setBounds(100, 50, 100, 30); 
        add(label);

        button = new JButton("Count");
        button.setBounds(100, 100, 100, 30); 
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++; 
                label.setText("Count: " + count); 
            }
        });
        add(button); 

        setVisible(true); 
    }

    public static void main(String[] args) {
        new CounterApp(); 
    }
}
