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
