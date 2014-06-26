package myexception;

public class MyException extends RuntimeException {
	
	public MyException(String s) {
		super("MyExcpetion:" + s);
	}	
	
}
