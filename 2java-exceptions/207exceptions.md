### Sie können checked und unchecked Exceptions erklären

---

[Zurück](200exceptions.md)

#### Checked Exception
Eine *checked Exception* ist eine Exception, welche zwingend behandelt 
werden **muss**. Andernfalls reklamiert der Compiler. 

Behandelt werden heisst, dass entweder ein ``throws`` im entsprechenden
Methodenkopf deklariert wird **oder** ein ``try`` und ``catch`` 
Block die Exception behandelt.

#### Unchecked Exception
Eine *unchecked Exception* ist eine Exception, welche behandelt **oder** 
weitergegeben werden kann. Die Weitergabe geschieht automatisch ohne
ein ``throws`` im Methodenkopf. Es darf aber ein ``try`` und 
``catch`` erstellt werden und es darf auch explizit eine Exception
mit ``throw`` geworfen werden. Im Gegensatz zu checked Exceptions
muss hierzu aber kein ``throws`` im Methodenkopf deklariert werden.

---
Siehe OOP6 S.23
