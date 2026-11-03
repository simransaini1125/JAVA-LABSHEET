import java.awt.*;
import java.awt.event.*;

class Q6 extends Frame implements ActionListener {

    TextField id, name, designation, salary;
    TextArea output;
    Choice department;
    Checkbox male, female;
    CheckboxGroup gender;
    Button submit, clear;

    Q6() {
        setTitle("Employee Registration");
        setSize(400, 500);
        setLayout(new FlowLayout());

        add(new Label("Employee ID:"));
        id = new TextField(20);
        add(id);

        add(new Label("Employee Name:"));
        name = new TextField(20);
        add(name);

        add(new Label("Department:"));
        department = new Choice();
        department.add("IT");
        department.add("HR");
        department.add("Finance");
        department.add("Sales");
        add(department);

        add(new Label("Designation:"));
        designation = new TextField(20);
        add(designation);

        add(new Label("Salary:"));
        salary = new TextField(20);
        add(salary);

        add(new Label("Gender:"));

        gender = new CheckboxGroup();
        male = new Checkbox("Male", gender, false);
        female = new Checkbox("Female", gender, false);

        add(male);
        add(female);

        submit = new Button("Submit");
        clear = new Button("Clear");

        add(submit);
        add(clear);

        output = new TextArea(8, 35);
        add(output);

        submit.addActionListener(this);
        clear.addActionListener(this);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submit) {
            String g = "";

            if (gender.getSelectedCheckbox() != null)
                g = gender.getSelectedCheckbox().getLabel();

            output.setText(
                "Employee ID: " + id.getText() +
                "\nName: " + name.getText() +
                "\nDepartment: " + department.getSelectedItem() +
                "\nDesignation: " + designation.getText() +
                "\nSalary: " + salary.getText() +
                "\nGender: " + g);
        }

        if (e.getSource() == clear) {
            id.setText("");
            name.setText("");
            designation.setText("");
            salary.setText("");
            gender.setSelectedCheckbox(null);
            department.select(0);
            output.setText("");
        }
    }

    public static void main(String[] args) {
        new Q6();
    }
}