package sinlgeton;

public final class Singleton
{
    private static Singleton theInstance;

    private Singleton()
    {
    }

    public static Singleton getInstance()
    {
        if (theInstance == null)
        {
            theInstance = new Singleton();
        }
        return theInstance;
    }
}