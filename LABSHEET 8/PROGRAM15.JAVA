
import java.util.ArrayList;

class Student<T, U, V>
{
    T id;
    U name;
    V marks;

    Student(T i, U n, V m)
    {
        id = i;
        name = n;
        marks = m;
    }

    void display()
    {
        System.out.println("ID: " + id +
        ", Name: " + name + ", Marks: " + marks);
    }
}

class StudentManagement
{
    public static void main(String args[])
    {
        ArrayList<Student<Integer, String, Double>> list =
        new ArrayList<Student<Integer, String, Double>>();

        list.add(new Student<Integer, String, Double>(101, "Rahul", 85.5));
        list.add(new Student<Integer, String, Double>(102, "Aman", 90.0));
        list.add(new Student<Integer, String, Double>(103, "Simran", 95.5));
        list.add(new Student<Integer, String, Double>(104, "Priya", 88.5));
        list.add(new Student<Integer, String, Double>(105, "Neha", 92.0));

        System.out.println("All Students:");

        for(int i = 0; i < list.size(); i++)
        {
            list.get(i).display();
        }

        int searchId = 103;
        boolean found = false;

        System.out.println("\nSearching Student ID: " + searchId);

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).id.equals(searchId))
            {
                list.get(i).display();
                found = true;
                break;
            }
        }

        if(found == false)
        {
            System.out.println("Student Not Found");
        }

        System.out.println("\nTotal Students: " + list.size());

        System.out.println("Contains First Student: " +
        list.contains(list.get(0)));
    }
}
