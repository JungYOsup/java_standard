package min.edu;

public class Ant_Sequence {

	
	public String ant_sequence(String init ) {
		String result=""; // 이걸 써준 이유가 결국에는 문자 숫자들의 concat이니까!!
		char c = init.charAt(0); // 기준이 무조건 1이기 때문이다. 
		int count =1; // 처음에 1이 한개여서 11이 되고 .11이서 1이 두개니까 12가 된다.
		
		for (int i = 1; i < init.length(); i++) {
			
			if(c==init.charAt(i)) {// 첫번쨰와 나머지들을 비교 
				count++;
			}
			else {
				result = result +  c+ count; 
				c=init.charAt(i); //2
				count =1;
				
			}
		}
		result = result + c + count;
		
		return result;
	
		
		
	}
	
	
	
	
}
