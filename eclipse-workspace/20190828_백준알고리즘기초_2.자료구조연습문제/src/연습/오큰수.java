package 연습;
import java.util.*;
import java.io.*;
public class 오큰수 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num = Integer.parseInt(br.readLine());
		int[] a = new int[num];
		int[] ans = new int[num];
		Stack<Integer> stack = new Stack<>();
		//why? 이거는 안됄까?
				//for(int i=0 ;i<num; i++){
		//	a[i] = br.read();  
		//}	
		// read()로 할경우 아스키코드를 int형으로 바꿔즈무로 1을 입력시 49로 가져옴
		// 그렇다면 a[i] = br.read()-48로 하면 되지 않을까?
		// No.. 이렇게 해보니까 
		// 이상하게 값을 가져오더라
		// 그래서 readLine()으로 가져오고 거기서 공백을 제거하고 temp배열에 넣어준다음. temp배열에 넣은 값을 a에 뿌려줌    	
		String[] temp = br.readLine().split(" ");


		for(int i=0; i<num; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}

		stack.add(0);

		for(int i=1; i<a.length; i++) {

			if(stack.isEmpty()) {
				stack.add(i);
			}

			while(!stack.isEmpty() && a[stack.peek()]< a[i]) {
				ans[stack.pop()] = a[i];
			}
			stack.add(i);
		}
		while(!stack.isEmpty()) {
			ans[stack.pop()] = -1;
		}

		for (int i=0; i<num; i++) {
			bw.write(ans[i] + " ");
		}
		bw.write("\n");
		bw.flush();



	}
}

