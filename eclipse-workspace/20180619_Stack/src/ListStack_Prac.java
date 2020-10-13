import java.util.NoSuchElementException;

public class ListStack_Prac {
		
	public Node top;
	public int size;
	
	public ListStack_Prac() {
			
		this.top = null;
		this.size = 0;
	
	}
	
	
	
	public Object peek() {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		return top.data;
		
		
	}
	
	public void push(Object input) {
		
		Node newItem = new Node(input);
		
		newItem.next = top;
		top = newItem;
		size++;
		
		
		
		
	}
	
	public Object pop() {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		Node temp1 = top;
		Object DeleteValue = temp1.data;
		//temp1=null; 노드는 어차피 연결이 안되면 삭제되는것이므로 굳이 Null을 해줄필요가 없다?
		top = top.next;
		
		size--;
		
		
		return DeleteValue;
	}
	
	

}



