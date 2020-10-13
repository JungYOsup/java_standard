import java.util.Scanner;
import java.util.Stack;

//입력
//첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 물론 같은 정수가 두 번 나오는 일은 없다.

//출력 
//입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다. push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다.

//스택 처럼 넣어줄때마다 +를 출력하고 


public class problem_9012_스택수열 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = "";
		int m = 0; //스택에 추가되어야하는 수 
		Stack<Integer> stack = new Stack<>();
		
		
		while(num-- > 0) {
			
			int n = scan.nextInt();
			
			if(n>m) {
				
				while(n>m) {
					stack.push(++m);
					str+="+";
				}
				stack.pop();
				str+="-";
						
			}else {
				boolean isc = false;
				
				if(!stack.isEmpty()) {
					
					int top = stack.peek();
					stack.pop();
					str+="-";
					if(top == n) {
						isc = true;
					}
				}
				
				if(!isc) {
					System.out.println("NO");
				}
				
			}
						
		}
				
	}

}
