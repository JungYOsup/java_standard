package Prac;

public class doSearch_Prac_재귀 {

	//재귀함수 적용
	static int count =0;
	public static void main(String[] args) {

		int[] array = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		System.out.println(DoSearch(array,7, 0, array.length-1));

	}

	public static int DoSearch(int[] array,int num,int first,int last) {

		
		if(first<=last) {
			
		
		int midIndex = (last+first)/2; // 절반  
		count++;
		if(num>array[midIndex]) {

			int overIndex = midIndex+1;
			int lastIndex = last;
			DoSearch(array, num, overIndex, lastIndex);


		}else{

			int firstIndex = first;
			int lastIndex = midIndex-1;
			DoSearch(array, num, firstIndex, lastIndex);
		}

		}
		
		return count;


	}

}
