/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package comparison;

import java.util.Comparator;

/**
 *
 * @author ninux
 */
public class BikeBrandComparator implements Comparator<Bike> {
	
	@Override
	public int compare(Bike a, Bike b) {
		if(a.getBrand().compareTo(b.getBrand()) != 0) {
			return (a.getBrand().compareTo(b.getBrand()));
		}
		return 0;
	}
}
