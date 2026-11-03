import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Q10 extends JFrame implements ActionListener {

    JTextField account, name, balance, amount;
    JButton deposit, withdraw, check, clear;

    Q10() {
        setTitle("Mini Banking Application");
        setSize(350, 400);
        setLayout(new FlowLayout());

        add(new JLabel("Account Number:"));
        account = new JTextField(15);
        add(account);

        add(new JLabel("Customer Name:"));
        name = new JTextField(15);
        add(name);

        add(new JLabel("Current Balance:"));
        balance = new JTextField(15);
        add(balance);

        add(new JLabel("Amount:"));
        amount = new JTextField(15);
        add(amount);

        deposit = new JButton("Deposit");
        withdraw = new JButton("Withdraw");
        check = new JButton("Check Balance");
        clear = new JButton("Clear");

        add(deposit);
        add(withdraw);
        add(check);
        add(clear);

        deposit.addActionListener(this);
        withdraw.addActionListener(this);
        check.addActionListener(this);
        clear.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == clear) {
            account.setText("");
            name.setText("");
            balance.setText("");
            amount.setText("");
        }

        else if (e.getSource() == deposit) {
            try {
                double b = Double.parseDouble(balance.getText());
                double a = Double.parseDouble(amount.getText());

                if (b < 0 || a <= 0) {
                    JOptionPane.showMessageDialog(this, "Enter valid amounts");
                    return;
                }

                b = b + a;
                balance.setText(String.valueOf(b));

                JOptionPane.showMessageDialog(this, "Amount Deposited Successfully");
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid numbers");
            }
        }

        else if (e.getSource() == withdraw) {
            try {
                double b = Double.parseDouble(balance.getText());
                double a = Double.parseDouble(amount.getText());

                if (b < 0 || a <= 0) {
                    JOptionPane.showMessageDialog(this, "Enter valid amounts");
                    return;
                }

                if (a <= b) {
                    b = b - a;
                    balance.setText(String.valueOf(b));

                    JOptionPane.showMessageDialog(this, "Amount Withdrawn Successfully");
                }
                else {
                    JOptionPane.showMessageDialog(this, "Insufficient Balance");
                }
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid numbers");
            }
        }

        else if (e.getSource() == check) {
            try {
                double b = Double.parseDouble(balance.getText());

                if (b < 0) {
                    JOptionPane.showMessageDialog(this, "Invalid balance");
                    return;
                }

                JOptionPane.showMessageDialog(this, "Current Balance: " + b);
            }
            catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Enter valid balance");
            }
        }
    }

    public static void main(String[] args) {
        new Q10();
    }
}