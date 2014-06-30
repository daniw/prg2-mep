package thread3;

public class CountDown3 implements Runnable
{
    private int counter = 0;
    private short id;

    public CountDown3(int value, short newId)
    {
        if (value > 0)
        {
            counter = value;
        }
        id = newId;
    }

    public void run()
    {
        while (counter > 0)
        {
            System.out.println(id + ": " + counter);
            counter--;
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
            };
        }
    }
}
