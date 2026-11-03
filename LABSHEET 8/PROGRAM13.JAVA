
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
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String args[])
    {
        Student<Integer, String, Double> s1 =
        new Student<Integer, String, Double>(101, "Rahul", 85.5);

        Student<Integer, String, Double> s2 =
        new Student<Integer, String, Double>(102, "Aman", 90.5);

        Student<Integer, String, Double> s3 =
        new Student<Integer, String, Double>(103, "Simran", 95.5);

        s1.display();
        s2.display();
        s3.display();
    }
}
