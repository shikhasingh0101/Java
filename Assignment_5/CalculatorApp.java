import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculatorApp {
    public static void main(String[] args) {
        
        JFrame f = new JFrame("Simple Calculator");

       
        JLabel label1 = new JLabel("First Number:");
        label1.setBounds(50, 30, 100, 20);
        JLabel label2 = new JLabel("Second Number:");
        label2.setBounds(50, 70, 100, 20);
        JLabel labelResult = new JLabel("Result:");
        labelResult.setBounds(50, 150, 100, 20);

        
        JTextField tf1 = new JTextField();
        tf1.setBounds(150, 30, 150, 20);
        JTextField tf2 = new JTextField();
        tf2.setBounds(150, 70, 150, 20);

        
        JTextField tfResult = new JTextField();
        tfResult.setBounds(150, 150, 150, 20);
        tfResult.setEditable(false); 

        
        JButton btnAdd = new JButton("Add");
        btnAdd.setBounds(50, 110, 75, 30);
        JButton btnSubtract = new JButton("Subtract");
        btnSubtract.setBounds(130, 110, 100, 30);
        JButton btnReset = new JButton("Reset");
        btnReset.setBounds(240, 110, 75, 30);

       
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
                 
                    int sum = num1 + num2;
                    
                    tfResult.setText(String.valueOf(sum));
                } catch (NumberFormatException ex) {
                    tfResult.setText("Invalid Input");
                }
            }
        });

        
        btnSubtract.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    int num1 = Integer.parseInt(tf1.getText());
                    int num2 = Integer.parseInt(tf2.getText());
               
                    int diff = num1 - num2;
                    
                    tfResult.setText(String.valueOf(diff));
                } catch (NumberFormatException ex) {
                    tfResult.setText("Invalid Input");
                }
            }
        });

        
        btnReset.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
               
                tf1.setText("");
                tf2.setText("");
                tfResult.setText("");
            }
        });

        
        f.add(label1);
        f.add(label2);
        f.add(tf1);
        f.add(tf2);
        f.add(labelResult);
        f.add(tfResult);
        f.add(btnAdd);
        f.add(btnSubtract);
        f.add(btnReset);

        f.setSize(400, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
