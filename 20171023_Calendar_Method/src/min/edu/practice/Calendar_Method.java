package min.edu.practice;
//1. 윤년과 평년의 각 일수 초기화 
//2. 윤년인지 평년인지 판단한다.(4의배수이자 10의배수가아니고 또한 100의 배수면 된다.)
//3. 년도를 일로 월을 일로 만들어서 그 일수를 합치는 메소드
//4. 월 ,1일 입력하고 일수로 변환한다음에 그 일수를 %7 해서 나머지가 요일을 가르키는데 +1을 해주는이유는 월요일을 1일로 기준 주었기 때문이다 그리고 -1을 해주는 이유는 - 가 하나더 찍히기 때문이다.
//5. 라스트데이를 구하는 메소드를 만들고
//6. 그 라스트데이를 리턴받아 출력해주는 메소드를 만든다.
public class Calendar_Method {
	//1. 윤년과 평년의 각 일수 초기화 
	int other_year[] = {31,29,31,30,31,30,31,31,30,31,30,31};
	int standard_year[] = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	//2. 윤년인지 평년인지 판단한다.(4의배수이자 10의배수가아니고 또한 100의 배수면 된다.)
	public boolean isCheck(int year) {
		boolean check = false;

		if(year%4==0&&year%10!=0||year%100==0) {
			check=true;
		}


		return check;

	}
	
	//5. 년도와 달과 일수를 입력받아 일수로 바꿔주는 메소드
	public int days(int year, int month , int days) {
		int result = days(year, month)+days;
		
		return result;
	}
	
	
	//4. 년도와 달을 일수로 바꿔주는 메소드
		public int days(int year, int month) {
		int result = days(year);
		
		for (int i = 1; i < month; i++) {
			if(isCheck(year)) {
				result+=other_year[month-1];
			}
			else {
				result+=standard_year[month-1];
			}
			
		}
		
		
		return result;
	}
	
	
	
	
    //3. 년도를 일수로 바꿔주는 메소드
	public int days(int year) {
		int result = 0;
		for (int i = 1; i < year; i++) {
			if(isCheck(i)) {
				result+=366;
			}
			else {
				result+=355;
			}

		}
		return result;

	}
	//7. lastdays를 찍는 메소드를 만들어보자
	public int lastday(int year , int month) {
		int lastdays=0;
			
			if(isCheck(year)) {
				lastdays = other_year[month-1];
			}
			else {
				lastdays = standard_year[month-1];
			}
		
		
		return lastdays;
	}
	
	//6. 총 일수를 입력받아 
	public void print(int year , int month ) {
		int alldays =0;
		alldays= days(year, month,1);
		int lastOFWeek=alldays %7+1-1;
		System.out.printf("\t\t %d 년 %d 월 ", year , month);
		System.out.println();
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for (int i = 0; i < lastOFWeek; i++) {
			System.out.print("- \t");
			
		}
		
		int lastdays = lastday(year, month);
		
		for (int i = 1; i <=lastdays; i++) {
			System.out.print(i+"\t");
			
			if((i+lastOFWeek)%7==0)
			{
				System.out.println();
			}
			
		}
		
	
	}
	



}
