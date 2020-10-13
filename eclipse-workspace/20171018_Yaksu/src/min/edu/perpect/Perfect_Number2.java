package min.edu.perpect;

import java.util.Scanner;

import min.edu.inputNumber;

// 특정 수까지의 완전수를 리턴하는 값.
// 1000까지 입력하고 그 1~1000까지의 약수를 구하고 그 약수의 합이 1~1000까지의 값과 같은지 판별하는 
//1~1000까지중 약수의 합이랑 일치하는것을 리턴해주는
public class Perfect_Number2 {
	
	public static void main(String[] args) {
		
		int n = inputNumber.scannerNum();
		
		area(n);
		
		
	}
	
	//약수를 구하는 메소드, 약수를 구해서 약수이면 true를 반환한다.
	
	public static boolean FindDivisor(int n, int a) {
		
		boolean bl= false;
		
		if(n%a ==0) {
			
			bl = true;
			
		}
		
		return bl;
	}
	
	
	//약수의 합을 구하는 메소드
	
	public static int divisorSum(int n) {
		int sum=0;
		for (int i = 1; i < n; i++) {
			
			if(FindDivisor(n,i)) {
				
				sum += i;
				
			}
			
		}
		return sum;
	}
	// 들어온 값까지의 완전수를 구하는 메소드 
	public static void area(int n ) {
		
		for (int i = 0; i < n; i++) {
			
			if(divisorSum(n)==n) {
				
				System.out.printf("입력받은수 까지의 완전수는 %d 이다",n);
				
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
}
