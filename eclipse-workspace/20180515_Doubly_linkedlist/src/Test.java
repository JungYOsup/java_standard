
public class Test {

	public Node head;
	public Node tail;
	
	public Test() {
		
		head =null;
		tail =null;
	}
	
	
	public void add(int NewItem) {
		 
		Node newNode = new Node(NewItem); 
		
		head = newNode;
			
		head.next=newNode;
		tail = newNode;
		
		
		
	}
	
	
	
	
}

class Node{
	
	int data;
	Node next;
	
	public Node(int input) {
		
		this.data = input;
		this.next = null;
	}
		
}
