package bump;

public class Counter1
{
    private int count = 0;

    public int nextNumber()
    {
        synchronized (this)
        {
            count++;
            return count;
        }
    }
}
