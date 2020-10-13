package min.edu;

public class Practice7 {
	
	public static void practice7(int n ) {
		
		int j2 = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n/2-j2; j++) {
				
				System.out.print("○");
			}//흰색공
			
			for (int j = 0; j < 2*j2+1; j++) {
				System.out.print("●");
			}//검은공
			
			
			System.out.println("\n");
			if(i<n/2) {
				j2++;
			}
			else {
				j2--;
			}
			
			
		}//층 
	}

}
