package thread1variable;

public class Main
{

    public static void main(String[] args)
    {
        CountDown1Variable downCounter1 = new CountDown1Variable(5, (short) 1, 600);
        CountDown1Variable downCounter2 = new CountDown1Variable(5, (short) 2, 200);
        
        downCounter1.start();
        downCounter2.start();
    }
}