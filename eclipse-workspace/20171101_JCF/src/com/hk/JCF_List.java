package com.hk;

import java.util.ArrayList;
import java.util.List;

public class JCF_List {
	
	public void listTest() {
		//JCF는 참조타입만 입력이 가능하다 , 따라서 <> 안에 기본타입 안됨 
		List<Integer> list = new ArrayList<Integer>();
		//		List<int> list = new ArrayList<int>(); 이거 안됨
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+":"+list.get(i));
			
			
		}
		
		System.out.println(list.get(0));
		System.out.println("----------------------------");
		list.remove(2);
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i+":"+list.get(i));
			
		}
		
		List<String> list1 = new ArrayList<String>(); 
		list1.add("A");
		list1.add("B");
		list1.add("C");
		
		//contains 는 객체안의 hash코드를 확인한다. // index로 확인 불가능하다.
		System.out.println(list1.contains("A"));
		
	}

}
