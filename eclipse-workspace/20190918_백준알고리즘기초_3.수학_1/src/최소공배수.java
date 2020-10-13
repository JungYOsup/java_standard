import java.util.Scanner;

//최소공배수는 최대공약수로부터 구할수 있다.
//두 수 a,b의 최대공약수를 g라고했을때
//최소공배수 l=g*(a/g)*(b/g)이다


public class 최소공배수 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int g = GCR(a, b);
		
		System.out.println("최소공배수는:" + GCD(a, b, g));
		
			
		
		
	}
	
	public static int GCR(int a , int b) {
		
		while(b!=0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a; 
	}
	
	public static int GCD(int a , int b , int g) {
		
		int l = g*(a/g)*(b/g);
		
		return l;
		
	}

}
