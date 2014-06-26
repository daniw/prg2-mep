### Sie können checked und unchecked Exceptions erklären

---

[Zurück](200exceptions.md)

#### Checked Exception
Eine *checked Exception* ist eine Exception, welche zwingend behandelt 
werden **muss**. Andernfalls reklamiert der Compiler.

#### Unchecked Exception
Eine *unchecked Exception* ist eine Exception, welche behandelt **oder** 
weitergegeben werden kann. Die Weitergabe der Exception (nach oben) wird
mittels ``throws`` erreicht.

##### Beispiel für Weitergabe
```java
public void myMethod() throws IllegalArgumentException {
	...
}
```

---
Siehe OOP6 S.23
