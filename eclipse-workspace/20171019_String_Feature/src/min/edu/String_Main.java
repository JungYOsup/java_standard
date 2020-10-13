package min.edu;

public class String_Main {
	
	public static void main(String[] args) {
		String num ="1000";
		int n =100;
		
		/*n = num + n; // 원하는 값 1100 그러나 이 값은 문자열이 나옴(1001000)
		                      //그래서 숫자형 문자를 숫자로 바꿔줌;
		 																				*/		
		
		n = Integer.parseInt(num) + n; //결과값이 1100이 나옴
		
		
				
		
		
			
		String_Method st = new String_Method();
		/*st.charAt_M();*/
		/*st.compareTo_M();*/
		/*st.concat_M();*/
		/*st.contains_M();*/
		/*boolean result =st.user_Contains();
		System.out.println(result);*/
		/*st.equals_M();*/
		/*st.indeOfs_M();*/
		 /*int n =st.user_IndexOf();
		 System.out.println(n);*/
		/* st.length_M();*/
		/*st.split_M();*/
		/*st.split_M2();*/
		/*st.subString_M();*/
		/*st.toCharArray_M();*/
		 /*  st.case_M();
		   st.trim_M();*/
		/*st.valueOf_M();*/
	}

}
