import java.util.Scanner;

//첫째 줄에 테스트 케이스의 개수 T가 주어진다.

//각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)

//각 테스트 케이스마다 A+B를 출력한다.

public class problem_10953 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		while((num--)!=0) {
			
			String a = scan.next();
			int b = a.charAt(0)-48;
			int c = a.charAt(2)-48;
			
			System.out.println(b+c);
					
			
		}

	}

}
