import java.util.Scanner;

//시간복잡도 : O(N)
public class Fibonacci_다이나믹프로그래밍 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();

		System.out.println(Fibonacci(n));



	}

	public static int Fibonacci(int n) {
		int[] array = new int[100];
		if(n<=1) {
			return n;
		}else {

			if(array[n]>0) {
				return array[n];
			}
			return array[n]=Fibonacci(n-1)+Fibonacci(n-2);
			 

		}
	}

}
