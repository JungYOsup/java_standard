import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

//입력 
//첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
//출력 
//총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.


//첫번째 방법 : 첫번째 방법으로 생각했던것은 그냥 수열을 통해서 하나씩 비교하면서 하는건데 그거일 경우 O(n^2)이 걸리는데 N의 크기가 백만건이므로 최대 1,000,000,000,000 (1000억)이 되니까 시간에서 효율적이지 못할듯
//두번째 방법 : Stack으로 풀어보자 
//세번째 방법 : 




public class problem_17298_오큰수 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		int[] nge = new int[n];
		String[] temp= br.readLine().split(" ");
		
		for(int i=0; i<temp.length; i++) {
			a[i] = Integer.parseInt(temp[i]);
		}
		
		Stack<Integer> stack = new Stack<>();
		stack.push(0);
		
		for(int i=1; i<n; i++) {
			if(stack.isEmpty()) {
				stack.push(i);
			}
			while(!stack.isEmpty() && a[stack.peek()]<a[i]) {
				nge[stack.pop()] = a[i];
			}
			stack.push(i);
		}
		
		
		
	}

}
