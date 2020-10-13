package 연습;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class 단어뒤집기2 {

	public static void main(String[] args) throws IOException {

			
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String s = br.readLine()+"\n";
		
		Stack<Character> stack = new Stack<>();

		char[] c = s.toCharArray();


		for(int i=0; i<c.length; i++) {


			if(c[i]=='<') {
				
				while(!stack.isEmpty()) {
					bw.write(stack.pop());
				}

				while(c[i]!='>') {

					if(c[i]==' ' || c[i]=='\n') {

						bw.write(" ");

					}else {

						bw.write(c[i]);
					}
					i++;

				}
				bw.write('>');

			}else {
				if(c[i]==' ' || c[i]=='\n') {

					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(" ");

				}else {
					
					stack.add(c[i]);
				}

			}

		}

		bw.flush();
	}

}
