
class Container<T>
{
    T value;

    void add(T v)
    {
        value = v;
    }

    T get()
    {
        return value;
    }

    public static void main(String args[])
    {
        Container<Integer> c1 = new Container<Integer>();
        Container<String> c2 = new Container<String>();
        Container<Double> c3 = new Container<Double>();

        c1.add(100);
        c2.add("Hello Java");
        c3.add(25.5);

        System.out.println(c1.get());
        System.out.println(c2.get());
        System.out.println(c3.get());
    }
}
