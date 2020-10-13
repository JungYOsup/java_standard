package min.edu.api;

public class Calendar_API {
	
	public static void main(String[] args) {
		Calendar_Method cm = new Calendar_Method();
		for (int i = 1; i < 13; i++) {
			System.out.println();
			System.out.println();
			cm.print(2017, i);
		}
		
		
	}
	
	

}
