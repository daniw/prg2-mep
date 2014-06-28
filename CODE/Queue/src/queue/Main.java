package queue;

public class Main {
	
	public static void main(String[] args) {
		
		String[] customers = new String[]{"Arnold", "Benny", "Charles"};
		
		QueueArray qa = new QueueArray(3);
		QueueList ql = new QueueList();
		
		for(String i : customers) {
			qa.enqueue(i);
			ql.enqueue(i);
		}
		
		System.out.println("Customer waiting in");
		System.out.print("\tthe Array-Store: ");
		while(!qa.isEmpty()) {
			System.out.print(qa.dequeue() + "; ");
		}
		
		System.out.print("\n\tthe List-Store: ");
		while(!ql.isEmpty()) {
			System.out.print(ql.dequeue() + "; ");
		}
		
		System.out.println("\nEnd of the queue lists");
	}
	
}
