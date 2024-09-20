import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class GenderSelection extends JFrame {
    private JRadioButton maleButton;
    private JRadioButton femaleButton;
    private ButtonGroup genderGroup;

    public GenderSelection() {
        setTitle("Gender Selection");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        maleButton = new JRadioButton("Male");
        femaleButton = new JRadioButton("Female");

        genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);

        add(maleButton);
        add(femaleButton);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ButtonClickListener());

        add(submitButton);

        setVisible(true);
    }

    private class ButtonClickListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (maleButton.isSelected()) {
                JOptionPane.showMessageDialog(null, "You selected Male.");
            } else if (femaleButton.isSelected()) {
                JOptionPane.showMessageDialog(null, "You selected Female.");
            } else {
                JOptionPane.showMessageDialog(null, "Please select a gender.");
            }
        }
    }

    public static void main(String[] args) {
        new GenderSelection();
    }
}
