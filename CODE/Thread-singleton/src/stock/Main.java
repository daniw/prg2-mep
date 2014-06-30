package stock;

public class Main
{
    public static void main(String[] args)
    {
        if (args.length == 0)
        {
            System.out.println("missing args");
            //return;
        }
//        int n = Integer.parseInt(args[0]);
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            Producer pro = new Producer("P" + i);
            Consumer con = new Consumer("C" + i);
            pro.start();
            con.start();
        }
    }
}
