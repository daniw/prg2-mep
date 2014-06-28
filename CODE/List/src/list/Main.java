package list;

public class Main {
	
	public static void main(String[] args) {
		
		String[] names = new String[]{"Richard", "Torvalds", "Babbage"};
		
		List users = new List();
		
		for(String i : names) {
			users.insert(i);
		}
		
		users.print();
		
	}
	
}
