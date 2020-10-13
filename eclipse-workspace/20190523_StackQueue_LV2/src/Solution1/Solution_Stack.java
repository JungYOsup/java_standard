package Solution1;
import java.util.Stack;

public class Solution_Stack {
	 public static int solution(String arrangement) {
	        int answer = 0;
	        Stack<Integer> st = new Stack<>();
	        
	        for (int i = 0; i < arrangement.length(); i++) {
	            if (arrangement.charAt(i) == '(') {
	                st.push(i);
	            } else if (arrangement.charAt(i) == ')') {
	            	System.out.println(st.peek());
	                if (st.peek() + 1 == i) {
	                    st.pop();
	                    answer += st.size();
	                } else {
	                    st.pop();
	                    answer += 1;
	                }
	            }
	        }
	        return answer;
	    }

}
