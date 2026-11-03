
class PrimeChecker
{
    static int totalPrimeChecks = 0;

    void checkPrime(int num)
    {
        int count = 0;

        totalPrimeChecks++;

        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0)
                count++;
        }

        if(count == 2)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }

    public static void main(String args[])
    {
        PrimeChecker p = new PrimeChecker();
        p.checkPrime(7);

        System.out.println("Total Checks: " + totalPrimeChecks);
    }
}
