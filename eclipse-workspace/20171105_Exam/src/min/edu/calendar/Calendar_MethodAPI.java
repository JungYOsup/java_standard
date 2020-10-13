package min.edu.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_MethodAPI {
	
	/*private int[] other_year = {31,29,31,30,31,30,31,31,30,31,30,31};
	private int[] standard_year = {31,28,31,30,31,30,31,31,30,31,30,31};*/
	
	
	
	//윤년인지 아닌지 판별해주는 메소드
	
	/*public boolean isCheck(int year) {
		boolean ischeck =false;
		
		if(year%4==0 &&year%100!=0 || year%400==0) {
			
			ischeck =true;
		}
		
		
		return ischeck;
	}*/
	
	//프른트 해주는 메소드
	
	public void print(int year , int month) {
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(year, month-1,1);
		int dayofWeek = gc.get(Calendar.DAY_OF_WEEK);
		int lastday =gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		gc.set(year, month-2,1);
		int beforedays =gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		
		
		System.out.printf("%d년 %d월 \n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		/*int dayofWeek = (days(year, month,1)%7)+1-1;*/
		/*int beforedays=beforeDays(year, month)-dayofWeek+1;*/
		
		for (int i = beforedays-dayofWeek+1; i <= beforedays; i++) {
			System.out.print(i+"\t");
			
		}
		
		
		/*for (int i = 0; i < dayofWeek; i++) {
			System.out.print("-"+"\t");
		}*/
		
		/*int lastday = lastdays(year, month);*/
		
		
		for (int i = 1; i <=lastday;  i++) {
			
			System.out.print(i+"\t");
			
			if((i+dayofWeek)%7==0)
				System.out.println();
		}
		
		int afterdays = (7-((lastday+dayofWeek)%7))%7;
		
		for (int i = 1; i <= afterdays; i++) {
			System.out.print(i+"\t");
		}
		
		
	
	}
	
	
	//각달의 마지막 일을 알려주는 메소드
	
	/*public int lastdays(int year, int month) {
		int lastday =0;
		if (isCheck(year)) {
			
			lastday = other_year[month-1];
			
		}
		else {
			lastday = standard_year[month-1];
		}
		
		return lastday;
	}*/
	
	
	
	
	//년도와 월 , 일수를 일수로 바꿔주는 메소드
	
	/*public int days(int year , int month ,int day) {
		
		int result = days(year, month)+day;
		
		return result;
	}
	
	//년도와 월을 일수로 바꿔주는 메소드
	public int days(int year, int month) {
		int result= days(year);
		
		for (int i = 1; i < month; i++) {
			
			if (isCheck(year)) {
				result +=other_year[i-1];
				
			}
			else {
				result +=standard_year[i-1];
			}
			
			
			
		}
		
		
		
		return result;
	}
	
	//년도를 일수로 바꿔주는 메소드
	
	public int days(int year) {
		int result=0;
		
		for (int i = 1; i < year; i++) {
			
			if(isCheck(i)) {
				
				result+=366;
				
			}
			else {
				result+=365;
			}
			
			
		}
		
		
		
		return result;
	}*/
	/*//비포데이스를 구하는 메소드 1월일경우 12월의 라스트데이로 채워넣고 , 1월이 아닌경우 그전달의 마지막날까지 채워넣는다.
	
		public int beforeDays(int year,int month) {
			int before=0;
			
			if(month !=1) {
				before = lastdays(year, month-1); 
			}
			else {
				before = lastdays(year-1, 12);
			}
			return before;
		}*/

}
