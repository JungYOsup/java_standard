
public class Heap_Sort2 {

	public static void main(String[] args) {

		int[] heap = {7,6,5,8,3,5,9,1,6};
		Heap_Sort2(heap);


		for(int i=0; i<heap.length; i++) {
			System.out.print(heap[i]+",");
		}

	}

	public static void Heap_Sort2(int[] heap) {
		
		//기본적인 힙을 만들어보자 
		for(int i=1; i<heap.length;i++) {
			
			int c =i;
			do {
				int root = (c-1)/2;
				if(heap[root]<heap[c]) {
					int temp = heap[root];
					heap[root] = heap[c];
					heap[c] = temp;
				}
				c=root;
			}while(c!=0);
		
			
		}
				
		//크기를 줄여가면서 반복적으로 힙을 구성
		for(int i=heap.length-1; i>=0; i--) {
			
			int temp = heap[0];
			heap[0] = heap[i];
			heap[i]=temp;
			
			int root =0;
			int c = 1;
			do {
				c=2*root+1;
				
				//**c<i-1 => 내가 이해한게 맞나? 
				if(c<i-1&&heap[c]<heap[c+1]) {
					c++;
				}
				
				//**c<i => 내가 이해한게 맞나?
				if(c<i&&heap[root]<heap[c]) {
					int temp2 = heap[root];
					heap[root] = heap[c];
					heap[c] = temp2;
				}
				root=c;
			}while(c<i);
			
			
		}
		
		
	}
}
