package linkedlist;

import java.util.Iterator;

public class LinkedList<T> {

	private Node head;
	private Node tail;
	
	public LinkedList() {
		head = null;
		tail = null;
	}
	
	public void insertAtHead(Object obj) {
		if(head == null) {	// list is empty
			Node nn = new Node(obj);	// init node
			nn.setNext(null);			 
			nn.setPrevious(null);		
			tail = nn;					// set node as tail
			head = nn;					// set node as head
		}
		else {	// list is not empty
			Node nn = new Node(obj);	// init node
			nn.setPrevious(null);		 
			nn.setNext(head);			
			head.setPrevious(nn);		 
			head = nn;					// set node as head
		}
	}
	
	public void insertAtTail(Object obj) {
		if(head == null){	// list is empty
			Node nn = new Node(obj);	// init node
			nn.setNext(null);
			nn.setPrevious(null);
			tail = nn;
			head = nn;
		}
		else {	// list is not empty
			Node nn = new Node(obj);	// init node
			nn.setNext(null);
			nn.setPrevious(tail);
			tail.setNext(nn);
			tail = nn;
		}
	}
	
	public void printForwards() {
		Node current = head;
		System.out.print("Forwards: ");
		while(current != null) {
			System.out.print(current.getData() + "; ");
			current = current.getNext();
		}
		System.out.print("\n");
	}
	
	public void printBackwards() {
		Node current = tail;
		System.out.print("Backwards: ");
		while(current != null) {
			System.out.print(current.getData() + "; ");
			current = current.getPrevious();
		}
		System.out.print("\n");
	}
}
