### Sie können die Problematik beim Zugriff mehrerer Threads auf gemeinsame Ressourcen erklären

---

[Zurück](400threads.md)

Wird ein Thread unterbrochen, während er auf eine Ressource zugreift, erfolgt 
der Rest des Zugriffs beim nächsten Wechsel in den Zustand `running`. 
Verändert ein anderer Thread dazwischen die Ressource, liest der erste Thread 
falsche Daten. 

---
Siehe OOP9 S.4-12
