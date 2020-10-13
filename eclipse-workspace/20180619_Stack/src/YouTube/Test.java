package YouTube;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class Test {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack();
		
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.size());
	}
	
}

class Stack<T>{

		
	private Node<T> top;
	private int size=0;
	
	
	public T pop() {
		if(isEmpty()) {
			throw new NoSuchElementException();
		}
		
		T item =top.data;
		top = top.next;
		size--;
		
		return item;
		
	}
	
	public void push(T item) {
		Node<T>t = new Node<T>(item);
		t.next = top;
		top = t;
		size++;
		
	}
	
	public T peek() {
		if(isEmpty()) {
			throw new EmptyStackException();
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return top == null;
	}
	
	public int size() {
		
		return size;
	}
	
}

class Node<T>{
	public T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data =data;
	}
	
}

