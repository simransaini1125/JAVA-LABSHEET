
class Factorial
{
    static int totalCalls = 0;

    void calculate(int num)
    {
        int fact = 1;

        totalCalls++;

        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }

        System.out.println("Factorial: " + fact);
    }

    public static void main(String args[])
    {
        Factorial f = new Factorial();
        f.calculate(5);

        System.out.println("Total Calls: " + totalCalls);
    }
}
