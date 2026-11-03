import java.io.*;

class Q5 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("source.txt");
            FileWriter fw = new FileWriter("backup.txt");

            int ch;

            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            fr.close();
            fw.close();

            System.out.println("File copied successfully.");
        }
        catch (FileNotFoundException e) {
            System.out.println("Source file not found.");
        }
        catch (IOException e) {
            System.out.println("Error while copying file.");
        }
    }
}