### Sie wissen, wie ``toString()`` arbeitet und angepasst werden kann

---

[Zurück](100vererbung.md)

#### Allgemeines 

* Die Klasse ``Object`` vererbt an alle Klassen die Methode ``toString()``
* ``toString()`` gibt einen String zurück als Repräsentation des Objektes
* Die Form dieser String-Repräsentation ist ``Name der Klasse`` @ 
``Adresse auf dem Heap`` (Beispiel: ``Ferrari@100363``)
* Liefern zwei solcher Aufrufe die selbe Rückgabe, so handelt es sich um
die gleichen Objekte
* Übergibt man ``print()`` oder ``println()`` als Parameter eine 
Referenzvariable, so wird automatisch ``toString()`` ausgeführt

#### Anpassung

* Oft dient es dem Benutzer/Entwickler nicht was ``toString()`` zurückgibt
* Die Methode kann Überschrieben werden.
* Hat man eine Klasse ``Auto`` so könnte ``toString()`` wie folgt 
implementiert werden

```java
public class Auto {
    private String color  = "blue";
    private String brand  = "Ferrari";
    private String model  = "Enzo";
    private String owner  = "Don Lambo";
    private String serial = "12-493.29"; 

    public Auto() {
        
    }

    @Override
    public String toString() {
        String info = "Brand: " + brand 
                      + ";\n Model " + model
                      + ";\n Owner " + owner
                      + ";\n Color " + color
                      + ";\n Serial " + serial;
        return info;
    }
}

```

* In einer Subklasse kann dies einfach erweitert werden (bei einem 
Sportwagen wäre noch zusätzlich die Anzahl PS interessant)

```java
public class Ferrari extends Auto {
    private String hp = "488";
    ...
    @Override
    public String toString() {
        return super.toString() + ";\n Horsepower " + hp;
    }
}
```


---
Siehe OOP1 S.31
