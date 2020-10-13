package min.edu;

import java.util.Arrays;

public class Number14 {
	
	public static void main(String[] args) {
		//imutable
		String str = "happy";
		String[] a =str.split("p");
		
		String str1 = "happ"; //immutable 값이 변하지 않음
		String str2 = "y"; //immutable 값이 변하지 않음
		
		System.out.println(Arrays.toString(a));
		
		
		//mutable
		StringBuffer sb = new StringBuffer();
		sb.append("happ"); 
		System.out.println(sb);
		sb.append("y"); //sb의 값이 happy로변함 -> mutable
		System.out.println(sb); //결과적으로 happy가 Stringpool에 저장됨
	}


}
