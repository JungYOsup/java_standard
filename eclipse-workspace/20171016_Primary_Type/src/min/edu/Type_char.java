package min.edu;

public class Type_char {
	
	public static void main(String[] args) {
		
		
		for (int i = 0; i <100 ; i++) {
			
			System.out.println(i+":"+(char)i);
			
		}
		
		char c = 'A'; //
		int i = c; // 프로모션 
		
		System.out.println(c);
		System.out.println(i);
		
		int a =65;
		char d = (char)a; //형태변환
		

		System.out.println(a);
		System.out.println(d);
		/*
		//문자형 9 와 문자형 0을 계산(뺴기)하여 int 값으로 변형해보자.
		
		char abc = '9';
		char def = '0';
		
		int f = abc-def;
		System.out.println(f);
		
		//문자형 9의 index 값을 구해보아라
		
		int k = abc;
		
		System.out.println(k);
		
		//문제 사용하고 있는 spacebar(blank)의 int 값을 확인해보자
		
		char ch = ' ';
		int space = ch;
		System.out.println(space);
		
		System.out.println((int)'　');
		*/
		
		char A = 65; // 여기서 65는 index 
		System.out.println(A);
		
		
		
		System.out.println('"'+"정요섭"+'"');
		System.out.println("\"정요섭\"");
		
		

}
}
