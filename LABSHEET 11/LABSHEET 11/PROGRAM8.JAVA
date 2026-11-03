import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Q8 extends JFrame implements ActionListener {

    JTextArea area;
    JMenuItem newFile, open, save, exit;

    Q8() {
        setTitle("Simple Notepad");
        setSize(500, 400);

        area = new JTextArea();
        add(new JScrollPane(area));

        JMenuBar mb = new JMenuBar();
        JMenu file = new JMenu("File");

        newFile = new JMenuItem("New");
        open = new JMenuItem("Open");
        save = new JMenuItem("Save");
        exit = new JMenuItem("Exit");

        file.add(newFile);
        file.add(open);
        file.add(save);
        file.add(exit);

        mb.add(file);
        setJMenuBar(mb);

        newFile.addActionListener(this);
        open.addActionListener(this);
        save.addActionListener(this);
        exit.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newFile) {
            area.setText("");
        }

        if (e.getSource() == open) {
            JFileChooser fc = new JFileChooser();

            if (fc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    BufferedReader br = new BufferedReader(
                        new FileReader(fc.getSelectedFile()));

                    area.setText("");

                    String line;

                    while ((line = br.readLine()) != null) {
                        area.append(line + "\n");
                    }

                    br.close();
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error opening file");
                }
            }
        }

        if (e.getSource() == save) {
            JFileChooser fc = new JFileChooser();

            if (fc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
                try {
                    FileWriter fw = new FileWriter(fc.getSelectedFile());

                    fw.write(area.getText());
                    fw.close();

                    JOptionPane.showMessageDialog(this, "File saved successfully");
                }
                catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Error saving file");
                }
            }
        }

        if (e.getSource() == exit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Q8();
    }
}