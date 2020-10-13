import java.util.Arrays;

public class ArrayQueue_prac {

	public Object[] a;
	public int front,rear,size;
	
	public ArrayQueue_prac() {
		
		this.a=new Object[2];
		this.front =0;
		this.rear=0;
		this.size=0;
							
	}
	
	public void add(Object newItem) {
		
		//rear+1%a.length == front 라는것은 꽉찼다는 의미
		if(((rear+1)%a.length)==front){
			
			resize(2*a.length);
			
		}
		
		rear=rear+1;
		a[rear] = newItem;
		size++;
		
		System.out.println(Arrays.toString(a));
		
	}
	
	
	public void resize(int Newsize) {
		
		
		Object[] b = new Object[Newsize];
		
		
		for(int i=1,j=front+1; i<size+1; i++) {
			
			b[i] = a[j];
		}
		
		front =0;
		rear = size;
		a=b;
		
		
	}




}
