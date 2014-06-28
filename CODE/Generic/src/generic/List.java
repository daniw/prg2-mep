package generic;

public class List<T> {
	
	private Node<T> head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void insert(T d) {
		head = new Node<T>(head, d);
	}
	
	public boolean isFound(T d) {
		Node<T> actualNode = head;
		while( (actualNode != null) && !d.equals(actualNode.getData())) {
			actualNode = actualNode.getNext();
		}
		if(actualNode == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void remove(T d) {
		Node<T> actualNode = head;
		Node<T> previousNode = null;
		while( (actualNode != null) && !d.equals(actualNode.getData())) {
			previousNode = actualNode;
			actualNode = previousNode.getNext();
		}
		if(actualNode != null) {
			if(actualNode == head) {
				head = actualNode.getNext();
			}
			else {
				previousNode.setNext(actualNode.getNext());
			}
		}
	}
	
	public void print() {
		Node<T> actualNode = head;
		System.out.println("CONTENT:");
		while(actualNode != null) {
			System.out.println("\t" + actualNode.getData());
			actualNode = actualNode.getNext();
		}
	}
	
}
