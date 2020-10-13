import java.util.ArrayList;
import java.util.Arrays;

public class Solution_Array {

	public static int[] solution(int[] array, int[][] commands) {
		int first,last,select;
		//ArrayList<Integer> list = new ArrayList<>();
		int[] answer = new int[commands.length];
		int i=0;
		for(int[] a : commands) {
			first = a[0]; //2
			last =a[1]; //5
			select = a[2]; //3
			
			int [] array2 =Arrays.copyOfRange(array, first-1, last);
			Arrays.sort(array2);
			int result = array2[select-1];
			//list.add(result);	
			answer[i++]=result;
		}
		
		//int[] answer = list.stream().mapToInt(i->i).toArray(); //알고 있음 좋다 ~

		return answer;
	}

}
