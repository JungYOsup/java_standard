package Youtube;


//피보나치 : O(2^n)이지만 , 피보나치의 최적화 빅-O표기법은?


public class Test {
	static int count=0;
	
	public static void main(String[] args) {
		
		int[] array = {1,2,3,5,8,13,21};
		
		for(int i=0; i<array.length; i++) {
			
			System.out.println(fibonacci(i, array));
		}
		System.out.println("카운트숫자"+count);
		
	}
	//피보나치의 최적화 빅-O표기법은? O(n)
	public static int fibonacci(int n , int[] r){
		
		
		count++;
		if(n<=0) return 0;
		else if (n==1) return r[n]=1;
		return r[n]=fibonacci(n-1, r) + fibonacci(n-2, r);
		
		
	}
	
	public static int fibonacci2(int n , int[] r){
		
		
		count++;
		if(n<=0) return 0;
		else if (n==1) return r[n]=1;
		else if(r[n]>0) return r[n]; //이미 계산된값은 재귀함수를 돌리지 않고 그대로 보여줌(r[n]>0이라는 말은 이미 r[n]의 값이 존재하다는 말)
		return r[n]=fibonacci(n-1, r) + fibonacci(n-2, r);
		
		
	}
	
	
	
}


