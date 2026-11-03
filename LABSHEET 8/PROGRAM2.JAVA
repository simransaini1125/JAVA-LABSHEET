
class Result<T>
{
    T marks;

    Result(T m)
    {
        marks = m;
    }

    void display()
    {
        System.out.println("Marks: " + marks);
    }

    public static void main(String args[])
    {
        Result<Integer> r1 = new Result<Integer>(85);
        Result<Double> r2 = new Result<Double>(92.5);

        r1.display();
        r2.display();
    }
}
