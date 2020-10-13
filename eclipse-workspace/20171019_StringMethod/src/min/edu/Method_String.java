package min.edu;

public class Method_String {
	
	
	
	static String str = "A섭요섭 ";
	static String abc = "A섭요섭";
	
	
	
	
	
	public static void method() {
		//valueof() 어떤값이던 String으로 반환한다.
		String l = str.valueOf(10);
		System.out.println(l);
		//trim(); //문자열의 앞뒤 공백만 잘라줌
		
		String o = str.trim();
		System.out.println(o);
		
		//14. tocharArray(); // 문자열을 char로 만들어서 char 배열로 반환
		char[] z = str.toCharArray();
		System.out.println(z); //반환타입이 string이니까 붙어서 나옴

		//13. substring(begin index end index) // begin index부터 end index-1을 제외한 나머지 제거
		System.out.println(str.substring(1, 3));
		//12. subString(index) index를 기준으로 앞을 제거함
		
		
		System.out.println(str.substring(1));
		//11.split(문자열) :특정한 기준으로 문자열을 쪼갬 반환타입이 String 배열로 반환 
		String[] j = str.split("섭");
		
			
		
		//10. replace("바꿀값","바꿀내용");
		String i=str.replace("A섭", "정");
		System.out.println(i);
		//9.length() , legth; , size;
		//length()는 문자열의 길이 
		//length; 는 배열의 길이
		//size는 자료구조에서 활용된다.
		//8.lastindexOf :문자열의 뒤에서부터 검색하여 그에 해당하는 인댁스를 가져온다
		
		int h = str.lastIndexOf("섭");
		System.out.println(h);
		//7.indexOf() // 그문자열의 index값을 int로 반환한다.
		
		int g = str.indexOf("요섭");
		System.out.println(g);
		
		//6.equals("문자열"); 이 메소드는 해쉬코드가 같은지를 비교하고 boolean값을 리턴한다.
		//따라서 String을 비교할때는 ==가 아닌 equals를 써야한다 String은 같은 객체에서의 값의 해쉬코드가 같기 때문이다.
		// ==는 래퍼런스나 값을 비교할때 쓴다.
		
		boolean f = str.equals(abc);
		System.out.println(f);
		
		
		
		//5.contains(char or 문자열)이며 리턴을 boolean값 true 나 false로 돌려준다.
		boolean e =str.contains("A");
		System.out.println(e);
		
		
		//4.concat(문자열): 문자열과 문자열을 연결시켜준다.
		String d =str.concat(str);
		System.out.println(d);
		
		//3.compareToignoreCase(문자열):문자열끼리 비교를 하대 문자행으로 비교를 하여 int를 반환해주는 메소드이지만 소문자 대문자 상관없이 비교를 해준다.
		int c =str.compareToIgnoreCase("a요섭");
		System.out.println(c);
		
		//2.comepaerTo(문자열) ex) str.compareTo(문자열) 선행문자열과 아규먼트 문자열을 비교하는데 
		// 그 비교의 방법이 문자열 자체를 비교하는것이 아니라 문자형으로 각각 비교해준다. 그리고 그 차이만큼 int로 리턴해준다.
		int a=str.compareTo("a요섭");
		System.out.println(a);
		
		
		
		
		
		
		//1.charAt(index) ex) str.charAt(index) index에 해당되는 문자형을 char타입으로 리턴함
		
		char b =str.charAt(0);
		System.out.println(b);
		
		
	}
	
	

}
