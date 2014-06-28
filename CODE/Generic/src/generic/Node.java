package generic;

public class Node<T> {
	
	private T data;
	private Node<T> next;
	
	public Node(Node<T> n, T d) {
		next = n;
		data = d;
	}
	
	public void setData(T d) {
		data = d;
	}
	
	public T getData() {
		return data;
	}
	
	public void setNext(Node<T> n) {
		next = n;
	}
	
	public Node<T> getNext() {
		return next;
	}
}
