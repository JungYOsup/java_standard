import java.util.Scanner;

//재귀
public class Top_Down방식 {

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
