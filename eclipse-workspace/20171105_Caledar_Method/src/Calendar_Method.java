import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Method {
	
	int other_year[] = {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년일때의 매달 일수 초기화
	int standard_year[] = {31,28,31,30,31,30,31,31,30,31,30,31};// 평년일때의 매달 일수 초기화
	
	
	//평년인지 윤년인지 판단해주는 메소드
	public boolean isCheck(int year) {
		boolean ischeck = false;
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			ischeck =true;
		}
			
		return ischeck;
	}
	//월의 마지막일을 가지고 오는 메소드
	public int lastdays(int year , int month) {
		int lastday =0;
		
		if (isCheck(year)) {
			
			lastday =other_year[month-1];
			
		}
		else {
			lastday = standard_year[month-1];
		}
		
		return lastday;
	}
	
		

	//변환된 일수값을 가지고 요일을 정하는 메소드
	public void print(int year , int month) {
		
		/*GregorianCalendar gc = new GregorianCalendar();
		gc.set(year, month-1,1);
		int lastday=gc.getActualMaximum(Calendar.DAY_OF_MONTH); //현재의 최대일수를 가지고옴
		int dayOfWeek=gc.get(Calendar.DAY_OF_WEEK)-1; 
		gc.set(year, month-2,1);
		int beforeday = gc.getActualMaximum(Calendar.DAY_OF_MONTH); //전달의 최대일수를 가지고옴
*/		System.out.printf("%d년 %d월 \n",year,month);
		System.out.println("일\t월\t화\t수\t목\t금\t토\t");
		
		
		int dayOfWeek = (days(year, month, 1)%7)+1-1;
		int beforeday = beforedays(year, month)-dayOfWeek+1;
	    
	    for (int i = beforeday-dayOfWeek+1; i <= beforeday; i++) {
	    	System.out.print(i+"\t");
			
		}
		
		
		
		
		
		for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("-"+"\t");
			
		}
		int lastday = lastdays(year, month);
		
		for (int i = 1; i <=lastday ; i++) {
			System.out.print(i+"\t");
			
			
			if((i+dayOfWeek)%7==0) {
				System.out.println();
			}
			
		}
		
		int afterdays = (7-((dayOfWeek+lastday)%7))%7;
	    
		
		
	    for (int i = 1; i <= afterdays; i++) {
			
			System.out.print(i+"\t");
		}
		
		
	}
	
	
	//년도와 달 일 을 일수로 바꿔주는 메소드
	public int days(int year , int month , int day) {
		int result = days(year, month) +day;
		
		
		return result;
	}
	//년도와 달을 일수로 바꿔주는 메소드
	public int days(int year, int month) {
		int result = days(year);
		
		for (int i = 1; i < month; i++) {
			if (isCheck(year)) {
				
				result +=other_year[i-1];
				
			}
			else {
				result += standard_year[i-1];
			}
			
		}
	
		
		
		return result;
	}
	
	
	//년도를 일수로 바꿔주는 메소드
	
	public int days(int year) {
		int result =0;
		
		for (int i = 1; i < year; i++) {
			
			if(isCheck(i)) {
				result+=366;
			}
			else {
				result+=365;
			}
			
		}
		return result;
	}
	
	// 1월이 아닌경우 그 전날의 달의 최대일수를 리턴해주고 1월인경우 12월의 일수를 리턴해주는 메소드
	
	public int beforedays(int year , int month) {
		int beforedays = 0;
		
		if (month!=1) {
			
			beforedays = lastdays(year, month-1);
			
			
		}
		else {
			beforedays = lastdays(year-1, 12);
		}
		
		return beforedays;
	}

}
