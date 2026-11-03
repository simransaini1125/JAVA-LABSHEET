import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.ListIterator;
import java.util.Scanner;

class Q15 {

    static class Student {
        int id;
        String name;

        Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        void display() {
            System.out.println(id + " - " + name);
        }
    }

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        HashSet<Integer> uniqueIds = new HashSet<Integer>();
        TreeSet<Integer> sortedIds = new TreeSet<Integer>();

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display Students");
            System.out.println("5. Count Students");
            System.out.println("6. Forward and Backward");
            System.out.println("7. Display List, Set and SortedSet");
            System.out.println("8. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            if (choice == 1) {

                System.out.print("Enter Student ID: ");
                int id = sc.nextInt();

                sc.nextLine();

                if (uniqueIds.contains(id)) {
                    System.out.println("Student ID Already Exists");
                } else {
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    students.add(new Student(id, name));
                    uniqueIds.add(id);
                    sortedIds.add(id);

                    System.out.println("Student Added Successfully");
                }

            } else if (choice == 2) {

                System.out.print("Enter ID to remove: ");
                int id = sc.nextInt();

                boolean found = false;

                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).id == id) {
                        students.remove(i);
                        uniqueIds.remove(id);
                        sortedIds.remove(id);
                        found = true;
                        break;
                    }
                }

                if (found) {
                    System.out.println("Student Removed");
                } else {
                    System.out.println("Student Not Found");
                }

            } else if (choice == 3) {

                System.out.print("Enter ID to search: ");
                int id = sc.nextInt();

                boolean found = false;

                for (Student s : students) {
                    if (s.id == id) {
                        System.out.println("Student Found:");
                        s.display();
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Student Not Found");
                }

            } else if (choice == 4) {

                System.out.println("Student Records:");

                for (Student s : students) {
                    s.display();
                }

            } else if (choice == 5) {

                System.out.println("Total Students: " + students.size());

            } else if (choice == 6) {

                ListIterator<Student> it =
                    students.listIterator();

                System.out.println("Forward Direction:");

                while (it.hasNext()) {
                    it.next().display();
                }

                System.out.println("Backward Direction:");

                while (it.hasPrevious()) {
                    it.previous().display();
                }

            } else if (choice == 7) {

                System.out.println("ArrayList IDs: ");

                for (Student s : students) {
                    System.out.print(s.id + " ");
                }

                System.out.println("\nHashSet IDs: " + uniqueIds);
                System.out.println("TreeSet IDs: " + sortedIds);

            } else if (choice == 8) {

                System.out.println("Program Ended");

            } else {

                System.out.println("Invalid Choice");
            }

        } while (choice != 8);

        sc.close();
    }
}