//• 세 수의 최대공약수는 다음과 같이 구할 수 있다.
//• GCD(a, b, c) = GCD(GCD(a, b), c)
//• 네 수, N개의 숫자도 위와 같은 식으로 계속해서 구할 수 있다.

import java.util.Scanner;

public class 최대공약수_세개의수일경우_유클리드호제법 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		System.out.println("최대공약수는:"+GCD(GCD(A,B),C));
		
		
	}
	
	public static int GCD(int A , int B) {
		while(B!=0) {
			int R=A%B;
			A=B;
			B=R;
			
		}
		
		return A;
		
	}

}
