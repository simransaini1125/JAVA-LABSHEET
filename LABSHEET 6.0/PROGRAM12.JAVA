
import java.util.Scanner;

class InvalidPatientAgeException extends Exception
{
    InvalidPatientAgeException(String msg)
    {
        super(msg);
    }
}

class Hospital
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter patient age: ");
            int age = Integer.parseInt(sc.nextLine());

            if(age < 0 || age > 120)
            {
                throw new InvalidPatientAgeException("Invalid Patient Age");
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + age);
            System.out.println("Registration Successful");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter age in numbers");
        }
        catch(InvalidPatientAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
