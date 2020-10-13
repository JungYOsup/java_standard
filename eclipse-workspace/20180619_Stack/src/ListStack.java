import java.util.EmptyStackException;


public class ListStack {

	private Node top; //단순배열하기 전에는 top은 마지막 index를 가리켰지만 , 지금은 마지막 노드를 가리킴
	private int size;

	public ListStack() {
		this.top= null;
		this.size = 0;

	}

	public Object peek() {

		if(size==0) {

			throw new EmptyStackException();
		}

		return top.data;
	}

	public void push(Object input) {

		if(size==0) {
			Node newNode = new Node(input);
			top=newNode;
			size++;
		}else {
			
			Node temp1 = top;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.prev = temp1;
			top = newNode;
			size++;
			
			System.out.println("size는?" + size);
		}

		


	}

	public Object pop() {

		if(size==0) {

			throw new EmptyStackException();
		}
			
		Node temp1 = top;
		Object deleteNode = temp1.data;
		top =null;
		top = temp1.prev; 
		size--;
		
				
		return deleteNode;

	}
	
	


}


class Node{

	public Object data;
	public Node next;
	public Node prev;

	public Node(Object input) {
		this.data=input;
		this.next=null;
		this.prev=null;

	}


}
