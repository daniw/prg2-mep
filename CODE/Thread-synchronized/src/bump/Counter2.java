package bump;

public class Counter2
{
    private int count = 0;

    public synchronized int nextNumber()
    {
        count++;
        return count;
    }
}
