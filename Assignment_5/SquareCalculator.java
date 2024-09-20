import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SquareCalculator extends JFrame {
    private JTextField inputField;
    private JTextField resultField;

    public SquareCalculator() {
        setTitle("Square Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(2, 2));

        inputField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        inputPanel.add(new JLabel("Enter number: "));
        inputPanel.add(inputField);
        inputPanel.add(new JLabel("Square: "));
        inputPanel.add(resultField);

        add(inputPanel, BorderLayout.CENTER);

        JButton calculateButton = new JButton("Calculate Square");
        calculateButton.addActionListener(new ButtonClickListener());

        add(calculateButton, BorderLayout.SOUTH);
        
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                double number = Double.parseDouble(inputField.getText());
                double square = number * number;
                resultField.setText(String.valueOf(square));
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        new SquareCalculator();
    }
}
