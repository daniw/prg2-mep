package stack;

public class StackArray {
	
	private int size;
	private int top = 0;
	
	private Object[] stack;
	
	public StackArray(int s) {
		size = s;
		stack = new Object[size];
	}
	
	public void push(Object o) {
		stack[top] = o;
		top++;
	}
	
	public Object pop() {
		top--;
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
	
	public boolean isFull() {
		return (top == size);
	}
	
}
