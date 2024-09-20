import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArithmeticCalculator extends JFrame {
    private JTextField inputField1;
    private JTextField inputField2;
    private JTextField resultField;
    private double num1, num2, result;
    private String operator;

    public ArithmeticCalculator() {
        setTitle("Arithmetic Calculator");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2));

        inputField1 = new JTextField();
        inputField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        inputPanel.add(new JLabel("Input 1: "));
        inputPanel.add(inputField1);
        inputPanel.add(new JLabel("Input 2: "));
        inputPanel.add(inputField2);
        inputPanel.add(new JLabel("Result: "));
        inputPanel.add(resultField);

        add(inputPanel, BorderLayout.NORTH);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(5, 2));

        String[] buttonLabels = {"+", "-", "*", "/", "%", "CLEAR", "=", "0", "1", "2"};
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.addActionListener(new ButtonClickListener());
            buttonPanel.add(button);
        }

        add(buttonPanel, BorderLayout.CENTER);
        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();

            if (command.equals("CLEAR")) {
                inputField1.setText("");
                inputField2.setText("");
                resultField.setText("");
                return;
            }

            if (command.equals("=")) {
                try {
                    num2 = Double.parseDouble(inputField2.getText());
                    calculateResult();
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid input!");
                }
                return;
            }

            try {
                num1 = Double.parseDouble(inputField1.getText());
                operator = command;
                inputField1.setText(""); // Clear first input for new calculation
                inputField2.setText(""); // Clear second input for new input
            } catch (NumberFormatException ex) {
                resultField.setText("Invalid input!");
            }
        }

        private void calculateResult() {
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        resultField.setText("Cannot divide by zero!");
                        return;
                    }
                    break;
                case "%":
                    result = num1 % num2;
                    break;
                default:
                    resultField.setText("Select an operator!");
                    return;
            }
            resultField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        new ArithmeticCalculator();
    }
}
