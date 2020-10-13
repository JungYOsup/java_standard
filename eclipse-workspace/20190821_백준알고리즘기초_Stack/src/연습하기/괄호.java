package 연습하기;

import java.util.Scanner;
import java.util.Stack;

public class 괄호{
    
public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		Stack<Character> stack = new Stack<>();
		boolean isc = true;
		while(num--> 0) {
		
					
			String s = scan.next();

			for(char c : s.toCharArray()) {

				if(c=='(') {
					stack.add(c);
				}else {

					if(!stack.isEmpty()) {
						stack.pop();
					}else {  //둘째, stack에 아무것도 없는데 pop()을 하면 무조건 NO
						isc = false;
						break;
					}
				}


			}

			if(!stack.isEmpty()) isc = false; //첫째, stack에 값이 있으면 무조건 NO

			if(isc) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}


		}

	}
}