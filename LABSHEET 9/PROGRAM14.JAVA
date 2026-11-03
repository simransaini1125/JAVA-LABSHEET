import java.util.ArrayList;
import java.util.LinkedList;

class Q14 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<String>();

        list1.add("Aman");
        list1.add("Riya");
        list1.add("Rahul");

        System.out.println("ArrayList:");
        list1.add(1, "Simran");
        System.out.println("After Insertion: " + list1);

        list1.remove("Riya");
        System.out.println("After Deletion: " + list1);

        System.out.println("Get Element: " + list1.get(1));
        System.out.println("Size: " + list1.size());

        for (String name : list1) {
            System.out.println(name);
        }

        LinkedList<String> list2 = new LinkedList<String>();

        list2.add("Aman");
        list2.add("Riya");
        list2.add("Rahul");

        System.out.println("\nLinkedList:");
        list2.add(1, "Simran");
        System.out.println("After Insertion: " + list2);

        list2.remove("Riya");
        System.out.println("After Deletion: " + list2);

        System.out.println("Get Element: " + list2.get(1));
        System.out.println("Size: " + list2.size());

        for (String name : list2) {
            System.out.println(name);
        }
    }
}