import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q3 extends JFrame implements ActionListener {

    JTextField username;
    JPasswordField password;
    JButton login, reset;

    Q3() {
        setTitle("Student Login Form");
        setSize(350, 250);
        setLayout(new FlowLayout());

        add(new JLabel("Username:"));
        username = new JTextField(15);
        add(username);

        add(new JLabel("Password:"));
        password = new JPasswordField(15);
        add(password);

        login = new JButton("Login");
        reset = new JButton("Reset");

        add(login);
        add(reset);

        login.addActionListener(this);
        reset.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login) {
            String user = username.getText();
            String pass = new String(password.getPassword());

            if (user.equals("student") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful");
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
        }

        if (e.getSource() == reset) {
            username.setText("");
            password.setText("");
        }
    }

    public static void main(String[] args) {
        new Q3();
    }
}