
import java.util.Scanner;

class MultipleCatchDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        try
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Division: " + result);

            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            System.out.println("Element: " + arr[index]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("Cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid Array Index");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Invalid Number Format");
        }
    }
}
