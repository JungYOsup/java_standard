package min.edu;

public class Triangle_One {
	public static void main(String[] args) {
		
		triangle(4);
		
	}
	
	public static void triangle(int stage) {
		
		
			for (int i = 0; i < stage; i++) {
				
			
		
			for (int k =0; k<i; k++) {
				System.out.print("　");
			}
			
			for (int j = 0; j < 4-i; j++) {
				
				System.out.print("★");
				
			}
			
			System.out.println("\n");
			}
			
		
	}
	
	

}
