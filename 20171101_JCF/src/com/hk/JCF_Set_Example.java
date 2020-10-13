package com.hk;

import java.util.HashSet;
import java.util.Set;

public class JCF_Set_Example {
	public void example() {
		Integer i1 = 10 , i2 = 20;
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(i1);
		set.add(i2);
		System.out.println(set); //Set은 JCF로 이미 오버라딩 되어있음 // 그래서 주소값이 안나오는거임
		
		i2 =30; // 
		set.remove(i2); //i2의 래퍼런스를 지운다는거임 , i2를 지운다는게 아님 // 그림그려서 보면 이해가능
		System.out.println(set);
	}

}
