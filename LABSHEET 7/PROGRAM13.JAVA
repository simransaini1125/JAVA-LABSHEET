
class Buffer
{
    int value;
    boolean available = false;

    synchronized void produce(int num)
    {
        try
        {
            while(available)
            {
                wait();
            }

            value = num;
            available = true;

            System.out.println("Produced: " + value);

            notify();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }

    synchronized int consume()
    {
        int num = 0;

        try
        {
            while(!available)
            {
                wait();
            }

            num = value;
            available = false;

            System.out.println("Consumed: " + num);

            notify();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        return num;
    }
}

class ProducerConsumer
{
    public static void main(String args[])
    {
        Buffer b = new Buffer();

        Thread producer = new Thread(() ->
        {
            for(int i = 1; i <= 10; i++)
            {
                b.produce(i);
            }
        });

        Thread consumer = new Thread(() ->
        {
            for(int i = 1; i <= 10; i++)
            {
                b.consume();
            }
        });

        producer.start();
        consumer.start();

        try
        {
            producer.join();
            consumer.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
