import java.util.Arrays;
import java.util.EmptyStackException;

public class ArrayStack {
	
	//스택은 제일위의 값 top을 push(값을 집어넣음) , pop(값을 삭제시킴)을 함 
	//스택은 단순정렬 리스트로 나타낼수 있다.
	
	private Object[] a;
	private int top;
	private int size;
	
	public ArrayStack() {
		
		this.a= new Object[1];
		this.top = -1;
		this.size = top+1;
				
	}
	
	public Object peek() {
		
		if(top == -1) {
			throw new EmptyStackException();
		}
			
			
		return a[top];
	}
	
	public void push(Object NewItem) {
		
		if(size==a.length) {
			resize(2*a.length);
		}
		
		a[++top] = NewItem;
		size++;
		
		System.out.println(Arrays.toString(a));
	}
	
	public Object pop() {
		
		if(top ==-1) {
			throw new EmptyStackException();
		}
		
		Object deleteValue = a[top];
		a[top]=null;
		top--;
		
		if(size>0 && size==a.length/4) {
			resize(a.length/2);
		}
		System.out.println(Arrays.toString(a));
		return deleteValue;
	}
	
	public void resize(int NewSize) {
		
		Object[] b = new Object[NewSize];
		
		for(int i=0; i<size; i++) {
			
			b[i] = a[i];
		}
		
		a = b;
		
		
		
	}
	

}
