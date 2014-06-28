### Sie können eine Queue implementieren

---

[Zurück](700datenstrukturen.md)

#### Queue mit Array

```java
package queue;

public class QueueArray {
	
	private int size;
	private int numberOfElement = 0;
	private int in = 0;
	private int out = 0;
	private Object[] queue;
	
	public QueueArray(int s) {
		size = s;
		queue = new Object[size];
	}
	
	public void enqueue(Object o) {
		numberOfElement++;
		if(in == size) {
			in = 0;
		}
		queue[in] = o;
		in++;
	}
	
	public Object dequeue() {
		numberOfElement--;
		if(out == size) {
			out = 0;
		}
		Object o = queue[out];
		out++;
		return o;
	}
	
	public boolean isEmpty() {
		return (numberOfElement == 0);
	}
	
	public boolean isFull() {
		return (numberOfElement == size);
	}
	
}
```

#### Queue mit List

```java
package queue;

import java.util.LinkedList;

public class QueueList {
	
	private LinkedList queue = new LinkedList();
	
	public QueueList() {
		
	}
	
	public void enqueue(Object o) {
		queue.addLast(o);
	}
	
	public Object dequeue() {
		return queue.removeFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}
	
}
```

#### Verwendung 

```java
package queue;

public class Main {
	
	public static void main(String[] args) {
		
		String[] customers = new String[]{"Arnold", "Benny", "Charles"};
		
		QueueArray qa = new QueueArray(3);
		QueueList ql = new QueueList();
		
		for(String i : customers) {
			qa.enqueue(i);
			ql.enqueue(i);
		}
		
		System.out.println("Customer waiting in");
		System.out.print("\tthe Array-Store: ");
		while(!qa.isEmpty()) {
			System.out.print(qa.dequeue() + "; ");
		}
		
		System.out.print("\n\tthe List-Store: ");
		while(!ql.isEmpty()) {
			System.out.print(ql.dequeue() + "; ");
		}
		
		System.out.println("\nEnd of the queue lists");
	}
	
}
```
---
Siehe DAT2 S.29-30
