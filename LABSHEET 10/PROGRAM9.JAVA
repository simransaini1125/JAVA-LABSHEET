import java.io.*;
import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("student_records.txt");

            for (int i = 1; i <= 5; i++) {
                System.out.println("Enter details of Student " + i);

                System.out.print("Roll Number: ");
                int roll = sc.nextInt();
                sc.nextLine();

                System.out.print("Name: ");
                String name = sc.nextLine();

                System.out.print("Course: ");
                String course = sc.nextLine();

                System.out.print("Marks: ");
                int marks = sc.nextInt();

                fw.write("Roll Number: " + roll + "\n");
                fw.write("Name: " + name + "\n");
                fw.write("Course: " + course + "\n");
                fw.write("Marks: " + marks + "\n\n");
            }

            fw.close();

            System.out.println("\nStudent Records:");

            FileReader fr = new FileReader("student_records.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}