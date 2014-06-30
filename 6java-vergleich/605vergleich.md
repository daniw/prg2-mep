### Sie können die drei Punkte des hashCode()-Contractes erläutern und die Methode hashCode() für einfache Fälle implementieren

---

[Zurück](600vergleich.md)

#### ``hashCode()`` Contract

1. ``hashCode()`` liefert immer die selbe Rückgabe für die gleiche Eingabe
2. ``hashCode()`` liefert die gleiche Rückgabe für zwei gleiche Eingaben 
3. ``hashCode()`` liefert für unterschieddliche Eingaben **meistens**
unterschiedliche Rückgaben

* **Achtung:** Wird ``equals()`` überschrieben, so sollte auch
``hashCode()`` überschrieben werden

#### Einfache Implementierung

```java
package hashing;

public class Bike {
	
	private String brand;
	private String type;
	private int wheelsize;
	
	public Bike(String brand, String type, int wheelsize) {
		this.brand = brand;
		this.type = type;
		this.wheelsize = wheelsize;
	}
	
	@Override
	public int hashCode() {
		int hash = 1;		// first prime (start-value)
		int prime = 43;		// second prime (multiplicator)
		
		hash = (hash*prime) + this.brand.hashCode();
		hash = (hash*prime) + this.type.hashCode();
		hash = (hash*prime) + wheelsize;
	
		return hash;
	}
	
}
```

```java
package hashing;

public class Main {
	
	public static void main(String[] args) {
		
		Bike[] bikes = new Bike[3];
		
		bikes[0] = new Bike("Trek", "Dirt", 28);
		bikes[1] = new Bike("Cilo", "City", 24);
		bikes[2] = new Bike("Trek", "Dirt", 28);
		
		for(Bike i : bikes){
			System.out.println(i.hashCode());
		}
	}
}
```

---
Siehe DAT4 S.25-27
