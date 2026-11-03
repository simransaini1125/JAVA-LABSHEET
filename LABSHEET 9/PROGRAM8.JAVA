import java.util.LinkedList;

class Q8 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<String>();

        students.addFirst("Aman");
        students.addLast("Riya");
        students.addLast("Rahul");
        students.addFirst("Simran");

        System.out.println("Queue: " + students);

        students.removeFirst();
        System.out.println("After removeFirst: " + students);

        students.removeLast();
        System.out.println("After removeLast: " + students);
    }
}