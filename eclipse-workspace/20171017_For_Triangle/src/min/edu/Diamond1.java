package min.edu;

public class Diamond1 {
	
	
	public static void printIncrease2(int n)
	{
		for (int i = n-1; i >=0; i--) {
			
			for (int j = 0; j < i;  j++) {
				
			} //흰색
			
			for (int j = 1; j < 2*(n-i); j++) {
				
			} //검은색
			
		} //층수
		
	}

	public static void printIncrease(int n)
	{

		for(int i=0; i<n; i++) {

			for(int j=0; j<n-i; j++) 
			{
				System.out.print("●");

			}

			for(int j=0; j<(2*i)+1; j++) 
			{
				System.out.print("○");

			}

			System.out.println("\n");

		}

		//증가 
	}

	public static void printdecrese(int n) {

		for(int i=1; i<n; i++) {

			for (int j = 0; j <i+1; j++) {

				System.out.print("●");

			}

			for (int j = 0; j < 2*(n-i)-1; j++) {
				System.out.print("○");

			}
			
			System.out.println("\n");
		}
		//감소
	}

}
