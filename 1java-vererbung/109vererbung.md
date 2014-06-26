### Sie können Substitution und Casting korrekt anwenden

---

[Zurück](100vererbung.md)

#### Type und Subtype

* ``Auto`` ist eine Klasse
* ``Ferrari`` erbt von Auto, d.h. ``Ferrari`` ist ein Subtyp (Untertyp) 
von ``Auto``
* ``Enzo``, ``Spider`` usw. erben von ``Ferrari`` uns sind somit auch 
Subtypen von Auto

```java
public class Ferrari extends Auto {
    ...
}
```

```java
public class Enzo extends Ferrari {
    ...
}
```

#### Subtyping (Substitution)

* Erbt Klasse ``Ferrari`` von Klasse ``Auto``, so kann man jederzeit 
ein ``Ferrari`` Objekt einem ``Auto`` zuordnen

```java
Auto a = new Ferrari();
```

* Das so resultierene ``Auto a`` kann allerdings nur noch als Auto 
und nicht als Ferrari angesprochen werden.

#### Casting 

* Ein ``Ferrari`` wird einem ``Auto a`` zugeordnet, welches dann zu einem 
``Ferrari b`` als ``Ferrari`` gecastet zugewiesen wird

```java
Ferrari a = new Ferrari(); 
Ferrari b = (Ferrari) a; 
```

* Das Casting funktioniert nur Aufwärts und im selben Pfad der Vererbung
* Ein ``Fiat`` kann zwar zur Compilezeit ein ``Ferrari`` gecastet 
zugewiesen werden, jedoch wird dies einen Typ-konflikt geben zur Laufzeit!

**Dieser Code crasht zur Laufzeit**

```java
Auto a = new Ferrari();
Fiat b = (Fiat) a;
```



---
Siehe OOP1 S.10-17
