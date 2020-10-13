package min.edu.ant;

public class Ant_Sequence {
	
	public String antProcess(String init) {
		String result=""; // 결과물   
		char c = init.charAt(0); //초기값
		int count =1; //처음의 카운트는 1개이니까
		
		for (int i = 1; i < init.length(); i++) {
			
			
			if (c==init.charAt(i)) {
				count++;
				
			}
			else {
				result = result+c+count;
				count =1;
				c = init.charAt(i);
				
			}
			
			
		}
		result = result+c+count;
		
		return result;
	}

}
