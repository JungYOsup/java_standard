package com.hk;

public class HashcodeMain {

	public static void main(String[] args) {
		
		String str = "Korea";
		System.out.println(str.hashCode());
		
		System.out.println(System.identityHashCode(str));
		
		String str1 = new String();
		String str2 = new String();
		
		System.out.println(str1.hashCode());       // 값에의해 JVM에 받은 해쉬코드가 오버라이드 된것인데 , 이 역할을 hashCode() 메서드가 해준다. 
														          //그렇기에 우리가 이 hashCode()를 오버라이드 하면은 원하는 값으로 해쉬코드를 지정해줄수 있다.
		
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(str2.hashCode());
		
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("---------------------------------------------------------------");
		
		A a1 = new A();
		A a2 = new A();
		
		System.out.println(a1.hashCode()); //JVM이 해쉬코드를 지정해준다.
		
		System.out.println(System.identityHashCode(a1));
		
		
		System.out.println(a2.hashCode());
		
		System.out.println(System.identityHashCode(a2));
		

	}

}
