
class Armstrong
{
    static int totalChecks = 0;

    void checkArmstrong(int num)
    {
        int original = num;
        int sum = 0;
        int digit;

        totalChecks++;

        while(num > 0)
        {
            digit = num % 10;
            sum = sum + digit * digit * digit;
            num = num / 10;
        }

        if(sum == original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");
    }

    public static void main(String args[])
    {
        Armstrong a = new Armstrong();
        a.checkArmstrong(153);

        System.out.println("Total Checks: " + totalChecks);
    }
}
