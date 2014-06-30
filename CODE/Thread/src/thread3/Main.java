package thread3;

public class Main
{
    public static void main(String args[])
    {
        CountDown3 instance1 = new CountDown3(5, (short) 1);
        CountDown3 instance2 = new CountDown3(5, (short) 2);
        
        Thread thread1 = new Thread(instance1);
        Thread thread2 = new Thread(instance2);
        
        thread1.start();
        thread2.start();
    }
}
