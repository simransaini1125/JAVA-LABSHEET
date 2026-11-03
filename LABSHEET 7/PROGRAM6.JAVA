
class MyThread extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Thread is running");
            Thread.sleep(500);
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

    public static void main(String args[])
    {
        MyThread t = new MyThread();

        System.out.println("Before Start: " + t.isAlive());

        t.start();

        System.out.println("While Running: " + t.isAlive());

        try
        {
            t.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("After Finish: " + t.isAlive());
    }
}
