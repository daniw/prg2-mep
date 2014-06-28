package queue;

public class QueueArray {
	
	private int size;
	private int numberOfElement = 0;
	private int in = 0;
	private int out = 0;
	private Object[] queue;
	
	public QueueArray(int s) {
		size = s;
		queue = new Object[size];
	}
	
	public void enqueue(Object o) {
		numberOfElement++;
		if(in == size) {
			in = 0;
		}
		queue[in] = o;
		in++;
	}
	
	public Object dequeue() {
		numberOfElement--;
		if(out == size) {
			out = 0;
		}
		Object o = queue[out];
		out++;
		return o;
	}
	
	public boolean isEmpty() {
		return (numberOfElement == 0);
	}
	
	public boolean isFull() {
		return (numberOfElement == size);
	}
	
}