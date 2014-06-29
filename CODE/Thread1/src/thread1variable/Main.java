package thread1variable;

public class Main
{

    public static void main(String[] args)
    {
        CountDownVariable downCounter1 = new CountDownVariable(5, (short) 1, 600);
        CountDownVariable downCounter2 = new CountDownVariable(5, (short) 2, 200);
        
        downCounter1.start();
        downCounter2.start();
    }
}