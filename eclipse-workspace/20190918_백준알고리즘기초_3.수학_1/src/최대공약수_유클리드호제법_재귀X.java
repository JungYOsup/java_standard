import java.util.Scanner;

//최대공약수를 그냥 구하는것보다 빠르게 구하는 방법

public class 최대공약수_유클리드호제법_재귀X {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("최대공약수는:" + GCR(a,b));
		

	}
	
	public static int GCR(int a, int b) {
		
		while(b!=0) {
			int r = a%b;
			a=b;
			b=r;
		}
		
		return a;
		
	}

}
