### Sie können die Methoden ``wait()`` und ``notify()`` anwenden

---

[Zurück](400threads.md)

#### Bsiepiel mit Producer und Consumer

##### Stock
```java
package stock;

public class Stock
{
    private int size = 0;
    private String stock[];
    private int in = 0;
    private int out = 0;
    private int n = 0;

    public Stock(int s)
    {
        size = s;
        stock = new String[size];
    }

    public synchronized void enqueue(String value)
    {
        if (value == null)
        {
            return;
        }

        while (isFull())
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            };
        }
        n++;


        if (in == size)
        {
            in = 0;
        }
        stock[in] = value;

        System.out.println("enqueue:" + value);
        in++;
        notifyAll();
    }

    public synchronized String dequeue()
    {
        while (isEmpty())
        {
            try
            {
                wait();
            }
            catch (InterruptedException ie)
            {
            };
        }
        n--;
        if (out == size)
        {
            out = 0;
        }
        String v = stock[out];
        out++;
        System.out.println("dequeue:" + v);
        notifyAll();
        return v;
    }

    public synchronized boolean isEmpty()
    {
        return (n == 0);
    }

    public synchronized boolean isFull()
    {
        return (n == size);
    }
}
```

##### Producer
```java
package stock;

public class Producer extends Thread
{
    private int number = 1;
    private String id;
    private Stock stock;

    public Producer(String i, Stock s)
    {
        id = i;
        stock = s;
    }

    public void produce()
    {
        stock.enqueue(id + ": " + number);
        number++;
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10000; i++)
        {
            produce();
        }
    }
}
```

##### Consumer
```java
package stock;

public class Consumer extends Thread
{
    private String id;
    private Stock stock;

    public Consumer(String i, Stock s)
    {
        id = i;
        stock = s;
    }

    public void consume()
    {
        System.out.println(id + ": " + stock.dequeue());
    }

    @Override
    public void run()
    {
        for (int i = 1; i <= 10000; i++)
        {
            consume();
        }
    }
}
```

##### Main
```java
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
```

---
Siehe OOP10 S.9-19
