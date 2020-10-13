
public class doSearch {

	public static void main(String[] args) {
		
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int result = Search(array, 10);
		System.out.println("내가 찾은 값의 index:"+result);
		
	
	}
	
	
	public static int Search(int[] array , int Cnum) {
				
		int min =0;
		int max =array.length-1;
		int count=0;
		int guess=0;
		while(min<=max) {
			
			guess = Math.abs((min+max)/2);
			count++;
			if(array[guess] == Cnum) {
				
				System.out.println("횟수"+count);
				return guess;
			}else if(array[guess]<Cnum) {
				min = guess+1;
				
			}else {
				max = guess-1;
			}
			
		}
		
		return -1;
		
	}

}
