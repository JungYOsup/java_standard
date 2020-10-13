package min.edu.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Calendar_Method {
	int other_year[] = {31,29,31,30,31,30,31,31,30,31,30,31}; //윤년일때의 매달 일수 초기화
	int standard_year[] = {31,28,31,30,31,30,31,31,30,31,30,31};// 평년일때의 매달 일수 초기화


	// 윤년인지 평년인지 확인하는 메소드로 윤년이면 true를 리턴 , 평년이면 false를 리턴 (윤년은 4의배수이자 100의 배수로 떨어지지 않거나 400의 배수로 떨어지지않으면 윤년이다.)
	
	
	
	
	
	public boolean isCheck(int year) {
		boolean check = false;
		
			if(year%4==0&&year%100!=0||year%400==0) {
				check = true;
			}

		
		return check;
	}
	
	
	
	//년도와 월을 일을 입력하면 일수로 바꿔주는 메소드 
	/*public int days(int year , int month , int date) {
		int result =0;
		result = days(year, month)+date;
		
		return result;
		
	}*/

	//년도와 월을 입력하면 이 둘을 합쳐서 일수로 리턴해주는 메소드
	/*ublic int days(int year , int month) {
		int result =days(year);

		for (int i = 1; i < month; i++) {

			if(isCheck(year)) {
				result += other_year[i-1]; //[i-1] 해주는 이유는 1월의 index가 0이기 때문에 0을 가지고 와야하므로 

			}
			else {
				result += standard_year[i-1];
			}

		}

		return result;
	}*/

	// 년도를 입력하면 일수로 반환해주는 메소드
	/*public int days(int year) {
		int result = 0;

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
	//윤년 또는 평년의 마지막날을 가져오는 메소드 
	/*public int lastdays(int year , int month) {
		int lastdays=0;
		if(isCheck(year)) {
			lastdays=other_year[month-1];
		}
		else {
			lastdays=standard_year[month-1];
		}
		return lastdays;
		
				
	}*/
	//변환된 일수값을 받아 그 일수를 공식에 적용해 요일을 알수있는 메소드 
	public void print(int year ,int month) {
		
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(year, month-1, 1);
		int lastdays = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		int dayOFWeek = gc.getActualMaximum(Calendar.DAY_OF_WEEK)-1;
		
		gc.set(year, month-2, 1);
		int beforeDays = gc.getActualMaximum(Calendar.DAY_OF_MONTH);
		/*int dayOFWeek = 0;*/
		
		/*dayOFWeek =	days(year, month, 1)%7+1-1;	//date를 1로잡는 이유는 각월의 시작은 1부터이기때문이다.
*/		/*System.out.println(dayOFWeek);*/
		System.out.printf("\t\t %d 년 %d 월" , year , month);
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		/*for (int i = 0; i < dayOFWeek; i++) {
			System.out.print("- \t");
		}*/
		
		//앞에 - 대신 숫자를 채우는 방법 
		int beforeDay=beforeDays-dayOFWeek+1; 
		
		for (int i = beforeDay; i <= beforeDays; i++) {
			System.out.print(i+"\t");
		}
		
		//각 년도 월의 마지막날을 가져옴
		/*int lastdays = lastdays(year, month);*/
		
		/*System.out.println(lastdays);*/
		
		//윤년 또는 평년의 마지막날을 가져와서 그 마지막 날까지 1부터 출력해줌 
		for(int i=1; i<=lastdays; i++) {
			System.out.print(i+"\t");
			
			if((dayOFWeek+i)%7==0) {
				System.out.println();
			}
			
			
			
		}
		
		// 7-(lastdays+dayOFWeek)%7 하면 달력 뒤쪽 빈칸을 의미하는데 달력이 꽉차있을경우문제가 발생하므로 %7을 한번더 해준다. 그리고 그 결과값을 출력하면 1개씩 안나오므로 반복을 위해 +1을 더 해줌
		int enddays =(7-((lastdays+dayOFWeek)%7))%7;
		
		for (int i = 1; i <= enddays; i++) {
			System.out.print(i+"\t");
		}
		
		
		
		
		
	}
	//매년 1월이 아닐경우는 그 월 전월의 마지막날 값을 리턴해주고 1월일 경우 작년의 12월의 마지막날 값을 리턴해주는 매소드 
	/*public int beforeDays(int year , int month) {
		int before=0;
		if(month != 1) {
			before = lastdays(year, month-1);
		}
		else {
			before = lastdays(year-1, 12);
		}
		
		return before;
	}*/
	


}
