package min.edu;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Method {
	
	//프린트 해주는 메소드 
	
	public void print(int year , int month) {//2017 1
		
		GregorianCalendar gCal = new GregorianCalendar();
		//---------------------------------------- 현재달력 계산
		gCal.set(year, month-1,1); //현재 입력받은 달의 최대일 수   
		int lastday=gCal.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOfWeek =gCal.get(Calendar.DAY_OF_WEEK)-1; /*days(year , month , 1)%7+1-1; */ // 3
		System.out.println(dayOfWeek);
		//----------------------------전 달 달력 계산
		gCal.set(year, month-2,1); // 전달의  최대일수
		gCal.getActualMaximum(Calendar.DAY_OF_MONTH); //30
			
		//-------------------------------------
	

		System.out.printf("\t\t %d 년 %d월",year , month);
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		int beforeDay = gCal.getActualMaximum(Calendar.DAY_OF_MONTH);     /*beforeDays(year, month)-dayOfWeek+1;*/ // 30 - 
		
		for (int i = beforeDay-dayOfWeek+1; i <=gCal.getActualMaximum(Calendar.DAY_OF_MONTH); i++) 
		{
			
			System.out.printf("%d\t",i);
			
		}
		
		for (int i = 1; i <=lastday; i++) {
			System.out.print(i+"\t");
			if((dayOfWeek+i) % 7==0) {
			System.out.println();
			}
			
		} // 달력 출력
		
		int a =(7-((dayOfWeek+lastday)%7))%7+1; //dayofweek 에서 뺸 값을 다시 더해준거임 
		for (int i = 1; i < a; i++) {
			System.out.print(i+"\t");
		}
		
		
	}
	
	
	


}














