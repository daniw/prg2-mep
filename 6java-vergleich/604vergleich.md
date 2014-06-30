### Sie können die Wichtigkeit von equals() begründen und die Methode equals() gemäss Vier-Schritt-Schema adäquat implementieren

---

[Zurück](600vergleich.md)

#### Bedeutung von ``equals()``

* ``equals()`` beantwortet die Frage nach Gleichheit
* viele Datenstrukturen und andere Klassen sind auf ``equals()`` angewiesen

#### Implementierung von ``equals()``

1. Test auf Identität
2. Test auf ``null``
3. Test auf Typen-Vergleichbarkeit
4. Vergleich relevanter Instanzvariablen

##### Beispiel

```java
package equality;

public class Bike {
	
	private String brand;
	private String model;
	
	public Bike(String brand, String model) {
		this.brand = brand;
		this.model = model;
	}
	
	@Override
	public boolean equals(Object other) {
		if(this == other) {		// test on identity
			return true; 
		}
		if(other == null) {		// test on null
			return false; 
		}
		if(this.getClass() != other.getClass()) {	// test on class-type
			return false; 
		}
		if(!this.brand.equals(((Bike)other).brand)) {	// test on first field
			return false; 
		}
		if(!this.model.equals(((Bike)other).model)) {	// test on second field
			return false; 
		}
		return true;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}	
}
```

```java
package equality;

public class Main {
	
	public static void main(String[] args) {
		
		Bike a = new Bike("Trek", "Dirt");
		Bike b = new Bike("Trek", "Rock");
		Bike c = new Bike("Cilo", "City");
		
		checkEquality(a, a);
		checkEquality(a, b);
		checkEquality(a, c);
		checkEquality(b, b);
		checkEquality(b, c);
		checkEquality(c, c);
		
	}
	
	public static void checkEquality(Object x, Object y) {
		System.out.println("Are bikes " + ((Bike)x).getBrand() + " " + 
				((Bike)x).getModel() + " and " + ((Bike)y).getBrand() 
				+ " " + ((Bike)y).getModel() + " the same? ");
		if(x.equals(y)) {
			System.out.println("\tYes, they are the same!\n");
		}
		else {
		System.out.println("\tNo, they are not the same!\n");
		}
	}	
}
```

---
Siehe DAT4 S.13-18
