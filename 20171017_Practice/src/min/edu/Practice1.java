package min.edu;

public class Practice1 {
	//   *
	//   **
	///  ***
	///를 만들어라 ( 중요한것은 일반항을 찾는것이 중요하다 )
	public static void practice1(int n) {
		
		for (int i = 0; i <n ; i++) {
			
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
				
			}
			System.out.println("\n");
			
		}
		
		
	}
}
