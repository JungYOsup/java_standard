package min.edu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.next();
		scan.close();
		scan.next();
		
		Scanner sc = new Scanner(System.in);
		sc.nextInt();
		sc.close();
		
		
		double a = 0.1;
		double sum =0;
		for (int i = 0; i < 10; i++) {
				sum+= a;
		}
		System.out.println(sum);
	
		
	}

}
