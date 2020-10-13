import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

//걸린시간 : 3:00 ~ 5:00
// 첫번째 : Stack을 2개 이용해서 사용해봤다. 비교하는 방식을 사용함
// -> 이방법은 ())( 일때 적용이 안된다. 이 문제의 답은 No 인데 Yes가 나와버림 
// -> 이 방법은 aaabba 일때 a가 짝수개냐 b가 짝수개 인지를 판단할떄 쓸수 있곗다. 

// 두번째 : Stack 하나를 이용해서 사용함 (일떄는 Stack에 넣어주고, )일때는 Stack에서 빼줌 
// -> 이 조건은 )가 stack에 들어갈경우 오류를 발생한다는 점과 ,stack에 어느것도 남아있으면 안된다는것을 알면 쉽게 풀수 있다.

// 세번째 : Stack 을 이용하지 않고 문제를 푸는방법
// -> 
public class problem_9012_괄호 {

	//	public static void main(String[] args) {
	//
	//		Scanner scan = new Scanner(System.in);
	//		int num = scan.nextInt();
	//
	//		while((num--)!=0) {
	//
	//			String s = scan.next();
	//
	//			Stack<Character> stack = new Stack<>();
	//			Stack<Character> stack2 = new Stack<>();
	//
	//			for(char c :s.toCharArray()) {
	//				stack.add(c);
	//			}
	//
	//			while(!stack.isEmpty()) {
	//				
	//				if(stack2.isEmpty()||stack.peek()!=stack2.peek()) {
	//					stack2.add(stack.pop());
	//				
	//				}else if(stack.peek()==stack2.peek()){
	//					stack.pop();
	//					stack2.pop();
	//				}
	//	
	//			}
	//			
	//			
	//			if(stack2.isEmpty()) {
	//				System.out.println("YES");
	//			}else {
	//				System.out.println("NO");
	//			}
	//
	//
	//
	//		}
	//	}

	//	public static void main(String[] args) {
	//
	//		Scanner scan = new Scanner(System.in);
	//		int num = scan.nextInt();
	//		
	//		while((num--)!=0) {
	//			boolean isVPS = true;
	//			String input = scan.next();
	//			Stack<Character> stack = new Stack<>();
	//			
	//			char temp;
	//
	//			for(int i=0; i<input.length(); i++) {
	//				temp = input.charAt(i);
	//				
	//				if(temp =='(') {
	//					stack.add(temp);
	//				}else if(temp == ')') {
	//					
	//					if(!stack.isEmpty()) {
	//						stack.pop();
	//					}else {
	//						isVPS = false;
	//						break;
	//					}
	//									
	//				}
	//			}
	//			
	//			if(!stack.isEmpty()) isVPS = false;
	//			
	//			if(isVPS) {
	//				System.out.println("YES");
	//			}else {
	//				System.out.println("NO");
	//			}
	//			
	//			
	//
	//			
	//		}
	//
	//	}

	public static String isValid(String s) {
		int n = s.length();
		int cnt = 0;
		for (int i=0; i<n; i++) {
			if (s.charAt(i) == '(') {
				cnt += 1;
			} else {
				cnt -= 1;
			}
			if (cnt < 0) {
				return "NO";
			}
		}
		if (cnt == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (n-- > 0) {
			System.out.println(isValid(sc.next()));
		}
	}
}
