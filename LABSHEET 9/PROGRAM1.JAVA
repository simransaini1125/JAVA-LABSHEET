import java.util.ArrayList;

class Q1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Karan");
        students.add("Neha");
        students.add("Simran");
        students.add("Rohit");
        students.add("Anjali");
        students.add("Vikas");

        System.out.println("Student Names:");

        for (String name : students) {
            System.out.println(name);
        }

        System.out.println("Total Students: " + students.size());
    }
}