package 연습하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class 에디터 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String s = br.readLine();
		int num = Integer.parseInt(br.readLine());
		
		
		
		
		Stack<Character>stack1 = new Stack<>();
		Stack<Character>stack2 = new Stack<>();
				
		for(char c : s.toCharArray()) {
			stack1.add(c);
		}
				
		while(num-->0) {
			
			String input = br.readLine();
			
			if(input.charAt(0) == 'P') {
				char c = input.charAt(2);
				stack1.add(c);
			}
			
			if(input.charAt(0) == 'L') { //input == "L" 이거는 왜 안돼는거지 ?
				if(!stack1.isEmpty()) {
					stack2.add(stack1.pop());		
				}
				
			}
			
			if(input.charAt(0) == 'D') {
				if(!stack2.isEmpty()) {
					stack1.add(stack2.pop());
				}
			}
			
			if(input.charAt(0) == 'B') {
				if(!stack1.isEmpty()) {
					stack1.pop();
				}
			}
			
			
		}
		
			
		while(!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
		
		while(!stack2.isEmpty()) {
			System.out.print(stack2.pop());
		}
		
	}

}
