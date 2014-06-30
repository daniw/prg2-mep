package thread2;

public class Main
{
    public static void main(String[] args)
    {
        CountDown2 downCounter1 = new CountDown2(5, (short) 1);
        CountDown2 downCounter2 = new CountDown2(5, (short) 2);

        downCounter1.setPriority(Thread.MIN_PRIORITY);

        downCounter1.start ();
        downCounter2.start ();
    }
}
