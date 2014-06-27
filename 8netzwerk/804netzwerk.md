### Sie kennen den Lebenszyklus eines TCP- und UPD-Servers und können die einzelnen Elemente mit einem Java Programm in Beziehung stellen

---

[Zurück](800netzwerk.md)

#### Lebenszyklus eines TCP Servers

1. Server Socket erzeugen
2. Mit ``accept()`` Methode auf Verbindung warten
3. Ein- und Ausgabestrom mit erhaltenem Socket verknüpfen
4. Daten lesen/schreiben (entsprechend dem vereinbarten Protokoll)
5. Stream von Client und Socket schliessen
6. Socket schliessen oder erneut auf ``accept()`` warten

#### Lebenszyklus eines UDP Servers

1. Datagram Socket erzeugen
2. Auf Datagram Paket warten
3. Datagram Paket lesen mit dem Client Daten, Adresse und Port
4. Neues Datagram Paket erstellen und and spezifizierten Client senden
5. Socket schliessen oder erneut auf Datagramm Paket warten

---
Siehe NWP1 S.29, NWP2 S.15
