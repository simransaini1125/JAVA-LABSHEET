import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q4 extends JFrame implements ActionListener {

    JTextField english, maths, java, dbms, cn;
    JButton calculate;

    Q4() {
        setTitle("Student Marksheet");
        setSize(350, 350);
        setLayout(new FlowLayout());

        add(new JLabel("English:"));
        english = new JTextField(15);
        add(english);

        add(new JLabel("Mathematics:"));
        maths = new JTextField(15);
        add(maths);

        add(new JLabel("Java:"));
        java = new JTextField(15);
        add(java);

        add(new JLabel("DBMS:"));
        dbms = new JTextField(15);
        add(dbms);

        add(new JLabel("Computer Networks:"));
        cn = new JTextField(15);
        add(cn);

        calculate = new JButton("Calculate Result");
        add(calculate);

        calculate.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            int a = Integer.parseInt(english.getText());
            int b = Integer.parseInt(maths.getText());
            int c = Integer.parseInt(java.getText());
            int d = Integer.parseInt(dbms.getText());
            int f = Integer.parseInt(cn.getText());

            if (a < 0 || a > 100 || b < 0 || b > 100 ||
                c < 0 || c > 100 || d < 0 || d > 100 ||
                f < 0 || f > 100) {
                JOptionPane.showMessageDialog(this, "Enter marks between 0 and 100");
                return;
            }

            int total = a + b + c + d + f;
            double percentage = total / 5.0;

            String grade;
            String status;

            if (a < 33 || b < 33 || c < 33 || d < 33 || f < 33) {
                grade = "F";
                status = "Fail";
            }
            else {
                status = "Pass";

                if (percentage >= 90)
                    grade = "A+";
                else if (percentage >= 80)
                    grade = "A";
                else if (percentage >= 70)
                    grade = "B";
                else if (percentage >= 60)
                    grade = "C";
                else if (percentage >= 50)
                    grade = "D";
                else
                    grade = "E";
            }

            JOptionPane.showMessageDialog(this,
                "Total Marks: " + total +
                "\nPercentage: " + percentage + "%" +
                "\nGrade: " + grade +
                "\nStatus: " + status);
        }
        catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Enter valid marks");
        }
    }

    public static void main(String[] args) {
        new Q4();
    }
}