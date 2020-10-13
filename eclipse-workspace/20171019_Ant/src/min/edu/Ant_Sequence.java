package min.edu;

public class Ant_Sequence {
	//11 ->12 ->1121
	public String antProcess(String init) { // 1121->1
		
		String result =""; //결과를 누적
		int count =1; // 자신의 갯수 1개는 무조건 가지고 있음
		char c = init.charAt(0); // 기준값
		
		//비교할 반복은 입력받은 문자열의 길이
		
		for (int i = 1; i < init.length(); i++) { //2이하 까지 반복
			
			if(c==init.charAt(i)) {
				count++;
			}
			else {
			result = result +c+count;
			c =init.charAt(i);
			count =1;
			
									
			}
			
		}
		result = result +c+count;
		
		
		return result;
	}
}
