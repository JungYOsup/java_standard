import java.util.NoSuchElementException;

public class ListQueue {
	
	
	
	private Node front,rear;
	private int size;
	
	public ListQueue() {

		this.front=null;
		this.rear=null;
		this.size=0;
	}
	
	public void add(Object newItem) {
		
		Node newNode = new Node(newItem);
		
		if(size==0) {
			front = newNode;
		}else {
			rear.next = newNode;
			
		}
		rear =newNode;
		size++;
			
		
		
	}
	
	public Object remove() {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		Object frontItem = front.data;
		
		front = front.next;
		
		if(size==0) {
			rear=null;
		}
		size--;
		
		return frontItem;
		
		
		
	}
	
	

}


class Node{
	
	public Object data;
	public Node next;
	
	public Node(Object input) {
		
		this.data=input;
		this.next=null;
	}
	
	
	
}
