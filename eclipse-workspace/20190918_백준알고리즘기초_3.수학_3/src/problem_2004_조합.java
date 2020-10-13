import java.util.Scanner;

public class problem_2004_조합 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		long n = scan.nextLong();
		long m = scan.nextLong();

		int sum_5 = 0;
		int sum_2 = 0;

		for(int i=5; i<=n; i*=5) {
			sum_5 += (n/i); 
		}
		for(int i=5; i<=(n-m); i*=5) {
			sum_5 -= (n-m)/i; 
		}
		for(int i=5; i<=m; i*=5) {
			sum_5 -= m/i; 
		}

		for(int i=2; i<=n; i*=2) {
			sum_2 += (n/i); 
		}
		for(int i=2; i<=(n-m); i*=2) {
			sum_2 -= (n-m)/i; 
		}
		for(int i=2; i<=m; i*=2) {
			sum_2 -= m/i; 
		}

		System.out.println(Math.min(sum_2,sum_5));	
		
	}

}
