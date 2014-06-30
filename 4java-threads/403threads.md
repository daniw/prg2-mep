### Sie kennen die wesentlichen Zustände und Zustandsübergänge von Java Threads

---

[Zurück](400threads.md)

#### Zustände

##### new
Thread erzeugt, aber noch nicht gestartet

##### ready
Thread gestartet, wird aber noch nicht ausgeführt

##### running
Thread wird ausgeführt

##### blocked
Thread wartet auf Ressource oder eine andere Bedingung (z.B. sleep)

##### dead
Thread existiert nicht mehr

##### Object lock-Pool
Thread wartet auf Lock

##### Object wait-Pool
Thread wartet bis er mit 'notify' geweckt wird

#### Zustandsübergänge

##### start
`new` -> `ready`

Der Thread wird gestartet und wartet darauf, bis der Scheduler ihn rechnen. 
lässt versetzt. 

##### Scheduler
`ready` <-> `running`

Der Scheduler lässt den Thread arbeiten oder stoppt ihn. 

##### yield
`running` -> `ready`

Der Thread verzichtet mit `yield` auf Rechenzeit. 

##### I/O operation
`running` -> `blocked`

Durch eine I/O Operation wird der Thread in den Zustand blocked versetzt. 

##### sleep
`running` -> `blocked`

Beim Aufruf von `sleep` wechselt der Thread in den Zustand blocked. 

##### join
`running` -> `blocked`

Thread wartet auf einen anderen Thread. 

##### I/O done
`blocked` -> `ready`

I/O Operation beendet. 

##### woke up
`blocked` -> `ready`

Schlafdauer abgelaufen. 

##### joins
`blocked` -> `ready`

Anderer Thread fertig. 

##### run terminates
`running` -> `dead`

Thread endet. 

##### synchronized
`running` -> `Object lock-Pool`

Thread will lock, erhält diesen aber noch nicht. 

##### lock gained
`Object lock-Pool` -> ``

Thread erhält lock

##### wait
`running` -> `Object wait-Pool`

Thread wartet auf lock. prüft diesen aber nicht aktiv, sondern wird 
benachrichtigt. 

##### notify
`Object wait-Pool` -> `Object lock-Pool`

Thread wird benachrichtigt, dass lock verfügbar ist. 

##### notifyAll
`Object wait-Pool` -> `Object lock-Pool`

Alle Threads werden benachrichtigt, dass lock verfügbar ist. 

##### timeout
`Object wait-Pool` -> `Object lock-Pool`

Ein vorher festgelegtes Timeout für die Benachrichtigung ist abgelaufen. 

##### InterruptedException
`Object wait-Pool` -> `Object lock-Pool`

Thread wurde unterbrochen. 

---
Siehe OOP10 S.8
