package min.edu;
//리터럴이란?
//컴퓨터가 계산하지 않고 인식되는 값을 이야기함 
public class Literal {

	public static void main(String[] args) {
		// 정수형 리터럴
			int n = 10; //10진수의 리터럴값
			int n2 = 0123; // 8진수의 리터럴값
			int n3 = 0xffff; //16진수의 리터럴값
		// 실수형
			float f1 = 3.14f;
			double d1 =3.14;
			
		//boolean
			
			boolean b =true;
			
		//char
			
			char c1 = 'A';
			/*char c2 = '\u0008';
			System.out.println(c2);*/
			
			String str =Integer.toHexString(c1);
			System.out.println(str+"...");
			char c3 = '\u0041';
			System.out.println(c3+"----");
			
			double aaa=2;
			double abc=3;
			
			double cal = abc/aaa ;
			
			System.out.println(cal);
			
			
		
		
		
		char hch ='가';
		
		System.out.printf("%c = %d (%#X) %n",hch,(int)hch,(int)hch);
		//
		
		//'A' 65 -> 16진수 0x41 ,44032 를 16진수로 oxAC00
		
		// 프린트
		// print , println, printf
		System.out.println("aa"+1+'C');
		System.out.printf("%s %d %c \n","aa",1,'C');
	}

}
