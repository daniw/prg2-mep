package linkedlist;

public class Main {
	
	public static void main(String[] args) {
		
		String[] text = new String[]{"A", "B", "C", "D", "E"};
		Integer[] numbers = new Integer[]{1, 2, 3, 4, 5};

		LinkedList listAlph = new LinkedList();
		LinkedList listNumb = new LinkedList();
		
		for(String i : text) {
			listAlph.insertAtTail(i);
		}
		
		for(Integer i : numbers) {
			listNumb.insertAtHead(i);
		}
		
		System.out.println("Characters inserted at tail");
		listAlph.printForwards();
		listAlph.printBackwards();
		
		System.out.println("");
		
		System.out.println("Characters inserted at head");
		listNumb.printForwards();
		listNumb.printBackwards();
		
	}
	
}
