
import java.util.Scanner;

class InsufficientBalanceException extends Exception
{
    InsufficientBalanceException(String msg)
    {
        super(msg);
    }
}

class BankWithdrawal
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter account balance: ");
            double balance = Double.parseDouble(sc.nextLine());

            System.out.print("Enter withdrawal amount: ");
            double amount = Double.parseDouble(sc.nextLine());

            if(amount < 0)
            {
                throw new IllegalArgumentException("Negative amount not allowed");
            }

            if(amount > balance)
            {
                throw new InsufficientBalanceException("Insufficient Balance");
            }

            balance = balance - amount;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Please enter valid numbers");
        }
        catch(InsufficientBalanceException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IllegalArgumentException e)
        {
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Bank transaction completed.");
        }
    }
}
