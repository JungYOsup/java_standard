import java.util.Scanner;

//두 수 A와 B의 최대공약수 G는 A와 B의 공통된 약수 중에서 가장 큰 정수이다.


public class 최대공약수 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int g = 1;
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		for(int i=1; i<=Math.min(a, b); i++) {
			
			if(a%i==0&&b%i==0) {
				g =i;
			}
		}
		System.out.println("최대공약수는 : "+ g);
								
	}

}
