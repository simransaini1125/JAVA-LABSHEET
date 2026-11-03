
class Pair<T, U>
{
    T id;
    U name;

    Pair(T i, U n)
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
        Pair<Integer, String> p = new Pair<Integer, String>(101, "Rahul");

        p.display();
    }
}
