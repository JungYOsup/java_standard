import java.util.Arrays;
import java.util.Comparator;

public class Solution_Me {
	//int[] numbers = {6,10,2};
	 public static String solution() {
		 
		 	Integer[] a = {3, 4, 55, 12, 35};
		 	
		 	Arrays.sort(a, new Comparator<Integer>() {

				@Override
				public int compare(Integer arg0, Integer arg1) {
					// TODO Auto-generated method stub
					String a1 = String.valueOf(arg0.intValue()); //Integer을 int로 만들고 //String으로 만들어줌 
					String a2 = String.valueOf(arg1.intValue());
					if(Integer.valueOf(a1+a2)>Integer.valueOf(a2+a1)) return -1; //다시 String을 더한것을 Integer로 바꿔서 비교
					else if(Integer.valueOf(a1+a2)==Integer.valueOf(a2+a1)) return 0;
					else return 1;
				}
		 		
		 	});
		 	
		 	System.out.println(Arrays.toString(a));
		 
	        String answer = "";
	        return answer;
	    }
}
