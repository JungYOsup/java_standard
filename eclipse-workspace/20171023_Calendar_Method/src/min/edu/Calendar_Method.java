package min.edu;

public class Calendar_Method {

	/*
	 * 윤년의 각월의 최대 일수를 저장
	 */
	private final int[] LEAF = {31,29,31,30,31,30,31,31,30,31,30,31};
	/**
	 * 평년의 각월의 최대 일수를 저장
	 */
	private final int[] PLAIN = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	/**
	 * 입력받은 년도의 윤년 /평년을 확인함
	 * @param year 년도
	 * @return 윤년이면 true 평년이면 false
	 *
   */
	public boolean isLeafYear(int year) {
		boolean isc = false;
		//윤년 4의 배수이면서 100에 배수가 아니고 400의 배수인 년도들 
		
		if(year%4==0 && year%100!=0 || year%400==0) {
			isc =true;
			
		}
			
		
		return isc;
	}
	
	
	/**
	 * 해당 년도 이전 년도의 합을 수함
	 * @param year 기준년도
	 * @return 기준년도 이전까지의 총 일수 
	 */
	public int days(int year) {
		
		int result =0;
		
		for (int i = 1; i < year; i++) {
			
			if(isLeafYear(i)) {
				result += 366;
			}
			else {
				result += 365;
			}
		}
		return result;
	}
	public int days(int year ,int month) {
		int result =days(year);
		for(int i =1 ; i<month; i++) {
			if(isLeafYear(year)) {
				result += LEAF[i-1];
			}
			else {
				result += PLAIN[i-1];
			}
			
		}
		
		return result;
		
	}
	public int days (int year , int month , int date) {
		int result =days(year , month);
		
		
		
		return result+date;
	}
	/**
	 * 입력 년/월의 최대 일수를 반환
	 * @param year
	 * @param month
	 * @return 최대일수 
	 */
	public int lastDays(int year , int month ) {
		int date =0;
		if(isLeafYear(year)) {
			date = LEAF[month-1];
			
		}
		else {
			date = PLAIN[month-1];
		}
		return date;
		
	}
	public void calandarPrint(int year, int month) {
		System.out.println();
		System.out.printf("\t\t %d 년도 \t %d 월 \n",year ,month);
		System.out.printf("일\t월\t화\t수\t목\t금\t토\n");
		
		// 해당 년도의 1일을 구한후(1년 1월 1일은 월요일 +1),을 31일까지 공백으로 출력(-1)
		int dayofWeek = (days(year,month,1)%7)+1-1; //2017.10.1 요일은 2017년 9월 31일 요일
		
		
		//공백
		for (int i = 0; i < dayofWeek; i++) {
			
				if(isLeafYear(year)) {
					int a =0;
					a =LEAF[month-2]-dayofWeek+i+1;
					
					System.out.print(a +"\t");
					
				}
				else {
					int b=0;
					b = PLAIN[month-2]-dayofWeek+i+1;
					
					System.out.print(b +"\t");
					
					
				}
			
		}
		//일수
		
		int lastDay = lastDays(year, month);
		for (int i = 1; i <= lastDay; i++) {
			
			System.out.printf("%d\t",i);
			if((dayofWeek + i )%7 ==0) {
				System.out.println();
				
			}
		}
		
		// 네이버처럼 만드는법
		// 년수쓰면 
		
		
		
		
	
		
	}
	


}
