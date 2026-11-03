import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q9 extends JFrame implements ActionListener {

    JTextField name, roll, course;
    JRadioButton excellent, veryGood, good, average, poor;
    JCheckBox teaching, lab, material, assignments;
    JTextArea comments;
    JButton submit, reset;

    Q9() {
        setTitle("Student Feedback Form");
        setSize(450, 550);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        name = new JTextField(20);
        add(name);

        add(new JLabel("Roll Number:"));
        roll = new JTextField(20);
        add(roll);

        add(new JLabel("Course:"));
        course = new JTextField(20);
        add(course);

        add(new JLabel("Rating:"));

        excellent = new JRadioButton("Excellent");
        veryGood = new JRadioButton("Very Good");
        good = new JRadioButton("Good");
        average = new JRadioButton("Average");
        poor = new JRadioButton("Poor");

        ButtonGroup bg = new ButtonGroup();

        bg.add(excellent);
        bg.add(veryGood);
        bg.add(good);
        bg.add(average);
        bg.add(poor);

        add(excellent);
        add(veryGood);
        add(good);
        add(average);
        add(poor);

        add(new JLabel("Feedback:"));

        teaching = new JCheckBox("Teaching");
        lab = new JCheckBox("Laboratory");
        material = new JCheckBox("Course Material");
        assignments = new JCheckBox("Assignments");

        add(teaching);
        add(lab);
        add(material);
        add(assignments);

        add(new JLabel("Comments:"));

        comments = new JTextArea(5, 25);
        add(comments);

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
            String rating = "";

            if (excellent.isSelected())
                rating = "Excellent";
            else if (veryGood.isSelected())
                rating = "Very Good";
            else if (good.isSelected())
                rating = "Good";
            else if (average.isSelected())
                rating = "Average";
            else if (poor.isSelected())
                rating = "Poor";

            String feedback = "";

            if (teaching.isSelected())
                feedback += "Teaching ";

            if (lab.isSelected())
                feedback += "Laboratory ";

            if (material.isSelected())
                feedback += "Course Material ";

            if (assignments.isSelected())
                feedback += "Assignments ";

            JOptionPane.showMessageDialog(this,
                "Name: " + name.getText() +
                "\nRoll Number: " + roll.getText() +
                "\nCourse: " + course.getText() +
                "\nRating: " + rating +
                "\nFeedback: " + feedback +
                "\nComments: " + comments.getText());
        }

        if (e.getSource() == reset) {
            name.setText("");
            roll.setText("");
            course.setText("");

            excellent.setSelected(false);
            veryGood.setSelected(false);
            good.setSelected(false);
            average.setSelected(false);
            poor.setSelected(false);

            teaching.setSelected(false);
            lab.setSelected(false);
            material.setSelected(false);
            assignments.setSelected(false);

            comments.setText("");
        }
    }

    public static void main(String[] args) {
        new Q9();
    }
}