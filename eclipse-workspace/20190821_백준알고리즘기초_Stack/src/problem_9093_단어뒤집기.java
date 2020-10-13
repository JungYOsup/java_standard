import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

//입력 
//첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있으며, 문장이 하나 주어진다. 단어의 길이는 최대 20, 문장의 길이는 최대 1000이다. 단어와 단어 사이에는 공백이 하나 있다.
//출력 
//각 테스트 케이스에 대해서, 입력으로 주어진 문장의 단어를 모두 뒤집어 출력한다.

//걸린시간 : 12:36 ~ 2:20
//첫번째 방법 : next()는 문장을 인식을 못해버린다. 
//두번재 방법: 대안으로 nextline()를 사용했으나 메모리 초과가 생겨버림..
//세번쨰 방법: 메모리초과와 속도를 위해 BufferedReader, BufferedWriter을 사용함 

//해결방법 : 테스트 케이스가 갯수가 주어졌다. 그렇다면 입력-출력의 결과를 보여주는게 더 좋겠다. 
public class problem_9093_단어뒤집기 {

	// 1.
	//	public static void main(String[] args) {
	//		
	//		Scanner scan = new Scanner(System.in);
	//								
	//		int num = scan.nextInt();
	//		
	//		//만약 a의 공백이 있을 경우 stack에 넣어줘서 바꿔서 돌려준다.
	//		while((num--) != 0 ) {
	//			
	//			Stack<String> stack = new Stack<>();
	//			String a = scan.next(); //이거 자체가  i am stack 을 문장으로 인식을 못해버림 a가 i만 받아버림 
	//			char[] array = a.toCharArray(); 
	//			
	//			for(int i=0; i<array.length; i++) {
	//				
	//								
	//				if(array[i]==' ' || i==array.length) {
	//					while(stack.isEmpty()) {
	//						System.out.println(stack.peek());
	//						stack.pop();
	//					}
	//				}else {
	//					stack.add(array[i]+"");
	//				}
	//								
	//				
	//			}
	//				
	//			
	//		}
	//		
	//	}

	//2.
	//	public static void main(String[] args) {
	//
	//		Scanner scan = new Scanner(System.in);
	//		int num = scan.nextInt();
	//		scan.nextLine();
	//
	//		while((num--)!=0) {
	//
	//			String a = scan.nextLine();
	//			Stack<String> stack = new Stack<>();
	//			char[] array = a.toCharArray(); 
	//			String str=""; 
	//
	//			for(int i=0; i<array.length; i++) {
	//
	//				if(array[i]!=' '){
	//					stack.add(array[i]+"");
	//				}
	//				
	//				if(array[i]==' ' || i==array.length-1) {
	//					
	//					while(!stack.isEmpty()) {
	//						str +=stack.peek();
	//						stack.pop();
	//					}
	//					str+=" ";
	//				} 
	//				
	//			}
	//			System.out.println(str);
	//
	//
	//
	//
	//		}
	//
	//
	//
	//	}



	//	//3. 
	//	public static void main(String[] args) throws IOException {
	//
	//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
	//		
	//		int t = Integer.parseInt(bf.readLine()); //bf.read or br.readLine()은 return 값이 String 이므로 int 로 사용하기 위해서는 Integer.parseInt()를 해줌 
	//		
	//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	//		
	//		while ((t--)!= 0) { //t-- > 0
	//			String str = bf.readLine() + "\n"; 
	//			Stack<Character> s = new Stack<>();
	//			for (char ch : str.toCharArray()) {
	//				if (ch == '\n' || ch == ' ') {
	//					while (!s.isEmpty()) {
	//						bw.write(s.pop());
	//					}
	//					bw.write(ch); //공백 
	//				} else {
	//					s.push(ch);
	//				}
	//			}
	//		}
	//		bw.flush();
	//
	//	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String str = br.readLine();
		int num = Integer.parseInt(str);
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
