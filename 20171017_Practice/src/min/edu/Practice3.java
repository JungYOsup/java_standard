package min.edu;

public class Practice3 {
	//     *
	//    **
	//   ***
	//  ****
	// *****
	
	public static void practice3(int n) {
		
		
		for(int i=0; i<n; i++) {
			
			for (int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
				
			}
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("★");
				
			}
			System.out.println("\n");
		}
		
		
		
	}

}
