import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxExample extends JFrame implements ItemListener {
    private JCheckBox checkBox1, checkBox2;
    private JLabel label;

    public CheckBoxExample() {
        setTitle("Checkbox Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        
        checkBox1 = new JCheckBox("C++");
        checkBox2 = new JCheckBox("Java");

       
        add(checkBox1);
        add(checkBox2);

        
        label = new JLabel();
        add(label);

        
        checkBox1.addItemListener(this);
        checkBox2.addItemListener(this);

        pack();
        setVisible(true);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
       
        boolean option1Selected = checkBox1.isSelected();
        boolean option2Selected = checkBox2.isSelected();

        
        if (option1Selected && option2Selected) {
            label.setText("Both options are selected.");
        } else if (option1Selected) {
            label.setText("C++ Checkbox: cheked");
        } else if (option2Selected) {
            label.setText("\"Java Checkbox: cheked");
        } else {
            label.setText("No options are selected.");
        }
    }

    public static void main(String[] args) {
        new CheckBoxExample();
    }
}