package exceptions;

import java.lang.ArrayIndexOutOfBoundsException;

public class MyArray  {
	
	private int[] a = new int[5];
	
	public MyArray() {
		
	}
	
	public int getElement(int index) throws ArrayIndexOutOfBoundsException {
		if(index >= a.length || index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		}
		return a[index];
	}
	
}
