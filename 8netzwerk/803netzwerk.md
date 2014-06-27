### Sie kennen die Bestandteile eines Datagramm Pakets und können diese in einem Programm erstellen

---

[Zurück](800netzwerk.md)

#### Bestandteile

Ein Datagramm Packet besteht aus

* einem Byte-Buffer
* der Grösse des Buffers (max. 65`507 Byte)
* der IP-Adresse des Zielhosts
* der Port-Nummer des Dienstes, der auf dem Zielhost erreicht werden soll
* IP-Adresse und Port-Nummer des Senders

#### Implementierung

Um ein Packet zu senden braucht es folgende Aktionen 

* den Speicherplatz angeben, an dem die Daten abgelegt werden sollen
* die IP-Adresse und den Port des Ziel-Host angeben
* Ein ``DatagramPacket`` Objekt anlegen

```java
    ...
    byte[] data = new byte[1024];
    InetAddress addr = InetAddress.getByName("localhost");
    int port = 4711;
    DatagramPacket packet = new DatagramPacket(data, data.length, addr, port);
    
    socket.send(packet);
```

---
Siehe NWP2 S.10-11
