
class Box<T>
{
    T value;

    Box(T v)
    {
        value = v;
    }

    void display()
    {
        System.out.println("Value: " + value);
    }

    public static void main(String args[])
    {
        Box<Integer> b1 = new Box<Integer>(100);
        Box<String> b2 = new Box<String>("Hello");
        Box<Double> b3 = new Box<Double>(25.5);

        b1.display();
        b2.display();
        b3.display();
    }
}
