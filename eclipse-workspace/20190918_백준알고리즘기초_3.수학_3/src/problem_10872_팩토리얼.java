import java.util.Scanner;

public class problem_10872_팩토리얼 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		int result =factorial(num);
		System.out.println(result);
		
	}
	
	public static int factorial(int a) {	
		
		int sum =0;
		
		if(a==0) {
			return 1;
		}else {
			return sum=a*factorial(--a);
		}
		
	}

}
