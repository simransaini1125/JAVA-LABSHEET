
class Employee<T, U>
{
    T id;
    U name;

    Employee(T i, U n)
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
    }

    public static void main(String args[])
    {
        Employee<Integer, String> e = new Employee<Integer, String>(101, "Aman");

        e.display();
    }
}
