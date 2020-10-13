import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class problem_17413_단어뒤집기2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Stack<Character> stack = new Stack<>();

		String str = br.readLine()+"\n";
		boolean isc = false;
		for(int i=0; i<str.length(); i++) {
			
			if(str.charAt(i)=='<') {
				if(!stack.isEmpty()) {
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(str.charAt(i));
				}else {
					bw.write(str.charAt(i));
				}
					
				isc = true;
				
			}else if(str.charAt(i)=='>') {
				bw.write(str.charAt(i));
				isc = false;
			}else if(isc) {
				bw.write(str.charAt(i));
			}else {
				
				if(str.charAt(i)==' '|| str.charAt(i)=='\n'){
					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(str.charAt(i));
				}else {
					stack.add(str.charAt(i));
					
				}
			}

		}

		bw.flush();



	}

}

//반대 조건으로 했을때 안나오는 이유가 머지??
//			if(str.charAt(i)!=' '|| str.charAt(i)!='\n'){
//				stack.add(str.charAt(i));
//			}else {
//				while(!stack.isEmpty()) {
//					bw.write(stack.pop());
//				}
//				bw.write(str.charAt(i));
//				
//			}
