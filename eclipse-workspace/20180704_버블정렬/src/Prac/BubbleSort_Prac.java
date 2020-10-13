package Prac;

public class BubbleSort_Prac {
	
	
	public static void main(String[] args) {
		
		int[] array = {9,7,5,11,12,2,14,3,10,4,6};
		
		
		BubbleSort(array,array.length-1);
	}
	
	
	public static void BubbleSort(int[] array,int last) {
		
	
		if(last>0) {
			
			
			for(int i=1; i<array.length; i++) {
				
				if(array[i-1]>array[i]) {
					swap(array, i-1, i);								
				}
			}	
			
			BubbleSort(array,last-1);
			
		}
		
		
	}


	private static void swap(int[] array, int i, int j) {
		
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

}
