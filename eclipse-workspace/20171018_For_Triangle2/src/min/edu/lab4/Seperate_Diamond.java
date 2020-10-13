package min.edu.lab4;

public class Seperate_Diamond {
	
	static int n = 4;
	//계산을 위한 메소드
	
	public static void solomon() {
		
		for (int i = 1; i < n; i++) {
			
			dia(i);
			
		} //증가를 계산
		
		for (int i = n ; i >0; i--) {
			
			dia(i);
			
		} //감소를 계산 
		
		
	}
	
	//출력을 위한 메소드
	
	public static void dia(int j) {
		
		for (int i = 0; i < (n-j); i++) {
			System.out.print("○");
		}
		
		for (int i = 0; i < 2*j-1; i++) {
			System.out.print("●");
			
		}
		System.out.println("\n");
		
	}
	

}
