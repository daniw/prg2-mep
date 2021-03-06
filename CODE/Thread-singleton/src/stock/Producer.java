package stock;

public class Producer extends Thread
{
    private int number = 1;
    private String id;
    private Stock stock;

    public Producer(String i)
    {
        id = i;
        stock = Stock.getInstance();
    }

    public void produce()
    {
        stock.enqueue(id + ": " + number);
        number++;
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
