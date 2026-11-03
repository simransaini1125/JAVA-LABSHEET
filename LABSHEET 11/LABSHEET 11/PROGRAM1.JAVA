import java.awt.*;
import java.awt.event.*;

class Q1 extends Frame implements ActionListener {

    TextField name, roll, course;
    Checkbox male, female;
    Choice semester;
    Button submit, reset;

    Q1() {
        setTitle("Student Registration Form");
        setSize(400, 400);
        setLayout(new FlowLayout());

        add(new Label("Student Name:"));
        name = new TextField(20);
        add(name);

        add(new Label("Roll Number:"));
        roll = new TextField(20);
        add(roll);

        add(new Label("Course:"));
        course = new TextField(20);
        add(course);

        add(new Label("Gender:"));
        male = new Checkbox("Male");
        female = new Checkbox("Female");
        add(male);
        add(female);

        add(new Label("Semester:"));
        semester = new Choice();
        semester.add("1");
        semester.add("2");
        semester.add("3");
        semester.add("4");
        semester.add("5");
        semester.add("6");
        add(semester);

        submit = new Button("Submit");
        reset = new Button("Reset");

        add(submit);
        add(reset);

        submit.addActionListener(this);
        reset.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String gender = "";

            if (male.getState())
                gender = "Male";
            else if (female.getState())
                gender = "Female";

            System.out.println("Student Name: " + name.getText());
            System.out.println("Roll Number: " + roll.getText());
            System.out.println("Course: " + course.getText());
            System.out.println("Gender: " + gender);
            System.out.println("Semester: " + semester.getSelectedItem());
        }

        if (e.getSource() == reset) {
            name.setText("");
            roll.setText("");
            course.setText("");
            male.setState(false);
            female.setState(false);
            semester.select(0);
        }
    }

    public static void main(String[] args) {
        new Q1();
    }
}