package min.edu;

public class Calendar_Main {

	public static void main(String[] args) {
		int a=0;
		
		Calendar_Method cm = new Calendar_Method();
		/*for (int i = 1; i < 13; i++) {
			System.out.println();
			System.out.println();
			cm.print(2017, i);
		}*/
		int b =cm.days(2017);
		System.out.println(b);
		cm.print(2017, 8);
		
		
		
		

				
	}
}
