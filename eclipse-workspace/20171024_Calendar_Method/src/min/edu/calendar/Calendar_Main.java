package min.edu.calendar;

public class Calendar_Main {

	public static void main(String[] args) {
		Calendar_Method cal =new Calendar_Method();
		/*int a =cal.days(2017);
		int b =cal.days(2017, 7);
		int c =cal.days(2017, 8, 5);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);*/
		
		for(int i=1; i<13; i++) {
			System.out.println();
			System.out.println();
			cal.print(2017, i);
		}
			
		
		
	}

}
