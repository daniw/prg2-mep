package thread1;

public class CountDown1 extends Thread
{

    private int counter = 0;
    private short id;

    public CountDown1(int value, short newId)
    {
        super();
        if (value > 0)
        {
            counter = value;
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
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
            };
        }
    }
}