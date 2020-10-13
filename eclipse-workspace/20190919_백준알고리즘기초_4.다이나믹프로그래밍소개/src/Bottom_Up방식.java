import java.util.Scanner;

//반복문
public class Bottom_Up방식 {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		
		System.out.println(Fibonacci(n));
		
		
	}
	
	public static int Fibonacci(int n) {
		int []d= new int[100];
		d[0] =0;
		d[1] =1;
		
		
		for(int i=2; i<n; i++) {
			
			d[i]= d[i-1]+d[i-2];
		}
		
		return d[n];
		
		
	}

}
