### Sie können das Prinzip des Exception Handlings erklären

---

[Zurück](200exceptions.md)

#### Phasen
Es gibt mehrere Phasen beim Exception Handling

* Definieren einer Exception
* Signalisieren, dass eine Exception ausgelöst werden kann mit ``throws``
* Eine Exception auslösen mit ``throw``
* Eine ausgelöse Exception behandeln mit ``try`` und ``catch``
* Aufräumen mit ``finally``

#### Try, catch & finally
Macht man einen Programmabschnitt, welcher eine Exception auslösen kann,
so führt man diesen kritischen Abschnitt in einem ``try`` Block aus.
Sollte dort eine Exception entstehen, wird der Code im ``catch`` Block
ausgeführt und anschliessend (falls vorhanden) der ``finally`` Block.
Falls keine Exception auftritt im ``try`` Block, so wird der Abschnitt
im ``catch`` und ``finally`` einfach ausgelassen bei der Ausführung.

---
Siehe OOP6 S.10-11
