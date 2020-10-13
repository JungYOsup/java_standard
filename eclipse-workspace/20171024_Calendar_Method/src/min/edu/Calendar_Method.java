package min.edu;

public class Calendar_Method {

	int other_year[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	int standard_year[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//윤년인지 아닌지 파악해주는 메소는 isLeafYear();
	public boolean isLeafYear(int year) {
		boolean check= false;

		if(year%4==0 && year%100!=0 || year%400==0) {
			check = true;
		}

		else {

		}

		return check;

	}
	// 년,월,일을 입력시 총 일수를 계산해주는 메소드 
	public int days(int year , int mouth , int day) {

		int result =days(year, mouth) + day;

		return result;
	}
	//년도의 일수를 받고 월과 더해 총 일수를 계산해주는 메소드 
	public int days(int year, int mouth) {
		int result = days(year);
		
		for(int i=1; i<mouth; i++) {

			if(isLeafYear(year)) {
				result+=other_year[i-1];
			}
			else {
				result+=standard_year[i-1];
			}
		}
		return result;

	}

	// 년도의 총일수를 계산해주는 메소드
	public int days(int year) {
		int result = 0;

		for (int i = 1; i < year; i++) {

			if(isLeafYear(i)) {
				result +=366;

			}
			else {
				result +=365;
			}




		}
		return result;
	}
	
	// 각 월의 마지막날의 date
	public int lastday(int year , int month) {
		int lastday = 0;
		if(isLeafYear(year)) {
			lastday =other_year[month-1]; 
		}
		else {
			lastday =standard_year[month-1]; 
		}
		
		return lastday; 
	}
	
	//프린트 해주는 메소드 
	public void print(int year , int month) {//2017 1
		
		int lastday=lastday(year , month);
		System.out.printf("\t\t %d 년 %d월",year , month);
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		// 총일수를 받아 요일을 구한다.
		int dayOfWeek = days(year , month , 1)%7+1-1; // 모든것의 시작은 첫주는 무조건 1이 들어가니까 기준을 1로잡음
		System.out.println(dayOfWeek);
		
		/*for (int i = 0; i < dayOfWeek; i++) {
			System.out.print("- \t");
			
		}*/
		
		//문제점은 년도는 숫자, 처리하는 방식은 배열 
		// 1 일때는 ->[0]의 배열을 확인함 2일때는 [1]의 배열을 확인함
		// 로직상 1월이 입력될 경우 이전달의 최대일 수를 구할때 1->[0], 0 ->[-1] 배열을 확인해버림 // 즉 month에 1을 입력할경우 {-1}배열을 확인한다.
		
		// 1월인 경우 전년도의 12월을 계산하고 
		// 1월이 아닌경우 현재년도와 입력받은 Month -1 
		/*int beforeDay = lastday(year,month-1)-dayOfWeek+1; // 시작날짜
		
		for (int i = beforeDay; i <=lastday(year,month-1); i++) {
			System.out.printf("%d\t",i);
		}*/ //1월일 경우 문제가 발생하는 코드
		
		int beforeDay = beforeDays(year, month)-dayOfWeek+1;
		
		for (int i = beforeDay; i <=beforeDays(year, month); i++) {
			
			System.out.printf("%d\t",i);
			
		}
		
		
		
		
		for (int i = 1; i <=lastday; i++) {
			System.out.print(i+"\t");
			if((dayOfWeek+i) % 7==0) {
			System.out.println();
			}
			
		} // 달력 출력
		
		
		// 시작 점의 위치 : dayOfWeek
		// 달력의 최대 일수 : lastDay
		
		int a =(7-((dayOfWeek+lastday)%7))%7+1; //dayofweek 에서 뺸 값을 다시 더해준거임 
		for (int i = 1; i < a; i++) {
			System.out.print(i+"\t");
		}
		
		
	}
	//예를들어 2018년 1월일 경우 2017년 12월의 배열 즉 lastday값을 가지고오는 메소드 
	public int beforeDays(int year , int month) {
		int after = 0;
		
		if(month!=1) {
			after = lastday(year,month-1);
		}
		else {
			
			after = lastday(year-1 , 12);
		}
		return after;
		
	}
	

}
