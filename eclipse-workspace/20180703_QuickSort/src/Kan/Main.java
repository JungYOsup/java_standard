package Kan;

public class Main {

	public static void main(String[] args) {


		int[] array = {9, 7, 5, 11, 12,2,14, 3, 10, 4, 6};
		QuickSort qs = new QuickSort();
		
		qs.QuickSortCal(array, 0, array.length-1);
		
		for(int data : array) {
			
			System.out.print(data+",");
		}
		
		
		

	}


}

class QuickSort{
	

	
	public void QuickSortCal(int[] array,int start,int end) {
		
		if(start<end) {
			
			int pivot =partiton(array, start, end);
			
			QuickSortCal(array, start, pivot-1);
			QuickSortCal(array, pivot+1, end);
			
		}
		
		
	}
	
	public int partiton(int[] array , int p , int r) {
		
		int q = p;

		for(int j=p; j<r; j++){
			
	        if(array[j]<=array[r]){
	             
	             swap(array,j,q);
	             q++;
	          	            
	        }
	               
	    }
	    swap(array,r,q);
	  
		return q;

	}
	public void swap(int[] array, int j , int q) {
		
		int temp = array[j];
		array[j] = array[q];
		array[q] = temp;
		
	}


}
