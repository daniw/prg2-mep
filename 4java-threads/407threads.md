### Sie können das Monitorkonzept in Java (``synchronized``) anwenden

---

[Zurück](400threads.md)

#### Synchronized Methode
```java
package bump;

public class Counter2
{
    private int count = 0;

    public synchronized int nextNumber()
    {
        count++;
        return count;
    }
}
```

#### Synchronized Block
```java
package bump;

public class Counter1
{
    private int count = 0;

    public int nextNumber()
    {
        synchronized (this)
        {
            count++;
            return count;
        }
    }
}
```

#### Beispiel mit Producer und Consumer

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

    public void enqueue(String v)
    {
        if (v == null)
        {
            return;
        }
        n++;
        if (in == size)
        {
            in = 0;
        }
        stock[in] = v;
        System.out.println("enqueue:"
                + v);
        in++;
    }

    public String dequeue()
    {
        n--;
        if (out == size)
        {
            out = 0;
        }
        String v = stock[out];
        out++;
        System.out.println("dequeue:" + v);
        return v;
    }

    public boolean isEmpty()
    {
        return (n == 0);
    }

    public boolean isFull()
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
        boolean full = false;
        boolean enqueued = false;
        do
        {
            synchronized (stock)
            {
                full = stock.isFull();
                if (!full)
                {
                    stock.enqueue(id + ": " + (number));
                    number++;
                    enqueued = true;
                }
            }
            if (full)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException e)
                {
                };
            }
        } while (!enqueued);
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
        boolean dequeued = false;
        boolean empty = false;
        do
        {
            synchronized (stock)
            {
                empty = stock.isEmpty();
                if (!empty)
                {
                    System.out.println(id + ": " + stock.dequeue());
                    dequeued = true;
                }
            }
            if (empty)
            {
                try
                {
                    Thread.sleep(50);
                }
                catch (InterruptedException ie)
                {
                };
            }
        } while (!dequeued);
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
Siehe OOP9 S.16-22
