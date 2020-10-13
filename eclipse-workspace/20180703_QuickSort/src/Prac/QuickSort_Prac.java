package Prac;

import java.util.Arrays;

public class QuickSort_Prac {
	
	
	public static void main(String[] args) {
		
	int[] array = {9,7,5,11,12,2,14,3,10,4,6};
	
	QuickSort(array, 0, array.length-1);
	
	System.out.println(Arrays.toString(array));
		
		
	}
	
	public static void QuickSort(int[]array , int first , int last) {
		
		if(first<last) {
			
			int pivot = Partitioning(array, first, last);
			
			QuickSort(array, first, pivot-1);
			QuickSort(array, pivot+1, last);
		}
		
		
		
	}
	
	public static int Partitioning(int[] array, int first , int last) {
		
		int r = last;
		int p = first;
		int q = p;
		
		for(int j=p; j<r; j++) {
			
			if(array[r]>=array[j]) {
				swap(array, q, j);
				q++;
			}
		}
		swap(array, q, r);
		
		return q;
		
		
	}
	
	public static void swap(int[] array, int q , int j) {
	
		int temp = array[q];
		array[q] = array[j];
		array[j] = temp;
		
		
	}
	
	
	
	
	

}
