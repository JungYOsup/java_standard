package Prac;

import java.util.Arrays;

public class SelectionSorter_재귀두번 {
	
	static int first =0;
	static int count =1;
	
	public static void main(String[] args) {
		
		int[] array= {3,7,2,5,4,1,8};
		
		SelectionSort(array);
		
		
		System.out.println(Arrays.toString(array));
		
	}
	
	public static void SelectionSort(int[] array) {
		
		
		if(first != array.length) {
			
			int minimumIndex = CompareArray(array, first++,count++);
			Swap(array,minimumIndex,first-1);
			SelectionSort(array);
		}
		
			
		
	}
	
	public static int CompareArray(int[] array,int first,int i) {
			

		if(i == array.length) {
			return first;
		}
		
		if(array[first]<array[i]) {
			i++;
			return CompareArray(array,first,i);
						
		}else {
			
			return CompareArray(array,i,i+1);
			
		}
		
		
	}
	
	public static void Swap(int[] array , int minumumIndex,int first) {
		
		int temp =array[minumumIndex];
		array[minumumIndex] = array[first];
		array[first] = temp;
		
		
	}
	
	
	//***return을 했을때와 안했을때의 차이는?
	/*public static int CompareArray(int[] array,int first,int i) {
		

		if(i == array.length) {
			return first;
		}
		
		if(array[first]<array[i]) {
			i++;
			return CompareArray(array,first,i);
						
		}else {
			
			return CompareArray(array,i,i+1);
			
		}
		
		
	}*/

}
