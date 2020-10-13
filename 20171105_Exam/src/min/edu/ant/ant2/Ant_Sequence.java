package min.edu.ant.ant2;

public class Ant_Sequence {
	
	public String antProcess(String init) {
		int count =1;
		char c = init.charAt(0);
		String result ="";
		
		
		for (int i = 0; i < init.length(); i++) {
			
			if(c==init.charAt(i)) {
				count++;
			}
			else {
				result = result + c + count;
				c= init.charAt(i);
				count =1;
			}
			
			
		}
		result = result +c +count;
		
		return result;
		
	}
	

	
	

}
