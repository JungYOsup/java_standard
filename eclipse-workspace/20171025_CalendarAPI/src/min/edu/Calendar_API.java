package min.edu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_API {

	public static void main(String[] args) {
		
		Calendar_Method calAPI = new Calendar_Method();
		
		for (int i = 1; i < 13; i++) {
			System.out.println();
			calAPI.print(2017, i);
		}
		
	
		/*
		Calendar cal =Calendar.getInstance();
		GregorianCalendar gCal = new GregorianCalendar();

		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);

		int monthDay =cal.getMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(monthDay);

		switch (day) { // 요일
		case  Calendar.SUNDAY:
			System.out.println("일요일");

			break;
			
		case Calendar.MONDAY:
			System.out.println("월요일");

			break;
			
		case Calendar.TUESDAY:
			System.out.println("화요일");

			break;
			
		case Calendar.WEDNESDAY:
			System.out.println("수요일");

			break;
			
		case Calendar.THURSDAY:
			System.out.println("목요일");

			break;
			
		case Calendar.FRIDAY:
			System.out.println("금요일");

			break;
			
		case Calendar.SATURDAY:
			System.out.println("토요일");

			break;


		}*/
	}

}
