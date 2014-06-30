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
        Stock stock = new Stock(3);
        for (int i = 1; i <= n; i++)
        {
            Producer pro = new Producer("P" + i, stock);
            Consumer con = new Consumer("C" + i, stock);
            pro.start();
            con.start();
        }
    }
}
