package thread4;

public class CountDown4 implements Runnable
{

    private int counter = 0;
    private short id;
    private Thread thread;

    public CountDown4(int value, short newId)
    {
        if (value > 0)
        {
            counter = value;
        }
        id = newId;
    }

    public void start()
    {
        if (thread == null)
        {
            thread = new Thread(this);
            thread.start();
        }
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
