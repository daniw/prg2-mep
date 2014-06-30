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
