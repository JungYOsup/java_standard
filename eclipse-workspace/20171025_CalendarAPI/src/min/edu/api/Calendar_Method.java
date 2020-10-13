package min.edu.api;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Method {
	
	
	public void print(int year , int month) {
		GregorianCalendar gcal = new GregorianCalendar();
		gcal.set(year , month-1 , 1); // 현재월의 마지막날을 구하기 위한 메소드
		int lastdays = gcal.getActualMaximum(Calendar.DAY_OF_MONTH); // 현재월의 마지막날을 구해줌
		int dayOfWeek = gcal.getActualMaximum(Calendar.DAY_OF_WEEK)-1; // 1일의 요일을 알려준다. 
		gcal.set(year, month-2,1);
		int beforeDay = gcal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		System.out.printf("\t\t %d 년 %d 월\n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int before = beforeDay-dayOfWeek +1;
		for (int i = before; i <= beforeDay; i++) {
			System.out.print(i+"\t");
		}
		
		
		for (int i = 1; i <= lastdays; i++) {
			System.out.print(i+"\t");
			
			if ((dayOfWeek+i)%7==0) {
				System.out.println();
			}
			
		}
		
		int a = (7-((dayOfWeek+lastdays)%7))%7;
		for (int i = 1; i <=a ; i++) {
			System.out.print(i+"\t");
			
		}
		
		
		
		
		
		
		
		
		
	}

}
