
public class Exam1 {

	public static int solution(String s1, String s2) {
		int answer = 0;
		int len = Math.min(s1.length(), s2.length());
		
		
		
		for(int i=0; i<len; i++) {
			boolean flag1 = true;
			boolean flag2 = true;
			for(int j=0; j<i+1; j++) {				
				if(s1.charAt(j) != s2.charAt(s2.length()-1-i+j)) {
					flag1 = false;
				}
				if(s2.charAt(j) != s1.charAt(s1.length()-1-i+j)) {
					flag2 = false;
				}	
				if(!flag1&&!flag2) break;
			}
			if(flag1 || flag2) {
				answer = s1.length() + s2.length()-i-1;
			}
			
			
		}
		
		
		
		
		
		return answer;
		
		
	}
}
