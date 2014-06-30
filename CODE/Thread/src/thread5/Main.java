package thread5;

public class Main
{
    public static void main(String args[])
    {
        CountDown5 thread1 = new CountDown5(5, (short) 1);
        CountDown5 thread2 = new CountDown5(5, (short) 2);
        
        thread1.setPriority(1);
        
        thread1.start();
        thread2.start();
    }
}
