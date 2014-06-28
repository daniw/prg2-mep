package stack;

public class Main {
	
	public static void main(String[] args) {
		
		String[] text = new String[]{"Foo!\n", "is ", "name ", "My "};
		
		StackArray sa = new StackArray(6);
		StackArrayList sal = new StackArrayList();
		
		for(String i : text) {
			sa.push(i);
			sal.push(i);
		}
		
		while(!sa.isEmpty()) {
			System.out.print(sa.pop());
		}
		
		while(!sal.isEmpty()) {
			System.out.print(sal.pop());
		}
		
	}
	
}
