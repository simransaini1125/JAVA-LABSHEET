
class Student<T>
{
    T id;

    Student(T i)
    {
        id = i;
    }

    void display()
    {
        System.out.println("Student ID: " + id);
    }

    public static void main(String args[])
    {
        Student<Integer> s = new Student<Integer>(101);

        s.display();
    }
}
