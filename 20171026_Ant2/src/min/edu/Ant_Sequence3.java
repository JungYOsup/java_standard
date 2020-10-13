package min.edu;

public class Ant_Sequence3 {

	public String ant_sequence(String init ) {

		String result= "";
		char ch=init.charAt(0);
		int count =1;

		for(int i=1; i<init.length(); i++) {

			if(ch==init.charAt(i)) {
				count++;
				result = result + ch + count;
			}
			else {
				result = result +ch + count;
				ch=init.charAt(i);
				count =1;
			}
			result = result +ch+count;
		}
		
		return result;
	}


}
