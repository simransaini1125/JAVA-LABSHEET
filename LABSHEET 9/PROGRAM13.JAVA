import java.util.ArrayList;
import java.util.ListIterator;

class Q13 {
    public static void main(String[] args) {
        ArrayList<String> courses = new ArrayList<String>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("C++");
        courses.add("HTML");

        ListIterator<String> it = courses.listIterator();

        System.out.println("Forward Direction:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward Direction:");

        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }

        System.out.println("Next Index: " + it.nextIndex());
        System.out.println("Previous Index: " + it.previousIndex());
    }
}