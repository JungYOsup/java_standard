package Prac;

import java.util.Arrays;

public class SelectionSorter_재귀한번 {
	
	static int first = 0;
	public static void main(String[] args) {
		
		int[] array = {3,7,2,5,4,0,8};
		
		SelectionSort(array, 0);
		System.out.println(Arrays.toString(array));
		
		
	}
	
	public static void SelectionSort(int[] array , int start) {
		
		if(start < array.length-1) {
						
			for(int i=start; i<array.length; i++) {
				
				if(array[start]>array[i]) {
					start =i;
				}
				
			}
			int minimumIndex = start;
			Swap(array, first, minimumIndex);		
			SelectionSort(array, ++first);
			
			
		}
		
		
		
	}
	
	public static void Swap(int[] array ,int first ,int mininumIndex) {
		
		int temp = array[mininumIndex];
		array[mininumIndex] = array[first];
		array[first] = temp;
		
	}

}
