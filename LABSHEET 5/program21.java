
class Palindrome
{
    static int countChecks = 0;

    void checkPalindrome(int num)
    {
        int original = num;
        int reverse = 0;
        int digit;

        countChecks++;

        while(num > 0)
        {
            digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if(original == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }

    public static void main(String args[])
    {
        Palindrome p = new Palindrome();
        p.checkPalindrome(121);

        System.out.println("Total Checks: " + countChecks);
    }
}
