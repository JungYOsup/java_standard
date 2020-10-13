package Prac;

public class Test {
	
	
	public static void MergeSort(int[]array , int start, int end) {
		
		if(start<end) {
			
			
			int mid = (start+end)/2;
			
			MergeSort(array, start, mid);
			MergeSort(array, mid+1, end);
			Merge(array,start,end);
			
		}
		
		
	}
	
	
	

	private static void Merge(int[] array, int start,int end) {

		int[] NewArray = new int[end-start+1];
		
		int index = start;
		int mid = (start+end)/2;
		int s1 = start;
		int s2 = mid+1;
		
			
		
		
		
		
	}


	public static void main(String[] args) {
		
		int[] array = {5,3,7,4,6,1,9,2};
		
		MergeSort(array, 0, array.length-1);
		
		for(int i : array) {
			System.out.print(i+", ");
		}
	
		
		
	}

}
