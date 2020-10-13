import java.util.Scanner;
import java.util.Stack;

//입력 
//한 줄에 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 공백없이 주어진다. 괄호 문자의 개수는 최대 100,000이다. 
//출력 
//잘려진 조각의 총 개수를 나타내는 정수를 한 줄에 출력한다.


//첫번째 방법 : Stack을 사용해서 풀면 되는 문제인데..이 문제를 어떻게 풀어야할지가 우선적으로 파악되어야할것 같고, 어떤것을 써야할지 , 그리고 그 푸는방법을 알았을때 디버깅을 해보는게 아니라 말로써 적어보고 그 말을 통해서 코딩을 하는게 중요한것 같다.
//그리고 나서 안될경우 디버깅을 해보자 
//두번째 방법 : 
//세번째 방법 : 

//해결방법 : Stack을 사용해서 품

public class problem_10799_쇠막대기 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		Stack<Integer> stack = new Stack<>();
		int sum =0;
		for(int i=0; i<s.length(); i++) {

			if(s.charAt(i)=='(') {
				stack.add(i);
			}else {
				
				if(stack.peek()+1 == i) {
					stack.pop();
					sum+=stack.size();
				}else {
					stack.pop();
					sum+=1;
				}
				
				
			}

		}
		
		System.out.println(sum);



	}

}
