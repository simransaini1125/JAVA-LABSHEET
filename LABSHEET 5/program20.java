 
class BankAccount
{
    double balance;
    static String bankCode = "SBI101";

    BankAccount(double b)
    {
        balance = b;
    }

    void withdraw(double amount)
    {
        double remaining;

        if(amount <= balance)
        {
            remaining = balance - amount;
            balance = remaining;

            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
        else
        {
            System.out.println("Insufficient Balance");
        }
    }

    public static void main(String args[])
    {
        BankAccount b1 = new BankAccount(5000);

        System.out.println("Bank Code: " + bankCode);
        System.out.println("Current Balance: " + b1.balance);

        b1.withdraw(2000);
    }
}
