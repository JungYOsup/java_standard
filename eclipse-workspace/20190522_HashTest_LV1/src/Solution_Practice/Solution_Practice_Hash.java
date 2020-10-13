package Solution_Practice;

import java.util.HashMap;

public class Solution_Practice_Hash {


	public static String solution(String[] p , String[] c) {

		String answer = "";
		HashMap<String, Integer> hm = new HashMap<>();
		for(String key : p) hm.put(key, hm.getOrDefault(key, 0)+1);
		for(String key : c) hm.put(key, hm.get(key)-1);
		
		for(String key : hm.keySet()) //hm에 있는 즉 map에 있는 모든 키를 가져와
			if(hm.get(key)!=0) {
				answer += key+",";
			}
		return answer;

	}

}
