
class NestedTryDemo
{
    public static void main(String args[])
    {
        int arr[] = {10, 20, 30, 40, 50};

        try
        {
            int a = 10;
            int b = 0;

            int result = a / b;
            System.out.println("Division: " + result);

            try
            {
                System.out.println(arr[7]);
            }
            catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Invalid Array Index");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
    }
}
