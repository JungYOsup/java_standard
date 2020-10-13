package Prac;

import java.util.Arrays;

public class SelectionSorter_재귀X {

	public static void main(String[] args) {

		int[] array = {3,7,2,5,4,1,8};
		SelectionSorter(array);
		System.out.println(Arrays.toString(array));


	}

	public static void SelectionSorter(int[] array) {


		for(int i=0; i<array.length; i++) {

			int minIndex=MiniMum(array, i);
			swap(array, minIndex, i);
			
		}




	}

	public static int MiniMum(int[] array,int startIndex) {

		int minValue = array[startIndex];
		int minIndex = startIndex;
		
		for(int i= minIndex+1; i<array.length; i++) {
			
			if(array[i]<minValue) {
				
				minValue = array[i];
				minIndex = i;
				
			}
			
			
		}
		
		return minIndex;
		
		
		
	}
	public static void swap(int[] array, int minIndex,int i) {
		
		
		int temp = array[i];
		array[i] = array[minIndex];
		array[minIndex] = temp;
		
	}
}
