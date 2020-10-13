
public class Ant_Sequence {
	
	
	
	public String antprocess(String init) {
		
		String result ="";
		int count =1;
		char c=init.charAt(0);
		for (int i = 1; i < init.length(); i++) {
			
			if(c==init.charAt(i)) {
				count++;
			}
			else {
				result = result + c + count;
				count =1;
				c = init.charAt(i);
			}
			
		}
		result = result + c + count;
		
		
		
		return result;
	}
	

}
