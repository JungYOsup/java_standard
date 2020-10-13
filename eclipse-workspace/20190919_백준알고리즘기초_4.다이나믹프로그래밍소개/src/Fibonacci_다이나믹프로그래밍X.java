import java.util.Scanner;

//시간복잡도 O(2^n)
//0,1,1,2,3,5,8,13 
public class Fibonacci_다이나믹프로그래밍X {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();
		
		System.out.println(Fibonacci(n));
		
		

	}
	
	public static int Fibonacci(int n) {
		if(n<=1) {
			return n;
		}else {
			return Fibonacci(n-1)+Fibonacci(n-2);
		}
	}

}
