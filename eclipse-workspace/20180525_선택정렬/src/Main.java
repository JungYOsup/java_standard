import java.util.Arrays;

public class Main {
	
	
	public static void main(String[] args) {
		
		
	int[] array= {18,6,66,44,9,22,14};
	
	selectionSort(array);
	
	System.out.println(Arrays.toString(array));
		
		
		
	}
	
	public static void selectionSort(int[] array) {
		
		for(int i=0; i<array.length; i++) {
			
			int minimum = indexOfMininum(array, i); //최소값의 index위치를 가져옴
			
			Swap(array, i, minimum);
			
		}
		
	}
	
	
	//위치를 바꾸는 메소드
	public static void Swap(int[] array, int firstIndex , int SecondIndex ) {
		
		int temp=0;
		
		if(array[firstIndex]>array[SecondIndex]) {
			
			temp = array[firstIndex];
			array[firstIndex] = array[SecondIndex];
			array[SecondIndex]= temp;
			
		}
	}
	
	//자기가 선택한 index에서 가장 작은값을 도출함
	public static int indexOfMininum(int[]array, int firstIndex) {
		
		int minValue = array[firstIndex];
		int minIndex = firstIndex;
		
		for(int i=firstIndex+1; i<array.length; i++) {
			
			if(array[minIndex]>array[i]) {
				
				minValue = array[i];
				minIndex = i;
				
			}
			
		}
		
		return minIndex;
		
	}
	
	

}
