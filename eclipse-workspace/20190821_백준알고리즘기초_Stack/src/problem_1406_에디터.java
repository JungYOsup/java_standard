import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//입력 
//첫째 줄에는 초기에 편집기에 입력되어 있는 문자열이 주어진다. 이 문자열은 영어 소문자로만 이루어져 있으며, 길이는 100,000을 넘지 않는다. 둘째 줄에는 입력할 명령어의 개수를 나타내는 정수 N(1≤N≤500,000)이 주어진다. 셋째 줄부터 N개의 줄에 걸쳐 입력할 명령어가 순서대로 주어진다. 명령어는 위의 네 가지 중 하나의 형태로만 주어진다.
//출력 
//첫째 줄에 모든 명령어를 수행하고 난 후 편집기에 입력되어 있는 문자열을 출력한다.


//첫번째 방법 : Scanner 와 System.out을 이용한 결과 시간 초과가 발생 
//두번째 방법 : 메모리초과와 속도를 위해 BufferedReader, BufferedWriter을 사용함 (통과)
//세번째 방법 : 링크드 리스트로 푸는방법 (나중에)

//해결방법 : String으로 할경우 L , D 는 시간의 영향을 크게 주지 않지만 B , P의 경우 배열로 하면 그 삭제된 배열의 공백을 채우기 위해 오른쪽 문자열이 왼쪽으로 이동해야하므로 시간이 너무 오래걸린다
//따라서 이러한 문제를 해결하기 위해 2개의 Stack을 적용해 보았다.

public class problem_1406_에디터 {

	public static void main(String[] args) throws IOException {

		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
				
		for(char c : str.toCharArray()) {
			stack1.add(c);
		}
		
		int num = Integer.parseInt(br.readLine());
			
		
		while(num-- >0) {
				
			String[] input = br.readLine().split(" ");
			char what = input[0].charAt(0);
			
			if(what =='L') {
				
				if(!stack1.isEmpty()) {
					stack2.add(stack1.pop());
				}
				
			}
			
			if(what =='D') {

				if(!stack2.isEmpty()) {
					stack1.add(stack2.pop());
				}

			}
			
			if(what =='B') {
				if(!stack1.isEmpty()) {
					stack1.pop();
				}
			}
			
			if(what =='P') {
				char c = input[1].charAt(0);
				stack1.add(c);
								
			}
			
			
		}
		
		while(!stack1.isEmpty()) {
			stack2.add(stack1.pop());
		}
		
		while(!stack2.isEmpty()) {
			bw.write(stack2.pop());
		}
		bw.flush();
	}

}
