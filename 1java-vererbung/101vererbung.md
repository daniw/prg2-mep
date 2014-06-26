### Sie kennen Java spezifische Eigenschaften der Vererbung

---

[Zurück](100vererbung.md)

* Mehrfache Vererbung bedeutet, dass eine Klasse **direkt** von mehreren
Vorfahren erbt.
* Bei gleichnamigen Methoden oder Attributen in den Basisklassen entstehen
bei der Vererbung Konflikte.
* Jede Programmiersprache hat hier ihre eigenen Regeln.
    * Java verbietet die mehrfache Vererbung für Klassen.
    * Java gestattet mehrfache Vererbung für Interfaces.

* Ein Interface kann von mehreren Interfaces erben.
```java
public interface Fiat implements Auto, Window, Radio {
...
}
```

---
Siehe OOP2, S.26; OOP3 S.15-21
