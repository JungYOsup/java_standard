package com.hk;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JCF_MAP {
	
	public void mapTest() {
		//key ,value를 같이 입력해야한다.
		
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "O");
		map.put(1, "P");
		map.put(2, "K");
		
		System.out.println(map.get(1));
		System.out.println(map.get(2));
		
		Set <Integer> keys = map.keySet();
		
		Iterator<Integer> iter = keys.iterator();
		while (iter.hasNext()) {
			System.out.println(map.get(iter.next()));
			
		}
		// map은 객체를 확인 할떄는 value 가 아닌 key로만 가능하다.
		System.out.println(map.containsKey(1)); 
		System.out.println(map.containsKey("P")); 
	}

}
