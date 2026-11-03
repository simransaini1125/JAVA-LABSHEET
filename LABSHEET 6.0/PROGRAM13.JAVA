
import java.util.Scanner;

class InvalidDosageException extends Exception
{
    InvalidDosageException(String msg)
    {
        super(msg);
    }
}

class DrugDosage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();

            System.out.print("Enter drug name: ");
            String drug = sc.nextLine();

            System.out.print("Enter dosage in mg: ");
            double dosage = Double.parseDouble(sc.nextLine());

            if(dosage <= 0 || dosage > 1000)
            {
                throw new InvalidDosageException("Invalid Dosage");
            }

            System.out.println("Patient Name: " + name);
            System.out.println("Drug Name: " + drug);
            System.out.println("Dosage: " + dosage + " mg");
            System.out.println("Dosage Validated Successfully");
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter valid dosage");
        }
        catch(InvalidDosageException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Dosage validation completed.");
        }
    }
}
