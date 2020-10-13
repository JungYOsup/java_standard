package min.edu;

/*
●●●●●●●○

●●●●●●○○○

●●●●●○○○○○

●●●●○○○○○○○

●●●○○○○○○○○○

●●○○○○○○○○○○○

●○○○○○○○○○○○○○

●●○○○○○○○○○○○

●●●○○○○○○○○○

●●●●○○○○○○○

●●●●●○○○○○

●●●●●●○○○

●●●●●●●○*/

public class Practice5 {
	
	public static void practice5(int n ) {
		
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n-i; j++) {
				System.out.print("●");
				
			}
			
			for (int j = 0; j < 2*i+1; j++) {
				System.out.print("○");
				
			}
			
			System.out.println("\n");
			
			
		}
	}
	
	public static void practice51(int n) {
		
		for(int i=1; i<n; i++) {
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("●");
				
			}
			
			for (int j = 0; j < 2*(n-i)-1; j++) {
				System.out.print("○");
				
			}
			
			System.out.println("\n");
		}
		
	}
	
	

}
