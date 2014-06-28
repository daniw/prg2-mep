package queue;

import java.util.LinkedList;

public class QueueList {
	
	private LinkedList queue = new LinkedList();
	
	public QueueList() {
		
	}
	
	public void enqueue(Object o) {
		queue.addLast(o);
	}
	
	public Object dequeue() {
		return queue.removeFirst();
	}
	
	public boolean isEmpty() {
		return queue.isEmpty();
	}
	
	public boolean isFull() {
		return false;
	}
	
}
