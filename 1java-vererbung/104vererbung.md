### Sie können ein Java Interface definieren

---

[Zurück](100vererbung.md)

#### Interface deklarieren
```java
package interfaces;

public interface Message {
    
    String hi();
    String bye();
    
}
```

#### Interface implementieren
```java
package interfaces;

public class Talk implements Message {

    public Talk() {
        
    }
    
    public String sup() {
        return "What's up?";
    }
    
    public String nth() {
        return "Nothing!";
    }
    
    @Override
    public String hi() {
        return "Hello!";
    }

    @Override
    public String bye() {
        return "Bye!";
    }
    
}
```

#### Implementiertes Interface benutzen
```java
package interfaces;

public class Main {
    
    public static void main(String[] args) {
        
        Talk t = new Talk();
        
        System.out.println(t.hi());
        System.out.println(t.sup());
        System.out.println(t.nth());
        System.out.println(t.bye());
    } 
}
```

---
Siehe OOP3 S.11-21
