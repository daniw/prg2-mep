### Sie verstehen das Konzept von abstrakten Klassen und können diese einsetzen

---

[Zurück](100vererbung.md)

#### Abstrakte Klasse deklarieren (mit abstrakten Methoden)
```java
package pkgabstract;

public abstract class Abstract {

    abstract String hi();
    abstract String bye();

}
```

#### Abstrakte Klasse erben, implementieren
```java
package pkgabstract;

public class Message extends Abstract {

    public Message() {
        
    }
    
    @Override
    String hi() {
        return "Hello!";
    }

    @Override
    String bye() {
        return "Bye!";
    }
    
}
```

#### Implementierte abstrakte Klasse verwenden
```java
package pkgabstract;

public class Main {
    
    public static void main(String[] args) {
        
        Message m = new Message();
        
        System.out.println(m.hi());
        System.out.println(m.bye());
    }
    
}
```

---
Siehe OOP2 S19-22
