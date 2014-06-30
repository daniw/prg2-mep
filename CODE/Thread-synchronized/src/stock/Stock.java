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

    public void enqueue(String v)
    {
        if (v == null)
        {
            return;
        }
        n++;
        if (in == size)
        {
            in = 0;
        }
        stock[in] = v;
        System.out.println("enqueue:"
                + v);
        in++;
    }

    public String dequeue()
    {
        n--;
        if (out == size)
        {
            out = 0;
        }
        String v = stock[out];
        out++;
        System.out.println("dequeue:" + v);
        return v;
    }

    public boolean isEmpty()
    {
        return (n == 0);
    }

    public boolean isFull()
    {
        return (n == size);
    }
}
