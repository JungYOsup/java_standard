package min.edu;

import java.util.Arrays;

public class Array_Main {

	public static void main(String[] args) {
	/*	배열
		참조타입이다. 뭉탱이를 한번에 가져와야하니까 !! 참조타입이 주소라는 뭉탱이를 가져오는것처럼
		선언방법
		1. char[] arrayC ={'A','B','C'}
		2. char[] arrayC2 = new char[3] // 이렇게 선언하면 배열안에 타입의 초기값이 들어가있다.. char의 초기값이 들어가있고, 참조타입일 경우 null;
		3. char[] arrayC3 = new char[]{'A','B','C'}
		*/
		
		boolean[] b = new boolean[3];
		System.out.println(Arrays.toString(b)); // 배열을 찍음 
		
		System.out.println(b.getClass()); //b가 어디서 왔는지 출력함 , 하지만 집이 없기때문에 min.edu 이런식으로 안나오는것이다. 결과물 class [Z
		System.out.println(b.hashCode());//b의 주민등록 즉 해쉬코드를 출력함; 
		
		String[] s = new String[3]; // [Ljava.lang.String;@6d06d69c 집이 출력됨;
		
		 System.out.println(Arrays.toString(s));//
		 System.out.println(s);//
		 
		 String str = "";// "" 값이 있는걸까?
		 str.charAt(0); // 문자열은 문자형이 합쳐진것이기 때문에, 문자열을 문자형으로 표현했는데 오류가 발생한것으로 보아 아무 값도 없다.
		
	}
}
