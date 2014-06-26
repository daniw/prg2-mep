package myexception;

public class Main {
	
	public static void main(String[] args) {
		
		MyArray b = new MyArray();
		
		try {
			int c = b.getElement(7);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			throw new MyException(e1.getMessage());
		}
		
	}
	
}
