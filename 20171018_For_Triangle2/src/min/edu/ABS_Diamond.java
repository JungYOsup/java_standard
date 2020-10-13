package min.edu;

public class ABS_Diamond {
	
	public static void PrintDiamond(int n ) {
		
		for (int i = 0; i < n; i++) {
			
			System.out.print(Math.abs(i-n/2));
			
			
			for (int j = 0; j <Math.abs(i-n/2) ; j++) {
				System.out.print("○");
			}//흰색
			
			
			
			for (int j = 0; j <n - 2* Math.abs(i-n/2) ; j++) {
				System.out.print("●");
			}//검은색
			
			System.out.println("\n");
		
		}// 층수 for
		
	}

}
