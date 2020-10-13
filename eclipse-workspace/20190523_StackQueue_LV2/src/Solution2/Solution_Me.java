package Solution2;

import java.util.LinkedList;
import java.util.Queue;

public class Solution_Me {

	public static int solution(int bridge_length, int weight, int[] truck_weights) {
		int answer = 0;
		int sum =0;
		Queue<Integer> truckQe2 = new LinkedList<>();

		for(int i=0; i< truck_weights.length; i++) {

			truckQe2.add(truck_weights[i]);
			answer++;
			sum += truckQe2.poll();
			if(sum >weight) {
				answer+=bridge_length;
				sum=0;
			}else {
				if(i==truck_weights.length-1) {
					answer+=bridge_length;
				}
			}


		}
		return answer;
	}
}

	