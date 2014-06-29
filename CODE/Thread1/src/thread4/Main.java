package thread4;

public class Main
{
    public static void main(String args[])
    {
        CountDown4 thread1 = new CountDown4(5, (short) 1);
        CountDown4 thread2 = new CountDown4(5, (short) 2);

        thread1.start();
        thread2.start();
    }
}
