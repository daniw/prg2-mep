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
