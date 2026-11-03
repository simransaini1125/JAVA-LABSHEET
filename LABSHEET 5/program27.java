
class StringReverse
{
    static int totalReversals = 0;

    void reverse(String str)
    {
        String rev = "";

        totalReversals++;

        for(int i = str.length() - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String: " + rev);
    }

    public static void main(String args[])
    {
        StringReverse s = new StringReverse();
        s.reverse("Hello");

        System.out.println("Total Reversals: " + totalReversals);
    }
}
