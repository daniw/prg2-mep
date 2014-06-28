package stack;

import java.util.ArrayList;

public class StackArrayList {
	
	private ArrayList stack = new ArrayList();
	
	public StackArrayList() {
		
	}
	
	public void push(Object o) {
		stack.add(o);
	}
	
	public Object pop() {
		return stack.remove(stack.size() - 1);
	}
	
	public boolean isEmpty() {
		return stack.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}
	
}
