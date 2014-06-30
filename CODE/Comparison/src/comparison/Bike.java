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