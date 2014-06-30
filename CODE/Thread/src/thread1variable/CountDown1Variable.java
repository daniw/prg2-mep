package thread1variable;

public class CountDown1Variable extends Thread
{

    private int counter = 0;
    private short id;
    private int interval;

    public CountDown1Variable(int value, short newId, int interv)
    {
        super();
        if (value > 0)
        {
            counter = value;
        }
        if (interv > 0)
        {
            interval = interv;
        }
        id = newId;
    }

    @Override
    public void run()
    {
        while (counter > 0)
        {
            System.out.println(id + ": " + counter);
            counter--;
            try
            {
                Thread.sleep(interval);
            }
            catch (InterruptedException e)
            {
            };
        }
    }
}