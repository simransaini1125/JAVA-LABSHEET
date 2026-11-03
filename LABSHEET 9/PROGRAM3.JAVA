import java.util.ArrayList;

class Q3 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<String>();

        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");
        students.add("Priya");
        students.add("Karan");

        students.set(1, "Simran");
        students.remove(3);

        System.out.println("Updated Student List: " + students);
    }
}