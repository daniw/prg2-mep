package generic;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> users = new List<String>();
		
		users.insert("Reynolds");
		users.insert("Torvalds");
		users.insert("Babbage");
		
		users.print();
		
	}
	
}
