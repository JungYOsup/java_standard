
public class test1 {

	public static void main(String[] args) {
		
		boolean isc = true;
		
		int arr[] = {1,1,2};
		
		int arr_length = arr.length;
		
		for(int i=0; i<arr_length; i++) {
			
			for(int j=0; j<i; j++) {
				
				if(arr[i]==arr[j]) {
					isc = false;
				}
			}
			
			
			if(arr_length+1<=arr[i]) {

			}
			
		}
		
		System.out.println(isc);
		

	}
	
	
	

}
