package min.edu;

public class Calendar_Main {
		
	public static void main(String[] args) {
		int a=0;
		Calendar_Method cm = new Calendar_Method();
		
		for (int i = 1; i < 13; i++) {
			cm.calandarPrint(2017, i);
		}
		
		/*for (int i = 1; i <=2017; i++) {
			
			if(cm.isLeafYear(i)) {
				a++;
			}
		}
		System.out.println(a);*/
	/*	System.out.println(cm.days(2017));
		System.out.println(cm.days(2017,2));
		System.out.println(cm.days(2017,10, 23));*/
		
		int total =cm.days(1,1, 31);
		int birthday =cm.days(1991,11, 15);
		int lifeDay = total -birthday;
		/*
		System.out.println(total);
		System.out.println(lifeDay);*/
				
	}
	
	

}
