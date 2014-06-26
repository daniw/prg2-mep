package myexception;

public class MyArray  {
	
	private int[] a = new int[5];
	
	public MyArray() {
		
	}
	
	public int getElement(int index) throws MyException {
		if(index >= a.length || index < 0) {
			throw new MyException("Index " + index + " does not exist!");
		}
		return a[index];
	}
	
}

