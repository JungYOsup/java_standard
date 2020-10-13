package min.edu.mo;

public class HourGlass1 {
	
	
	public static void hourGlass(int n) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print("☆");
			}
			
			for (int j = 0; j < 2*(n-i)-1; j++) {
				
				System.out.print("★");
				
			}
			
		
		
			
			
			System.out.println("\n");
		}
		
		
		
	}
	
	public static void hourGlass2(int n) {
		
		
		for (int i = 1; i < n; i++) {
			
			for (int j = 0; j < n-i-1; j++) {
				System.out.print("☆");
				
			}
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("★");
			}
			
			
			System.out.println("\n");
		}
	}
	
	

}
