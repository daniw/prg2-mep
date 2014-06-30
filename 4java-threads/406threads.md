### Sie können eine Anwendung mit Threads implementieren

---

[Zurück](400threads.md)

#### Klasse `Thread`

##### Thread
```java
package thread2;

public class CountDown2 extends Thread
{

    private int counter = 0;
    private short id;

    public CountDown2(int value, short newId)
    {
        super();
        if (value > 0)
        {
            counter = value;
        }
        id = newId;
    }

    @Override
    public void run()
    {
        while (counter > 0)
        {
            System.out.println(id + ": " + counter);
            counter--;
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
            };
        }
    }
}
```

##### Main
```java
package thread2;

public class Main
{
    public static void main(String[] args)
    {
        CountDown2 downCounter1 = new CountDown2(5, (short) 1);
        CountDown2 downCounter2 = new CountDown2(5, (short) 2);

        downCounter1.setPriority(Thread.MIN_PRIORITY);

        downCounter1.start ();
        downCounter2.start ();
    }
}
```

#### Interface `Runnable`

##### Thread
```java
package thread3;

public class CountDown3 implements Runnable
{
    private int counter = 0;
    private short id;

    public CountDown3(int value, short newId)
    {
        if (value > 0)
        {
            counter = value;
        }
        id = newId;
    }

    public void run()
    {
        while (counter > 0)
        {
            System.out.println(id + ": " + counter);
            counter--;
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
            };
        }
    }
}
```

##### Main
```java
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
```


#### Attribut vom Typ `Thread`

##### Thread
```java
package thread5;

public class CountDown5 implements Runnable
{

    private int counter = 0;
    private short id;
    private Thread thread;

    public CountDown5(int value, short newId)
    {
        if (value > 0)
        {
            counter = value;
        }
        id = newId;
    }

    public void start()
    {
        if (thread == null)
        {
            thread = new Thread(this);
            thread.start();
        }
    }

    public void run()
    {
        while (counter > 0)
        {
            System.out.println(id + ": " + counter);
            counter--;
            try
            {
                Thread.sleep(200);
            }
            catch (InterruptedException e)
            {
            };
        }
    }

    public void setPriority(int newPrio)
    {
        if (thread != null)
        {
            thread.setPriority(newPrio);
        }
    }
}
```

##### Main
```java
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
```


---
Siehe ab OOP8 S.18
