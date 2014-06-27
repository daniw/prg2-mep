### Sie können Polymorphie, d.h. Überschreiben und Überladen, mittels Java-Code erklären und anwenden

---

[Zurück](100vererbung.md)

#### Überladen (schwache Polymorphie, overloading)

* Als Überladen bezeichnet man die Verwendung gleichnamiger 
Methoden mit verschiedenen Parametern innerhalb der gleichen 
Klasse (gleiche Namen, verschiedene Signaturen).

```java
public String hello() {
    return "Hi!" 
}

public String hello(String name) {
    return "Hi " + name + " !";
}

public String hello(String firstname, String lastname) {
    return "Hi " + firstname + " " + lastname + " !";
}
```

#### Überschreiben (starke Polymorphie, overriding)
* Als Überschreiben bezeichnet man die erneute Definition einer Methode
innerhalb einer andren Klasse.

```java
public class Human {
    ...
    public String hello() {
        return "Hello!";
    }
    ...
}
```

```java
public class German extends Human {
    ...
    @Override 
    public String hello()
        return "Guten Tag!"
    }
    ...
}
```

```java
public class French extends Human {
    ...
    @Override
    public String hello() {
        return "Bonjour!";
    }
    ...
}
```

---
Siehe OOP1 S.20-27
