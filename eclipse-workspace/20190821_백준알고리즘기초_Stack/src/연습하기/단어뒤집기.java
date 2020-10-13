package 연습하기;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class 단어뒤집기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
	
		
		String str = br.readLine(); 
		int num = Integer.parseInt(str);
		
		// int num = br.read(); 를 쓰면 불편한 이유 !! 
		// 바로 read()메서드는 값을 읽어올 때, int 값으로 변형하여 읽어 오기 때문이다.
		// 그래서 1이라는 숫자를 read()를 통해서 읽어오면 아스키코드 문자값 '1'을 읽어오므로 
		// 결국 49를 읽어 오게 됨 
		// 따라서 숫자를 읽어 올때는 readLine()으로 읽고 숫자로 변환해주는게 더 편하다
		
		Stack<Character> stack = new Stack<>(); 

		while((num--)!=0) {

			String s = br.readLine()+"\n";

			for(char c : s.toCharArray()) {

				if(c==' '|| c== '\n') {

					while(!stack.isEmpty()) {
						bw.write(stack.pop());
					}
					bw.write(c);
				}else {
					stack.add(c);
				}


			}
		}
		bw.flush();

	}
		
		
		
		

	}

