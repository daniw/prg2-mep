package list;

public class List {
	
	private Node head;
	
	public List() {
		head = null;
	}
	
	public boolean isEmpty() {
		return (head == null);
	}
	
	public void insert(String d) {
		head = new Node(head, d);
	}
	
	public boolean isFound(String d) {
		Node actualNode = head;
		while((actualNode != null) && !d.equals(actualNode.getData())) {
			actualNode = actualNode.getNext();
		}
		if(actualNode == null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public void remove(String d) {
		Node actualNode = head;
		Node previousNode = null;
		while((actualNode != null) && !d.equals(actualNode.getData())) {
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
		Node actualNode = head;
		while(actualNode != null) {
			System.out.println(actualNode.getData());
			actualNode = actualNode.getNext();
		}
	}
	
}
