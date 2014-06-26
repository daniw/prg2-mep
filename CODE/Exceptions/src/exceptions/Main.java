package exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
	
	public static void main(String[] args) {
		
		MyArray b = new MyArray();
		
		try {
			int c = b.getElement(7);
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index does not exist!");
		}
		catch (Exception e2) {
			System.out.println(e2.getMessage());
		}
		
	}
	
}
