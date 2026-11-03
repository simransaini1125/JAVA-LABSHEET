
class Fibonacci
{
    static int seriesCount = 0;

    void display(int n)
    {
        int a = 0;
        int b = 1;
        int c;

        seriesCount++;

        for(int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String args[])
    {
        Fibonacci f = new Fibonacci();
        f.display(10);

        System.out.println();
        System.out.println("Total Series: " + seriesCount);
    }
}
