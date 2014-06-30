package stock;

public class Producer extends Thread
{
    private int number = 1;
    private String id;
    private Stock stock;

    public Producer(String i, Stock s)
    {
        id = i;
        stock = s;
    }

    public void produce()
    {
        boolean full = false;
        boolean enqueued = false;
        do
        {
            synchronized (stock)
            {
                full = stock.isFull();
                if (!full)
                {
                    stock.enqueue(id + ": " + (number));
                    number++;
                    enqueued = true;
                }
            }
            if (full)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException e)
                {
                };
            }
        } while (!enqueued);
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10000; i++)
        {
            produce();
        }
    }
}
