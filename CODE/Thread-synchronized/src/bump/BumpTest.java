package bump;

public class BumpTest
{
    int count;

    void bump()
    {
        synchronized (this)
        {
            count++;
        }
    }
    static int classCount;

    static void classBump()
    {
        try
        {
            synchronized (this.getClass())
            {
                classCount++;
            }
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("Class not found");
        }
    }
}
