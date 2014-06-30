package thread5;

public class CountDown5 implements Runnable
{

    private int counter = 0;
    private short id;
    private Thread thread;

    public CountDown5(int value, short newId)
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

    public void setPriority(int newPrio)
    {
        if (thread != null)
        {
            thread.setPriority(newPrio);
        }
    }
}
