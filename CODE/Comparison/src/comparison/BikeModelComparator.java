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
