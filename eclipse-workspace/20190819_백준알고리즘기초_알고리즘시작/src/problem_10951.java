import java.util.Scanner;

//입력은 여러 개의 테스트 케이스로 이루어져 있다.
//
//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)

//각 테스트 케이스마다 A+B를 출력한다.
//이 문제처럼 입력의 테스트케이스가 정해지지 않은경우에는 while(sc.hasnext())를 사용한다.
public class problem_10951 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a+b);
			
		}
		
		
	}

}
