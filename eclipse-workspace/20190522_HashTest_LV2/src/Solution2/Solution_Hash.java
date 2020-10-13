package Solution2;

import java.util.HashMap;

public class Solution_Hash {

	public static int solution(String[][] clothes) {

		int result=1;

		HashMap<String, Integer> hm = new HashMap<>();

		for(String[] a : clothes ) hm.put(a[1], hm.getOrDefault(a[1], 0)+1);
		
		for(String key : hm.keySet()) {
			
			result *= (hm.get(key)+1);
			

		}
		
		result = result -1;
		
		return result;
	}

}
