package stock;

public class Consumer extends Thread
{
    private String id;
    private Stock stock;

    public Consumer(String i)
    {
        id = i;
        stock = Stock.getInstance();
    }

    public void consume()
    {
        System.out.println(id + ": " + stock.dequeue());
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
