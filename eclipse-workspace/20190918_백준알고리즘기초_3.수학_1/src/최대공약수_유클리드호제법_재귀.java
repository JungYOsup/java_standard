import java.util.Scanner;

//두 수 A와 B의 최대공약수 G는 A와 B의 공통된 약수 중에서 가장 큰 정수이다.
//최대공약수를 그냥 구하는것보다 빠르게 구하는 방법
//a를 b로 나눈 나머지를 r이라고 했을 때
//GCD(a, b) = GCD(b, r) 과 같다
//r이 0이면 그 때 b가 최대 공약수이다
//ex) GCD(24, 16) = GCD(16, 8) = GCD(8, 0) = 8

public class 최대공약수_유클리드호제법_재귀 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("최대공약수는"+GCD(a, b));
		
		
		
		
	}
	
	public static int GCD(int a , int b) {
		
		if(b==0) {
			return a ;
		}else {
			return GCD(b,a%b);
		}
		
	}

}
