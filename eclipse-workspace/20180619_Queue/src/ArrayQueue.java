import java.util.Arrays;
import java.util.NoSuchElementException;

public class ArrayQueue {
	
	private Object[] a;
	private int front;
	private int rear;
	private int size;
	
	public ArrayQueue() {

		this.a=new Object[2]; //왜 초기에 크기가 2인배열을 생성했을까?
		
		this.front=0;
		this.rear=0;
		this.size=0;
	
	
	}
	
	public void add(Object NewItem) {
		
		if((rear+1)%a.length==front) {
			resize(2*a.length);
		}
		
		rear = (rear+1)%a.length;
		a[rear] = NewItem;
		size++;
		
		System.out.println(Arrays.toString(a));
		
		
	}
	
	public Object remove() {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		if(front==rear) {
			System.out.println("아무값도 없습니다.");
		}
		
		front=(front+1)%a.length;
		
		Object item = a[front];
		
		a[front] =null;
		size--;
		
		if(size>0 && size==a.length/4) {
			resize(a.length/2);
			
		}
		System.out.println(Arrays.toString(a));
		
		return item;
		
		
	}
	
	public void resize(int NewSize) {
		
		Object[] b = new Object[NewSize];
		
		for(int i=1,j=front+1; i<size+1; i++,j++) {
			
			b[i] = a[j%a.length];
		}
		
		front =0;
		rear = size;
		a=b;
		
	}
	
	

}
