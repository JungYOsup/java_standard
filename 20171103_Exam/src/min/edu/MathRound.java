package min.edu;

import java.util.Arrays;

public class MathRound {
	public void cal(String d, int round) {
		
		char[] number = new char[d.length()+1];
		Arrays.fill(number, '0');
		System.arraycopy(d.toCharArray(), 0, number, 1, d.length());
		int comaIndex = d.indexOf('.')+1;
		int lengthNumber = comaIndex + round;
		int cutLength = lengthNumber;
		String s = "";
		
		while(lengthNumber >0) {
			if(number[lengthNumber]>52) {
				number[lengthNumber--]= '0';
				number[lengthNumber]+=1;
			}else {
				break;
			}
			if (lengthNumber == comaIndex) {
				number[comaIndex] = '.';
				lengthNumber--;
				
			}
		}
		for (int i = 0; i < cutLength; i++) {
			s+=number[i];
		}
		System.out.println(Double.parseDouble(s));
		
	}
	

}
