package min.edu;

public class Diamond_ref {
	
	
	public static void main(String[] args) {
	
		int j2 =0;
		int n =5;
		
		for (int i = 0; i <5; i++){
			/*j2 =(i<n/2)? j2++:j2--; */
			j2 =(i<n/2)? ++j2:--j2; 
			
			System.out.println(j2);
		}
		
		
	}
	
	
}

