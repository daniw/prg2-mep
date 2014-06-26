### Sie können benutzerdefinierte Exceptions implementieren

---

[Zurück](200exceptions.md)

#### Eigene Exception Klasse erstellen
```java
package myexception;

public class MyException extends RuntimeException {
	
	public MyException(String s) {
		super("MyExcpetion:" + s);
	}	
	
}
```

#### Klasse erstellen, welche die Exception werfen kann
```java
package myexception;

public class MyArray  {
	
	private int[] a = new int[5];
	
	public MyArray() {
		
	}
	
	public int getElement(int index) throws MyException {
		if(index >= a.length || index < 0) {
			throw new MyException("Index " + index + " does not exist!");
		}
		return a[index];
	}
	
}
```

#### Klasse verwenden, welche Exception werfen kann
```java
package myexception;

public class Main {
	
	public static void main(String[] args) {
		
		MyArray b = new MyArray();
		
		try {
			int c = b.getElement(7);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			throw new MyException(e1.getMessage());
		}
		
	}
	
}
```

---
Siehe OOP6 S.29
