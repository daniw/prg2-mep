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
