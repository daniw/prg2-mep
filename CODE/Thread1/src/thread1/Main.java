package thread1;

public class Main
{
    public static void main(String[] args)
    {
        CountDown1 downCounter1 = new CountDown1(5, (short) 1);
        CountDown1 downCounter2 = new CountDown1(5, (short) 2);
        
        downCounter1.start();
        downCounter2.start();
    }
}