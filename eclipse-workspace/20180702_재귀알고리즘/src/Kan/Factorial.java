package Kan;

public class Factorial {
	
	static int result=0;
	
	public static void main(String[] args) {
		
		System.out.println(factorial(5));
		
	}
	
	public static int factorial(int n) {
		
		if(n==0) {
			return 1;
		}
		
		result = n*factorial(n-1);
		
		return result;
			
						
		
	}
	
}


