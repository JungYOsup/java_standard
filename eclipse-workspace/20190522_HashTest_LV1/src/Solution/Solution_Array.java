package Solution;

import java.util.Arrays;

//solution Hash보다 별로 안좋은 코딩은것 같다.
//sort(); 
public class Solution_Array {

	public static String solution(String[] participant, String[] completion) {
		String answer="";
		Arrays.sort(participant);  //"ana","ccc","mislav","mislav", "stanko" , 
		Arrays.sort(completion); //"ana", "mislav","mislav"
		
		int i;
		
		for ( i=0; i<participant.length; i++){
			
			if (!participant[i].equals(completion[i])){
				answer+=participant[i];
			}
		}
		return answer;
	}
}

