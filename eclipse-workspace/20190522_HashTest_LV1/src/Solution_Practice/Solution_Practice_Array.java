package Solution_Practice;

import java.util.Arrays;


// 참가자는 5명인데 결승전 통과자가 3명일 경우 나머지 2명을 추려내지 못하는 코드임..
// 정확하게 해결점을 찾지 못했다라고 볼수 있는 코딩
public class Solution_Practice_Array {

	public static String solution(String[] p,String[] c) {


		Arrays.sort(p);
		Arrays.sort(c);
		int i;
		
		for ( i=0; i<c.length; i++){

			if (!p[i].equals(c[i])){
				return p[i];
			}
		}
		return p[i];
	}



}

