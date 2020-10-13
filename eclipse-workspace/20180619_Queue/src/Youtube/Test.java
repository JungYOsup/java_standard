package Youtube;
/*내부 클래스의 장점
내부 클래스를 사용하면 다음과 같은 장점을 가질 수 있습니다.
 
1. 내부 클래스에서 외부 클래스의 멤버에 손쉽게 접근할 수 있게 됩니다.
2. 서로 관련 있는 클래스를 논리적으로 묶어서 표현함으로써, 코드의 캡슐화를 증가시킵니다.
3. 외부에서는 내부 클래스에 접근할 수 없으므로, 코드의 복잡성을 줄일 수 있습니다.*/

import java.util.NoSuchElementException;

public class Test {

	public static void main(String[] args) {
		
		
		Queue<Integer> queue = new Queue();
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue.remove());
		System.out.println(queue.remove());
		
	}
}

class Queue<T>{
	
	class Node<T>{
		private T data;
		private Node<T> next;
		
		public Node(T data) {
			this.data =data;
		}
	}
	private Node<T> first;
	private Node<T> last;
	
	public void add(T item) {
		Node<T> t = new Node<T>(item);
		
		if(last !=null) {
			last.next = t;
		}
		
		last = t;
		
		if(first ==null) {
			first = last;		
		}
		
		
	}
	
	public T remove() {
		if(first ==null) {
			throw new NoSuchElementException();
		}
			
		T data = first.data;
		first = first.next;
	
		
		if(first == null) {
			last= null;
			
		}
		return data;
		
	}
	public T peek() {
		
		if(first ==null) {
			throw new NoSuchElementException();
		}
		
		return first.data;
		
	}
	
}
