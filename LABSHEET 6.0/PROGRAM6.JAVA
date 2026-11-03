
import java.util.Scanner;

class ThrowDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student marks: ");
        int marks = sc.nextInt();

        try
        {
            if(marks < 0 || marks > 100)
            {
                throw new Exception("Invalid Marks");
            }

            System.out.println("Marks: " + marks);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
