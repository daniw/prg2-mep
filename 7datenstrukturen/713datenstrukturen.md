### Sie können einen Stack implementieren

---

[Zurück](700datenstrukturen.md)

#### Stack mit Array

```java
package stack;

public class StackArray {
	
	private int size;
	private int top = 0;
	
	private Object[] stack;
	
	public StackArray(int s) {
		size = s;
		stack = new Object[size];
	}
	
	public void push(Object o) {
		stack[top] = o;
		top++;
	}
	
	public Object pop() {
		top--;
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public boolean isFull() {
		return (top == size);
	}
	
}
```


#### Stack mit ArrayList

```java
package stack;

import java.util.ArrayList;

public class StackArrayList {
	
	private ArrayList stack = new ArrayList();
	
	public StackArrayList() {
		
	}
	
	public void push(Object o) {
		stack.add(o);
	}
	
	public Object pop() {
		return stack.remove(stack.size() - 1);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}
	
}
```

#### Verwendung

```java
package stack;

public class Main {
	
	public static void main(String[] args) {
		
		String[] text = new String[]{"Foo!\n", "is ", "name ", "My "};
		
		StackArray sa = new StackArray(6);
		StackArrayList sal = new StackArrayList();
		
		for(String i : text) {
			sa.push(i);
			sal.push(i);
		}
		
		while(!sa.isEmpty()) {
			System.out.print(sa.pop());
		}
		
		while(!sal.isEmpty()) {
			System.out.print(sal.pop());
		}
		
	}
	
}
```

---
Siehe DAT2 S.18-19
