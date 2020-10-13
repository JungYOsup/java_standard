package Youtube;

import java.util.Arrays;

public class Test {
	
	
	
	//걸리는 시간복잡도는 
	// 3,5,2,1,4 
	// 처음에는 3과2 비교 , 5,2 비교 이런식으로 하면 처음에 총 4번검사
	// 그다음 5가 맨뒤로 고정되어 있으므로 3번검사
	// 이런식으로 반복하다보면 배열의 갯수가 n개 일때 1+2+ ~ +(n-1) = n*(n-1)/2  
	// 따라서 시간복잡도는 O(n^2)
	
	
	
	
	public static void main(String[] args) {
		
		int[] array = {3,2,5,1,7};
		int n = array.length-1;
		BubbleSort(array, n);
		arrayString(array);
		
		
	}
	
	public static void BubbleSort(int[] array,int n) {
		
		if(n>0) {
			
			for(int i=1; i<=n; i++) {
				
				if(array[i-1]>array[i]) {
					
					//swap(array[i-1], array[i]);
					swap(array, i-1, i);
					//이 둘의 차이점은 ? 위에 swap 같은 경우는 값이 전달되는것이므로 기존 배열에 영향을 주지 못한다.
					// 밑에 swap은 값을 전달하되 swap에서 배열로써 바꾸는것이므로 기존배열에 영향을 줌
					
				}
				
			}
			
			System.out.println(Arrays.toString(array));
			
			BubbleSort(array, n-1);
			
		}
		
		
		
		
		
		
	}
	
	public static void swap(int a , int b) {
		
		int temp =0;
		temp = a;
		a = b;
		b= temp;
		
	}
	
	public static void swap(int[] array, int a , int b) {
		
		int temp = array[a];
		array[a] = array[b];
		array[b]= temp;
		
	}
	
	public static void arrayString(int[] array) {
		
		for(int data : array) {
			
			System.out.print(data + ", ");
		}
	}
	
}


