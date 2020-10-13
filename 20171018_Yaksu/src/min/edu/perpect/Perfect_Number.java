package min.edu.perpect;

public class Perfect_Number {
	
	// 친화수란 : A와 B , A 의 진약수의 합이 B가 되고 (&)
	// B의 진약수의 합이 A가 되는 값.
	
	//범위
	public void friendlyNum(int area) {
			
		for (int i = 0; i <area; i++) {
			
			int a = i; 
			int b = yaksuSum(a); 
			int c = yaksuSum(b);
			
			if(a<b&&a==c) {
				System.out.println(a+"와 " +b+ "는 친화수 입니다.");
			}
		}
		
		
		
		
		
		/*for (int a = 0; a < area; a++)//A
		{
			for (int b = 0; b < area; b++)//B
			
				if(a==yaksuSum(b)&yaksuSum(a)==b) 
				{
					System.out.println(a+"와"+b+"는 친화수로 판단됨");
				}
				
			}*/
		
			
			
		}
				
	
	// 특정수의 약수의 합을 리턴하는 메소드
	private int yaksuSum(int num) { // num 약수의 합을 구하고자 하는 수 
		int result = 0;
		for (int i = 1; i < num; i++) {
			
			if(isCheck(num, i)){
				result += i; // result = result +i;
			}
			
		}
		return result ;
		
	}
	// 완전수를 범위를 입력 받고 , 완전수를 판단, 출력해주는 프로그램
	public void perfectNum(int area) {
		
		for (int i = 2; i < area; i++) {
			
			if(i==yaksuSum(i)) {
				System.out.println(i +"는 완전수로 판단 됨 ");
			}
			
			
		}
		
	}
	// 수가 약수인지 아닌지를 boolean 으로 리턴
	private boolean isCheck(int n , int c )  //n은 입력값 , c 입력값 이하의 값 n%c ==0
	{
		boolean isc= false;
		
		if(n%c == 0) {
			
			isc = true;
			
		}
		
		
		return isc;
		
	}
	
	
	
	

}
