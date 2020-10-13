import java.util.Arrays;
import java.util.NoSuchElementException;


public class ArrayList {
	
	//삽입 , 삭제 , 찾기 
	//삽입할때는 맨뒤 , 도중에 삽입이 가능하고 정해진 배열보다 더 많은 값이 삽입 될때는 배열의 크기를 두배 증가시킨다.
	// 삭제시에는 저장된 데이터가 배열의 크기보다 1/4밖에 안들어 갈시 배열의 크기를 1/2로 줄게 만든다.
	private int[] Array; 
	private int size;
	
	public ArrayList() {
	
		this.Array=new int[1];
		this.size=0;
		
	}
	
	
	public int peek(int n) {
		
		if(size==0) {
			throw new NoSuchElementException();
		}
		
		return Array[n];
	}
	
	public void insertLast(int newItem) {
		
		if(Array.length == size) {
			resize(2*Array.length);
		}
		
		Array[size++] = newItem;
		
					
		System.out.println(Arrays.toString(Array)+"="+"사이즈는 "+size);
		
	}
	
	public void insert(int newitem , int index) {
		
		if(Array.length == size) {
			resize(2*Array.length);
		}
		
		for(int i=size-1; i>=index; i--) {
			Array[i+1] = Array[i]; 		
			
		}
		Array[index] = newitem;
		
		size++;
		
		System.out.println(Arrays.toString(Array));
		
	}
	
	public int delete(int k) {
		
		
		if(k>=size) {
			throw new NoSuchElementException();
		}
		
	
		
		int deleteValue = Array[k];
		
		for(int i=k; i<size; i++) {
			
			Array[i]=Array[i+1];
		}
		size--;
		
		if(size>0 && size==Array.length/4) {
			
			resize(Array.length/2);
		}
		
		System.out.println(Arrays.toString(Array));
		
		return deleteValue;
		
	}
	
	
	
	public void resize(int newSize) {
		
		int[] t = new int[newSize];
			
		for(int i=0; i<size; i++) {
				
			
			t[i] = Array[i];
		}
		
		Array = t;
		
	}
	
}
