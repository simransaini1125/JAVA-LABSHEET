
import java.util.Scanner;

class InvalidMarksException extends Exception
{
    InvalidMarksException(String msg)
    {
        super(msg);
    }
}

class UserDefinedException
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        try
        {
            if(marks < 0 || marks > 100)
            {
                throw new InvalidMarksException("Invalid Marks");
            }

            System.out.println("Valid Marks: " + marks);
        }
        catch(InvalidMarksException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
