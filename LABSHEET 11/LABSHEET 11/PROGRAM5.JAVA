import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q5 extends JFrame implements ActionListener {

    JTextField name;
    JComboBox<String> course;
    JRadioButton male, female;
    JCheckBox java, python, dbms;
    JButton submit, reset;

    Q5() {
        setTitle("Course Selection Form");
        setSize(350, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Course:"));

        String courses[] = {"BCA", "BBA", "B.Tech", "MCA"};
        course = new JComboBox<>(courses);
        add(course);

        add(new JLabel("Gender:"));

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        add(male);
        add(female);

        add(new JLabel("Subjects:"));

        java = new JCheckBox("Java");
        python = new JCheckBox("Python");
        dbms = new JCheckBox("DBMS");

        add(java);
        add(python);
        add(dbms);

        submit = new JButton("Submit");
        reset = new JButton("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = "";

            if (male.isSelected())
                gender = "Male";
            else if (female.isSelected())
                gender = "Female";

            String subjects = "";

            if (java.isSelected())
                subjects += "Java ";

            if (python.isSelected())
                subjects += "Python ";

            if (dbms.isSelected())
                subjects += "DBMS ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nCourse: " + course.getSelectedItem() +
                "\nGender: " + gender +
                "\nSubjects: " + subjects);
        }

        if (e.getSource() == reset) {
            name.setText("");
            course.setSelectedIndex(0);

            male.setSelected(false);
            female.setSelected(false);

            java.setSelected(false);
            python.setSelected(false);
            dbms.setSelected(false);
        }
    }

    public static void main(String[] args) {
        new Q5();
    }
}