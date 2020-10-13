import java.util.Arrays;
import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayStack_Prac {
	
	//후입선출 (나중에 들어간게 가장먼저 나온다)
	//pop(가장마지막 삭제),peek(가장마지막값),push(값넣기)
	private Object[] a;
	private int top;
	public int size;
	public ArrayStack_Prac() {
		
		this.a = new Object[1];
		this.top = -1;
		this.size = top+1;
		
	}
	
	public Object peek() {
		
		if(size==0) {
			throw new EmptyStackException();
					
		}
		
		System.out.println(Arrays.toString(a));
		
		return a[top];
		
	}
	
	public void push(Object newItem) {
		
		if(size==a.length) {
			
			resize(a.length*2);
		}
		a[++top]= newItem;
		size++;
		System.out.println(Arrays.toString(a));
	}
	
	public Object pop() {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		Object deleteValue = a[top];
		a[top--]=null;
		size--;
		if(size>0&&size==a.length/4) {
			
			resize(a.length/2);
		}
		
		System.out.println(Arrays.toString(a));
		
		return deleteValue;
		
		
	}
	
	public void resize(int Newsize) {
		
		Object[] b = new Object[Newsize];
		
		for(int i=0; i<size; i++) {
			b[i] = a[i];
		}
		
		a = b;
		
	}
	
	
	

}
