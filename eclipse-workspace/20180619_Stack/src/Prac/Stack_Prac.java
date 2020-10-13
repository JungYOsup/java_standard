package Prac;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack_Prac {
	
	Node top;
	int size;
	public Stack_Prac() {
		
		this.top =null;
		size=0;
	}
	
	public void push(Object data) {
		
		Node node = new Node(data);
		node.next =top; //코드가 조금 이상하다. 하지만 결과적으로는 가능
		top = node;
		size++;
		
	}
	public Object peek() {
		
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.data; 
		
	}
	
	public Object pop() {
		
		if(isEmpty()) {
			throw new NoSuchElementException();
		}else {
			Node temp1 = top;
			Object deleteData = top.data;
			top=top.next;
			temp1 =null;
			size--;
			
			return deleteData;
		}
		
		
		
	}
	
	public boolean isEmpty() {
		
		return size==0?true:false;
	}
	
	

}

class Node{
	
	public Object data;
	public Node next;
	
	public Node(Object data) {
		
		this.data = data;
		this.next = null;

	}
	
}
