### Sie können die Begriffe Prozess und Thread sowie Nebenläufigkeit erklären

---

[Zurück](400threads.md)

#### Prozess (process, task) 
ein ablaufendes Programm, eine dynamische Folge von Aktionen. 
Oft auch “schwergewichtig“ genannt. 

#### Thread (auch: Aktivitätsträger oder leichtgewichtiger Prozess)
Ausführungsstrang mit minimalem Kontext (Stack und Register) in der 
Abarbeitung eines Programms. Ein Thread ist Teil eines Prozesses. 
Alle Threads, die zu ein und demselben Prozess gehören, benutzen 
denselben Adressraum sowie weitere Ressourcen (Betriebsmittel) dieses 
Prozesses gemeinsam.

#### Nebenläufigkeit
* Mehrere Vorgänge heissen nebenläufig, wenn sie weitgehend
voneinander unabhängig bearbeitet werden können.
* Bei einem "Schnappschuss" des Gesamtsystems befinden
sich mehrere Prozesse "gleichzeitig" zwischen Start- und
Endpunkt, d.h. in Ausführung.
* Mit der Nebenläufigkeit von Prozessen findet zugleich ein
Wettstreit um notwendige Ressourcen (Betriebsmittel) statt.
* Zwei nebenläufige Prozesse sind also nur bezüglich ihrer
Abarbeitung unabhängig; sie sind jedoch indirekt voneinander
abhängig, wenn sie auf gleiche Ressourcen zugreifen wollen
oder auf ein Ereignis warten müssen.
* Bemerkung: Analoges gilt für Threads.

---
siehe OOP8 S.8-11
