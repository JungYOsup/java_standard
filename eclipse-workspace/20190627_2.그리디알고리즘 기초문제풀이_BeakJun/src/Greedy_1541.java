import java.util.LinkedList;
import java.util.Scanner;

public class Greedy_1541 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		String value = scan.next();
		
		Greedy_1541(value);
		
		
	}
	
	public static void Greedy_1541(String value) {

		LinkedList<Character> arithmeticBox  = new LinkedList<>();
		LinkedList<Integer> numBox = new LinkedList<>();
		
		String num ="";
		
		for(int i=0; i<value.length(); i++) {
			
			char c=value.charAt(i);
			
			if(c=='+'||c=='-') {
				numBox.add(Integer.parseInt(num));
				arithmeticBox.add(c);
				num="";
				continue;
			}
			num += c;
			if(num.length()>5) {
				return;
			}
					
		}
		numBox.add(Integer.parseInt(num));
		int index =0;
		for(int i=0; i<arithmeticBox.size(); i++) {
					
			if(arithmeticBox.get(i)=='-') {
				index = i;
				break;
			}
		}
		
		for(int i=index+1; i<arithmeticBox.size(); i++) {
			arithmeticBox.set(i, '-');
		}

		while(!arithmeticBox.isEmpty()) {
			
			int prevNum = numBox.poll();
			int nextNum = numBox.poll();
			char arithMetic = arithmeticBox.poll();
			
			if(arithMetic =='+') {
				numBox.addFirst(prevNum+nextNum);
			}else {
				numBox.addFirst(prevNum-nextNum);
			}
			
		}
		
		System.out.println(numBox);
	}

}
