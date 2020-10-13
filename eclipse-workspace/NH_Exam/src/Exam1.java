import java.util.Arrays;
import java.util.HashMap;

//스트링의 길이가 100만이니까 . -> 1000억
//log n -> 계수정렬

public class Exam1 {

	public static void main(String[] args) {
			solution2("AM 00:00:01","AM 00:00:02");
	}
	
	public static String solution2(String start, String end) {
		String answer ="";
		
		String[] start_arr = start.split(" ");
		String[] end_arr = end.split(" ");
		
		String[] start_time = start_arr[1].split(":");
		String[] end_time = end_arr[1].split(":");
		
		System.out.println(Arrays.toString(start_time));
		System.out.println(Arrays.toString(end_time));
		
		//두개가 다르면 +12시간 
		if(start_arr[0].equals("PM")&&end_arr[0].equals("AM")) {
			
		}
		
		return null;
	}
	
	public static String solution(String s) {	
		
//		String answer ="a";
//		
//		int[] count = new int[100];
//		String low = s.toLowerCase();
//				
//		
//		for(int i=0; i<count.length; i++) count[i] = 0;
//		
//		for(char value : low.toCharArray()) {
//			int hashcode = value;
//			count[hashcode]++;
//						
//		}
//		System.out.println(Arrays.toString(count));
//		
//		for(int i=0; i<count.length; i++) {
//			if(count[i] !=0) {
//				
//				char a = (char) i;
//				
//				System.out.println(a);
//			}
//		}
//		
//			
//		
//		
//		return answer;
	}

}
