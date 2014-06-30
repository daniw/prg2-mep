### Sie können die Interfaces Comparable und Comparator für einfache Fälle implementieren

---

[Zurück](600vergleich.md)

#### Implementation von ``Comparable``

```java
package comparison;

public class Auto implements Comparable<Auto> {
	
	private String brand;
	private String model; 
	private int seats;
	private boolean trailer;
	
	public Auto(String brand, String model, int seats, boolean trailer) {
		this.brand = brand;
		this.model = model;
		this.seats = seats;
		this.trailer = trailer;
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
	
	public int getSeats() {
		return seats;
	}
	
	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public boolean getTrailer() {
		return trailer;
	}
	
	public void setTrailer(boolean trailer) {
		this.trailer = trailer;
	}

	@Override
	public int compareTo(Auto other) {
		// 1. brand
		// 2. model
		// 3. seats
		if(this.brand.compareTo(other.getBrand()) != 0) {
			return this.brand.compareTo(other.getBrand());
		}
		if(this.model.compareTo(other.getModel()) != 0) {
			return this.model.compareTo(other.getModel());
		}
		if(this.seats - other.getSeats() != 0) {
			return (this.seats - other.getSeats());
		}
		if(this.trailer && !other.getTrailer()) {
			return 1;
		}
		if(this.trailer && other.getTrailer() || !this.trailer && !other.getTrailer()) {
			return 0;
		}
			
		return -1;

	}
	
}
```

#### Implementation von ``Comparator``

```java
package comparison;

import java.util.Comparator;

public class BikeBrandComparator implements Comparator<Bike> {
	
	@Override
	public int compare(Bike a, Bike b) {
		if(a.getBrand().compareTo(b.getBrand()) != 0) {
			return (a.getBrand().compareTo(b.getBrand()));
		}
		return 0;
	}
}
```

```java
package comparison;

import java.util.Comparator;

public class BikeModelComparator implements Comparator<Bike> {

	@Override
	public int compare(Bike a, Bike b) {
		if(a.getModel().compareTo(b.getModel()) != 0) {
			return (a.getModel().compareTo(b.getModel()));
		}
		return 0;
	}	
}
```

```java
package comparison;

import java.util.Comparator;

public class Bike {
	
	private String brand;
	private String model;
	private int wheels;
	private boolean suspension;
	
	public Bike(String brand, String model, int wheels, boolean suspension) {
		this.brand = brand;
		this.model = model;
		this.wheels = wheels;
		this.suspension = suspension;
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
	
	public int getWheels() {
		return wheels;
	}
	
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	
	public boolean getSuspension() {
		return suspension;
	}
	
	public void setSuspension(boolean suspension) {
		this.suspension = suspension;
	} 
	
}
```

#### Verwendung

```java
package comparison;

public class Main {
	
	public static void main(String[] args) {
		
		Auto a = new Auto("Volvo", "XC70", 5, true);
		Auto b = new Auto("Volvo", "XC70", 5, false);
		
		Bike x = new Bike("Trek", "Dirt", 2, true);
		Bike y = new Bike("Cilo", "City", 2, true);
		
		BikeBrandComparator bbc = new BikeBrandComparator();
		BikeModelComparator bmc = new BikeModelComparator();
		
		System.out.print("Auto comparisons: ");
		System.out.print("\t" + a.compareTo(b) + "; ");
		System.out.print("\t" + a.compareTo(a) + "; ");
		System.out.print("\t" + b.compareTo(a) + "\n");
		
		System.out.print("Bike brand compare: ");
		System.out.print("\t" + bbc.compare(x, y) + "; ");
		System.out.print("\t" + bbc.compare(x, x) + "; ");
		System.out.print("\t" + bbc.compare(y, x) + "\n");
		
		System.out.print("Bike model compare: ");
		System.out.print("\t" + bmc.compare(x, y) + "; ");
		System.out.print("\t" + bmc.compare(x, x) + "; ");
		System.out.print("\t" + bmc.compare(y, x) + "\n");
		
	}
}
```

---
Siehe DAT6 S.16,21
