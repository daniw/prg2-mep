### Sie können die Beziehung zwischen der Methode equals() und den Interfaces Comparable und Comparator erläutern

---

[Zurück](600vergleich.md)

#### Das Interface ``Comparable<T>``

* Um eine natürliche Ordnung festzulegen, kann das Interface 
``Comparable<T>`` implementiert werden.
* Das Interface ``Comparable<T>`` spezifiziert die Methode 
``int compareTo(T other)``.

```java
MyClass a = new MyClass(x);
MyClass b = new MyClass(y);

int result = a.compareTo(b);
```

| result    | Situation             |
|-----------|-----------------------|
| -1        | falls ``a`` < ``b``   |
|  0        | falls ``a`` ~ ``b``   |
|  1        | falls ``a`` > ``b``   |

#### Das Interface ``Comparator<T>``

* Mit dem Interface ``Comparator<T>`` lassen sich beliebig viele 
spezielle Ordnungen festlegen.
* Das Interface ``Comparator<T>`` spezifiziert zwei Methoden
    * ``int compare(T a, T b)``
    * ``boolean equals(Object o)``

#### Die Methode ``equals()``

* ``equals()`` sollte Gleichheit immer analog zur Methode ``compareTo()``
behandeln

---
Siehe DAT6 S.12-14,19,26-27
