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
