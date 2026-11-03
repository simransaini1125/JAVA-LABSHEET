import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

class Q9 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<String>();

        students.add("Aman");
        students.add("Riya");
        students.add("Rahul");

        ListIterator<String> it = students.listIterator();

        while (it.hasNext()) {
            String name = it.next();

            if (name.equals("Riya")) {
                it.set("Simran");
                it.add("Priya");
            }
        }

        System.out.println("Updated List: " + students);
    }
}