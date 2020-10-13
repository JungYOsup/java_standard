package Prac;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Stack_Prac2 {


	Node_Prac top;
	int size;

	public Stack_Prac2() {

		top = null;
		size = 0;

	}
	
	
	public void push(int NewData) {
		
		Node_Prac newNode = new Node_Prac(NewData);
		
		if(top ==null) {
			top = newNode;
		}else {
			
			Node_Prac temp = top;
			top = newNode;
			newNode.next = temp;	
		}
		size++;
			
		
	}
	
	public int peek() {
		
		if(size==0) {
			throw new EmptyStackException();
		}
		return top.data; 
	}
	
	public int pop() {
		
		if(size==0) {
			
			throw new NoSuchElementException();
		}
		
				
		int DeleteValue = top.data;
		top = top.next;
		size--;
		
		return DeleteValue;
		
	}




}

class Node_Prac{

	public int data;
	public Node_Prac next;

	public Node_Prac(int NewData) {

		this.data = NewData;
		this.next = null;

	}


}
