package Kan;

public class Test {
	
	public static void main(String[] args) {
		
		
		System.out.println(power(2, 3));
		
		
	}
	
	public static int  power(int x,int n) {
		
		if(n==0) {
			return 1;
		}
		if(n==1) {
			return x;
		}
		
		
		
		//만약 짝수 일경우는 n을 반으로 나누는 작업을 반복한다
		if(even(n)) {
			return power(x, n/2)*power(x, n/2);
		}
		
		//만약 짝수가 아닐경우 
		if(!even(n)) {
			return power(x, n-1) * power(x, 1);
		}
		
		return 0;
	}
	
	//짝수
	public static boolean even(int n) {
		
		return n%2==0?true:false;
	}

}



