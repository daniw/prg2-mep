package stock;

public class Stock
{
    private int size = 0;
    private String stock[];
    private int in = 0;
    private int out = 0;
    private int n = 0;

    public Stock(int s)
    {
        size = s;
        stock = new String[size];
    }

    public synchronized void enqueue(String value)
    {
        if (value == null)
        {
            return;
        }

        while (isFull())
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            };
        }
        n++;


        if (in == size)
        {
            in = 0;
        }
        stock[in] = value;

        System.out.println("enqueue:" + value);
        in++;
        notifyAll();
    }

    public synchronized String dequeue()
    {
        while (isEmpty())
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            };
        }
        n--;
        if (out == size)
        {
            out = 0;
        }
        String v = stock[out];
        out++;
        System.out.println("dequeue:" + v);
        notifyAll();
        return v;
    }

    public synchronized boolean isEmpty()
    {
        return (n == 0);
    }

    public synchronized boolean isFull()
    {
        return (n == size);
    }
}
