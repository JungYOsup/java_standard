package min.edu.lab4;

public class Divisor_Sum {
	
	
	public static void divisor_sum(int n ) {
		
		int sum = 0;
		for (int i = 1; i < n; i++) {
			
			if(n%i==0) {
				
				print(i); // 약수를 보여주는 프린트 
				sum = sum+i;
				
			}
			
		}
	
		print(sum); // 약수의 합을 프린트
		
	}// 약수의  합을 구하는곳
	
	public static void print(int sum) {
		
		System.out.println(sum);
		
	}// 약수를 프린트 하는곳 

} 

