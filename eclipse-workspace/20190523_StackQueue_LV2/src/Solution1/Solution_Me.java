package Solution1;
import java.util.Stack;

public class Solution_Me {

	public static int solution(String arrangement) {
		int count =0;
		int perfect =0;
		Stack<String> stack = new Stack<>();
		Stack<String> stack2 = new Stack<>();
		
		for(char a : arrangement.toCharArray()) stack.push(a+"");
			
		while(!stack.isEmpty()) {
			
											
			System.out.println(stack);
			System.out.println(stack2);
			
			if(stack2.isEmpty()) {
				stack2.push(stack.pop());
			}
			
			if(!stack.peek().equals((stack2.peek()))) {
				count++;
				stack.pop();
				stack2.pop();
				
			}else {
				stack2.push(stack.pop());
			}
					
		}
			
		
		return count;
	}

}
