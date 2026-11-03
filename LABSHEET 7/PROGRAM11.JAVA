
class BankAccount
{
    int balance = 10000;

    synchronized void withdraw(int amount)
    {
        for(int i = 1; i <= 1000; i++)
        {
            balance = balance - amount;
        }
    }
}

class MyThread extends Thread
{
    BankAccount b;

    MyThread(BankAccount b)
    {
        this.b = b;
    }

    public void run()
    {
        b.withdraw(1);
    }

    public static void main(String args[])
    {
        BankAccount b = new BankAccount();

        MyThread t1 = new MyThread(b);
        MyThread t2 = new MyThread(b);

        t1.start();
        t2.start();

        try
        {
            t1.join();
            t2.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("Final Balance: " + b.balance);
    }
}
