package stock;

public class Consumer extends Thread
{
    private String id;
    private Stock stock;

    public Consumer(String i, Stock s)
    {
        id = i;
        stock = s;
    }

    public void consume()
    {
        boolean dequeued = false;
        boolean empty = false;
        do
        {
            synchronized (stock)
            {
                empty = stock.isEmpty();
                if (!empty)
                {
                    System.out.println(id + ": " + stock.dequeue());
                    dequeued = true;
                }
            }
            if (empty)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException ie)
                {
                };
            }
        } while (!dequeued);
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10000; i++)
        {
            consume();
        }
    }
}
