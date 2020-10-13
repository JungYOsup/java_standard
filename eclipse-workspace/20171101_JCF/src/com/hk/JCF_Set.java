package com.hk;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JCF_Set {

	public void setTest() {
		Set<String> set = new HashSet<String>();
		String str1 = new String("질럿");
		String str2 = new String("Dog");
		String str3 = new String("Dog");
		String str4 = new String("Cat");

		
		
		/*set.add(33); // Generic이 설정 되어있습니다. */ // 무조건 String 값만 ㄷㄹ어갈수 있다.
		
		
		set.add(str1);
		set.add(str2);
		set.add(str3);
		set.add(str4);
		
/*		System.out.println(set.size()); // 결과값이 3이나옴 (중복이 안됨)
		
		System.out.println(set.contains(str1));
		System.out.println(set.contains(str2));
		System.out.println(set.contains(str3));
		System.out.println(set.contains(str4));*/
		
		Iterator<String>iter = set.iterator(); // Iterator 객체로 변경됨  // 안에들어있는 값을 꺼내기 위해서 Iterator을 쓴다.
		
		
	/*	while (iter.hasNext()) //객체가 있는지 확인하고
		{
			String str = (String) iter.next(); // Iterator 객체를 출력해서 String으로 Casting 까지 해줌
			System.out.println(str); //결과값이 cat , dog , 질럿이 나옴 (순서가 없기 때문에), stack 구조가 아니니까 
			
		}*/
		
		while (iter.hasNext()) {
			String string = (String) iter.next();
			
		}
		
		while (iter.hasNext()) //객체가 있는지 확인하고
		{	
			String t = (String) iter.next();
			if(str3==t) {
				System.out.println(t); // 기존에있던 "Dog"이 있으면 새로운 "Dog"이 추가될수 없다 , 따라서 str3==t 일때 t는 아무것도 출력이 안됨 
			}
			
			
			
			/*if(str1==(String) iter.next()) {
			String str = (String) iter.next(); // 객체를 출력해서 Casting 까지 해줌
			System.out.println((String) iter.next()); // 이미 if문 조건 부분에서 iter.next()를 통해 꺼냇기때문에 , 출력이 될수 없다.
			}
			
		} // 이렇게 두번할경우 이미 앞 While에서 전부 꺼냇기 때문에 이 부분은 출력이 안됨
*/
		

	}
	}
}


