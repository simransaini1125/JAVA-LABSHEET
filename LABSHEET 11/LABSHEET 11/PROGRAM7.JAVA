import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q7 extends JFrame implements ActionListener {

    JTextField temp;
    JRadioButton ctof, ftoc;
    JButton convert, clear;
    JLabel result;

    Q7() {
        setTitle("Temperature Converter");
        setSize(350, 300);
        setLayout(new FlowLayout());

        add(new JLabel("Enter Temperature:"));

        temp = new JTextField(15);
        add(temp);

        ctof = new JRadioButton("Celsius to Fahrenheit");
        ftoc = new JRadioButton("Fahrenheit to Celsius");

        ButtonGroup bg = new ButtonGroup();
        bg.add(ctof);
        bg.add(ftoc);

        add(ctof);
        add(ftoc);

        convert = new JButton("Convert");
        clear = new JButton("Clear");

        add(convert);
        add(clear);

        result = new JLabel("Result: ");
        add(result);

        convert.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == convert) {
            try {
                double t = Double.parseDouble(temp.getText());
                double ans;

                if (ctof.isSelected()) {
                    ans = (t * 9 / 5) + 32;
                    result.setText("Fahrenheit: " + ans);
                }
                else if (ftoc.isSelected()) {
                    ans = (t - 32) * 5 / 9;
                    result.setText("Celsius: " + ans);
                }
                else {
                    result.setText("Select conversion type");
                }
            }
            catch (NumberFormatException ex) {
                result.setText("Enter valid temperature");
            }
        }

        if (e.getSource() == clear) {
            temp.setText("");
            result.setText("Result: ");
            ctof.setSelected(false);
            ftoc.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q7();
    }
}