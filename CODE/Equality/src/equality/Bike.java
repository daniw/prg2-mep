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