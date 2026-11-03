import java.io.*;
import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            FileWriter fw = new FileWriter("employees.txt");

            System.out.print("Enter Employee ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Employee Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Department: ");
            String department = sc.nextLine();

            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();

            fw.write(id + "\n");
            fw.write(name + "\n");
            fw.write(department + "\n");
            fw.write(salary + "\n");

            fw.close();

            System.out.print("Enter Employee ID to search: ");
            int searchId = sc.nextInt();

            FileReader fr = new FileReader("employees.txt");
            BufferedReader br = new BufferedReader(fr);

            String empId = br.readLine();
            String empName = br.readLine();
            String empDepartment = br.readLine();
            String empSalary = br.readLine();

            if (empId != null && Integer.parseInt(empId) == searchId) {
                System.out.println("Employee Record Found");
                System.out.println("Employee ID: " + empId);
                System.out.println("Employee Name: " + empName);
                System.out.println("Department: " + empDepartment);
                System.out.println("Salary: " + empSalary);
            }
            else {
                System.out.println("Employee record not found.");
            }

            br.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
        catch (IOException e) {
            System.out.println("File error occurred.");
        }

        sc.close();
    }
}