package Prac;

public class doSearch_Prac_NorMal {
	static int count =0;
	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("검사횟수는?"+doSearch(array, 5));
		
		
	}
	
	public static int doSearch(int[] array,int num) {
	
		int min = 0; //첫번째 index
		int max = array.length-1;//마지막 index
			
		while(min<=max) {
			
			int mid = (max+min)/2;
			count++;
			if(array[mid]==num) {
				return count;
			}else if(array[mid]<num) {
				min = mid+1;
			}else {
				max = mid-1;
			}
			
			
			
		}
		
		return -1;
		
		
	}

}
